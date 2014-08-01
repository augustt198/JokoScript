package me.august.jokoscript.interpret.runtime;

import me.august.jokoscript.antlr.gen.JokoScriptParser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by August on 7/26/14.
 * <p/>
 * Purpose Of File:
 * <p/>
 * Latest Change:
 */
public class JokoScriptClass {

	private String name;
	private List<JokoScriptFunction> functions;
	private List<JokoScriptCall> calls;

	public JokoScriptClass(String name, List<JokoScriptFunction> functions, List<JokoScriptCall> calls) {
		this.name = name;
		this.functions = functions;
		this.calls = calls;
	}

	public String getName() {
		return name;
	}

	public List<JokoScriptFunction> getFunctions() {
		return functions;
	}

	public List<JokoScriptCall> getCalls() {
		return calls;
	}

	public static JokoScriptClass fromContext(JokoScriptParser.Joko_classContext context) {
		List<JokoScriptCall> calls = new ArrayList<>();
		for(JokoScriptParser.Joko_callContext callContext : context.joko_call()) {
			calls.add(JokoScriptCall.fromContext(callContext));
		}
		List<JokoScriptFunction> functions = new ArrayList<>();
		for(JokoScriptParser.Joko_functionContext callContext : context.joko_function()) {
			functions.add(JokoScriptFunction.fromContext(callContext));
		}
		return new JokoScriptClass(context.IDENT().getText(), functions, calls);
	}
}
