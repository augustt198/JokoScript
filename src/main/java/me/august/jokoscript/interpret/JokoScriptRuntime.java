package me.august.jokoscript.interpret;

import me.august.jokoscript.antlr.gen.JokoScriptParser;
import me.august.jokoscript.interpret.exception.JokoScriptException;

/**
 * Created by August on 7/26/14.
 * <p/>
 * Purpose Of File:
 * <p/>
 * Latest Change:
 */
public interface JokoScriptRuntime {

	JokoScriptData callFunction(String name, JokoScriptData... arguments) throws JokoScriptException;
	JokoScriptData getVariable(String name);
	void setVariable(String name, JokoScriptData data);
	JokoScriptData evaluateExpression(JokoScriptParser.ExprContext expr) throws JokoScriptException;

	JokoScriptData run() throws JokoScriptException; // main entry point

}
