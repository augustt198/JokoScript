package me.august.jokoscript.interpret;

import me.august.jokoscript.interpret.exception.JokoScriptException;

/**
 * Created by August on 7/27/14.
 * <p/>
 * Purpose Of File:
 * <p/>
 * Latest Change:
 */
public interface FunctionExecutor {

	JokoScriptData execute(JokoScriptRuntime runtime, JokoScriptData... arguments) throws JokoScriptException;
	String getName();

}
