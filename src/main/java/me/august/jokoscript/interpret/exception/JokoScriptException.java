package me.august.jokoscript.interpret.exception;

/**
 * Created by August on 7/26/14.
 * <p/>
 * Purpose Of File:
 * <p/>
 * Latest Change:
 */
public class JokoScriptException extends Exception {
	public JokoScriptException() {
	}

	public JokoScriptException(String message) {
		super(message);
	}

	public JokoScriptException(String message, Throwable cause) {
		super(message, cause);
	}

	public JokoScriptException(Throwable cause) {
		super(cause);
	}

	public JokoScriptException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
