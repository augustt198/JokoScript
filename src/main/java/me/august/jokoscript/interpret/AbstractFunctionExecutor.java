package me.august.jokoscript.interpret;

/**
 * Created by August on 7/28/14.
 * <p/>
 * Purpose Of File:
 * <p/>
 * Latest Change:
 */
public abstract class AbstractFunctionExecutor implements FunctionExecutor {

	private String name;

	protected AbstractFunctionExecutor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
