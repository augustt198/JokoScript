package me.august.jokoscript.interpret.exception;

/**
 * Created by August on 7/26/14.
 * <p/>
 * Purpose Of File:
 * <p/>
 * Latest Change:
 */
public class TypeError extends JokoScriptException {
	public TypeError() {
	}

	public TypeError(String message) {
		super(message);
	}

	public TypeError(String message, Throwable cause) {
		super(message, cause);
	}

	public TypeError(Throwable cause) {
		super(cause);
	}

	public TypeError(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
