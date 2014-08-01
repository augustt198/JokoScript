package me.august.jokoscript.interpret.exception;

/**
 * Created by August on 7/29/14.
 * <p/>
 * Purpose Of File:
 * <p/>
 * Latest Change:
 */
public class FunctionNotFoundException extends JokoScriptException {
	public FunctionNotFoundException() {
	}

	public FunctionNotFoundException(String message) {
		super(message);
	}

	public FunctionNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public FunctionNotFoundException(Throwable cause) {
		super(cause);
	}

	public FunctionNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
