package me.august.jokoscript.interpret.exception;

/**
 * Created by August on 7/26/14.
 * <p/>
 * Purpose Of File:
 * <p/>
 * Latest Change:
 */
public class UndefinedVariableException extends RuntimeException {
	public UndefinedVariableException() {
	}

	public UndefinedVariableException(String message) {
		super(message);
	}

	public UndefinedVariableException(String message, Throwable cause) {
		super(message, cause);
	}

	public UndefinedVariableException(Throwable cause) {
		super(cause);
	}

	public UndefinedVariableException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
