package me.august.jokoscript.interpret.exception;

/**
 * Created by August on 7/27/14.
 * <p/>
 * Purpose Of File:
 * <p/>
 * Latest Change:
 */
public class ArgumentException extends JokoScriptException {
	public ArgumentException() {
	}

	public ArgumentException(String message) {
		super(message);
	}

	public ArgumentException(String message, Throwable cause) {
		super(message, cause);
	}

	public ArgumentException(Throwable cause) {
		super(cause);
	}

	public ArgumentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
