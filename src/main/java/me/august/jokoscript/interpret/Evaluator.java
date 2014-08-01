package me.august.jokoscript.interpret;

import me.august.jokoscript.interpret.exception.JokoScriptException;

/**
 * Created by August on 7/26/14.
 * <p/>
 * Purpose Of File:
 * <p/>
 * Latest Change:
 */
public interface Evaluator {

	JokoScriptData evaluate(String src) throws JokoScriptException;

}
