package me.august.jokoscript.interpret;

import me.august.jokoscript.antlr.gen.JokoScriptParser;
import me.august.jokoscript.interpret.exception.JokoScriptException;
import me.august.jokoscript.interpret.exception.TypeError;
import me.august.jokoscript.util.StringUtils;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Iterator;
import java.util.List;

import static me.august.jokoscript.interpret.JokoScriptData.Type.*;
/**
 * Created by August on 7/26/14.
 * <p/>
 * Purpose Of File:
 * <p/>
 * Latest Change:
 */
public class JokoScriptExpressionEvaluator implements Executable {

	private JokoScriptParser.ExprContext expression;
	private JokoScriptRuntime runtime;

	public JokoScriptExpressionEvaluator(JokoScriptParser.ExprContext expression, JokoScriptRuntime runtime) {
		this.expression = expression;
		this.runtime = runtime;
	}

	@Override
	public JokoScriptData execute() throws JokoScriptException {
		return eval(this.expression);
	}

	private JokoScriptData eval(JokoScriptParser.ExprContext expression) throws JokoScriptException {
		JokoScriptParser.ShiftExprContext shift = expression.shiftExpr();
		Iterator<ParseTree> children = shift.children.iterator();

		JokoScriptData data = evalScale((JokoScriptParser.ScaleExprContext) children.next());

		while(children.hasNext()) {
			ParseTree operator = children.next();
			JokoScriptData secondData = evalScale((JokoScriptParser.ScaleExprContext) children.next());
			if(operator.getText().equals("+")) {
				data = add(data, secondData);
			} else if(operator.getText().equals("-")) {
				data = subtract(data, secondData);
			}
		}

		return data;
	}

	private JokoScriptData evalScale(JokoScriptParser.ScaleExprContext scale) throws JokoScriptException {
		Iterator<ParseTree> children = scale.children.iterator();
		JokoScriptData data;

		try {
			data = evalComponent((JokoScriptParser.ComponentContext) children.next());
		} catch(ClassCastException e) {
			throw new RuntimeException("Expected component as first child");
		}

		while(children.hasNext()) {
			ParseTree operator = children.next();
			JokoScriptData secondData = evalComponent((JokoScriptParser.ComponentContext) children.next());
			if(operator.getText().equals("*")) {
				data = multiply(data, secondData);
			} else if(operator.getText().equals("/")) {
				data = divide(data, secondData);
			}
		}

		return data;
	}

	private JokoScriptData evalComponent(JokoScriptParser.ComponentContext context) throws JokoScriptException {
		if(context.NUMBER() != null) {
			return new JokoScriptData(NUMBER, Float.parseFloat(context.NUMBER().getText()));
		} else if(context.IDENT() != null) {
			return runtime.getVariable(context.IDENT().getText());
		} else if(context.STR() != null) {
			StringBuilder builder = new StringBuilder(context.STR().getText());
			builder.deleteCharAt(0);
			builder.deleteCharAt(builder.length() - 1);
			return new JokoScriptData(STRING, builder.toString());
		} else if(context.expr() != null) {
			return eval(context.expr());
		} else if(context.joko_call() != null) {
			List<JokoScriptParser.ExprContext> expressions = context.joko_call().expr();
			JokoScriptData[] argumentData = new JokoScriptData[expressions.size()];
			for(int i = 0; i < expressions.size(); i++) {
				argumentData[i] = runtime.evaluateExpression(expressions.get(i));
			}
			return runtime.callFunction(context.joko_call().IDENT().getText(), argumentData);
		} else {
			throw new RuntimeException("Expected component NUMBER, IDENT, STR, Expression, or Function Call.");
		}
	}

	private JokoScriptData multiply(JokoScriptData first, JokoScriptData second) throws TypeError {
		if(first.getType() == NULL) throw new TypeError("Attempted to multiply on a null value");
		if(second.getType() != NUMBER){
			throw new TypeError("Cannot multiply by a " + second.getType().name().toLowerCase());
		}

		if(first.getType() == NUMBER) {
			return new JokoScriptData(NUMBER, ((float) first.getValue()) * ((float) second.getValue()));
		} else { // first type = Type.STRING
			return new JokoScriptData(STRING, StringUtils.repeat((String) first.getValue(), (int) second.getValue()));
		}
	}

	private JokoScriptData divide(JokoScriptData first, JokoScriptData second) throws TypeError {
		if(first.getType() == NULL) throw new TypeError("Attempted to divide on a null value");
		if(first.getType() == STRING) throw new TypeError("Attempted to divide on a String value");
		if(second.getType() != NUMBER) throw new TypeError("Division can only be applied to numbers");
		return new JokoScriptData(NUMBER, ((float) first.getValue()) / ((float) second.getValue()));
	}

	private JokoScriptData add(JokoScriptData first, JokoScriptData second) throws TypeError {
		if(first.getType() == NULL) throw new TypeError("Attempted to add on a null value");

		if(first.getType() == NUMBER) {
			if(second.getType() != NUMBER) throw new TypeError("Attempted to add a " + second.getType().name().toLowerCase() + " to a number");
			return new JokoScriptData(NUMBER, ((float) first.getValue()) + ((float) second.getValue()));
		} else { // first type = Type.STRING
			return new JokoScriptData(STRING, first.getValue() + String.valueOf(second.getValue()));
		}
	}

	private JokoScriptData subtract(JokoScriptData first, JokoScriptData second) throws TypeError {
		if(first.getType() == NULL) throw new TypeError("Attempted to subtract on a null value");
		if(first.getType() == STRING) throw new TypeError("Attempted to subtract from a String value");
		if(second.getType() != NUMBER) throw new TypeError("Subtraction can only be applied to numbers");
		return new JokoScriptData(NUMBER, ((float) first.getValue()) - ((float) second.getValue()));
	}

}
