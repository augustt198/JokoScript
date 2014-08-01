package me.august.jokoscript.interpret.runtime;

import me.august.jokoscript.antlr.gen.JokoScriptParser;
import me.august.jokoscript.interpret.JokoScriptData;
import me.august.jokoscript.interpret.JokoScriptRuntime;
import me.august.jokoscript.interpret.exception.JokoScriptException;

import java.util.List;

/**
 * Created by August on 7/26/14.
 * <p/>
 * Purpose Of File:
 * <p/>
 * Latest Change:
 */
public class JokoScriptCall {

	private String functionName;
	private List<JokoScriptParser.ExprContext> arguments;

	public JokoScriptCall(String functionName, List<JokoScriptParser.ExprContext> arguments) {
		this.functionName = functionName;
		this.arguments = arguments;
	}

	public JokoScriptData evaluate(JokoScriptRuntime runtime) throws JokoScriptException {
		JokoScriptData[] argumentData = new JokoScriptData[arguments.size()];
		for(int i = 0; i < arguments.size(); i++) {
			argumentData[i] = runtime.evaluateExpression(arguments.get(i));
		}
		return runtime.callFunction(functionName, argumentData);
	}

	public String getFunctionName() {
		return functionName;
	}

	public List<JokoScriptParser.ExprContext> getArguments() {
		return arguments;
	}

	public static JokoScriptCall fromContext(JokoScriptParser.Joko_callContext context) {
		return new JokoScriptCall(context.IDENT().getText(), context.expr());
	}
}
