package me.august.jokoscript.interpret.runtime;

import me.august.jokoscript.antlr.gen.JokoScriptParser;
import me.august.jokoscript.interpret.FunctionExecutor;
import me.august.jokoscript.interpret.JokoScriptData;
import me.august.jokoscript.interpret.JokoScriptRuntime;
import me.august.jokoscript.interpret.exception.JokoScriptException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by August on 7/26/14.
 * <p/>
 * Purpose Of File:
 * <p/>
 * Latest Change:
 */
public class JokoScriptFunction implements FunctionExecutor {

	private String name;
	private List<JokoScriptCall> calls;

	public JokoScriptFunction(String name, List<JokoScriptCall> calls) {
		this.name = name;
		this.calls = calls;
	}

	@Override
	public JokoScriptData execute(JokoScriptRuntime runtime, JokoScriptData... arguments) throws JokoScriptException {
		JokoScriptData result = JokoScriptData.NULL;
		for(JokoScriptCall call : getCalls()) {
			result = call.evaluate(runtime);
		}
		return result;
	}

	public String getName() {
		return name;
	}

	public List<JokoScriptCall> getCalls() {
		return calls;
	}

	public static JokoScriptFunction fromContext(JokoScriptParser.Joko_functionContext context) {
		List<JokoScriptCall> calls = new ArrayList<>();
		for(JokoScriptParser.Joko_callContext callContext : context.joko_call()) {
			calls.add(JokoScriptCall.fromContext(callContext));
		}
		return new JokoScriptFunction(context.IDENT().getText(), calls);
	}
}
