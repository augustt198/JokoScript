package me.august.jokoscript.interpret.runtime;

import me.august.jokoscript.antlr.gen.JokoScriptParser;
import me.august.jokoscript.interpret.FunctionExecutor;
import me.august.jokoscript.interpret.JokoScriptData;
import me.august.jokoscript.interpret.JokoScriptExpressionEvaluator;
import me.august.jokoscript.interpret.JokoScriptRuntime;
import me.august.jokoscript.interpret.exception.FunctionNotFoundException;
import me.august.jokoscript.interpret.exception.JokoScriptException;
import me.august.jokoscript.interpret.exception.UndefinedVariableException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by August on 7/26/14.
 * <p/>
 * Purpose Of File:
 * <p/>
 * Latest Change:
 */
public class JokoScriptRuntimeImpl implements JokoScriptRuntime {

	private List<JokoScriptCall> calls = new ArrayList<>(); // top level calls
	private List<FunctionExecutor> functions = new ArrayList<>(); // top level functions
	private List<JokoScriptClass> classes = new ArrayList<>();

	private Map<String, JokoScriptData> variableLookup = new HashMap<>();

	private JokoScriptParser.Joko_mainContext mainContext;

	public JokoScriptRuntimeImpl(JokoScriptParser.Joko_mainContext mainContext) {
		this.mainContext = mainContext;

		functions.addAll(StandardFunctions.collectFunctionExecutors()); // Load standard functions
	}

	public JokoScriptData run() throws JokoScriptException {
		JokoScriptData lastCall = JokoScriptData.NULL;
		for(ParseTree child : mainContext.children) {
			if(child instanceof JokoScriptParser.Joko_callContext) {
				JokoScriptCall call = JokoScriptCall.fromContext((JokoScriptParser.Joko_callContext) child);
				calls.add(call);
				lastCall = call.evaluate(this);
			} else if(child instanceof JokoScriptParser.Joko_functionContext) {
				JokoScriptFunction function = JokoScriptFunction.fromContext((JokoScriptParser.Joko_functionContext) child);
				functions.add(function);
			} else if(child instanceof JokoScriptParser.Joko_classContext) {
				JokoScriptClass cls = JokoScriptClass.fromContext((JokoScriptParser.Joko_classContext) child);
				classes.add(cls);
				for(JokoScriptCall call : cls.getCalls()) {
					call.evaluate(this);
				}
			}
		}
		return lastCall;
	}

	@Override
	public JokoScriptData evaluateExpression(JokoScriptParser.ExprContext expr) throws JokoScriptException {
		return new JokoScriptExpressionEvaluator(expr, this).execute();
	}

	@Override
	public JokoScriptData callFunction(String name, JokoScriptData[] data) throws JokoScriptException {
		FunctionExecutor func = null;
		for(FunctionExecutor executor : functions) {
			if(executor.getName().equals(name)) func = executor;
		}
		if(func == null) throw new FunctionNotFoundException("Method not found: " + name);
		return func.execute(this, data);
	}

	@Override
	public JokoScriptData getVariable(String name) {
		JokoScriptData data = variableLookup.get(name);
		if(data == null) throw new UndefinedVariableException("Undefined variable: " + name);
		return data;
	}

	@Override
	public void setVariable(String name, JokoScriptData data) {
		variableLookup.put(name, data);
	}

}
