package me.august.jokoscript.interpret;

/**
 * Created by August on 7/26/14.
 * <p/>
 * Purpose Of File:
 * <p/>
 * Latest Change:
 */
public class JokoScriptData {

	public static enum Type {
		NUMBER, STRING, NULL
	}

	public static final JokoScriptData NULL = new JokoScriptData();

	private Type type;
	private Object value;

	public JokoScriptData(Type type, Object value) {
		this.type = type;
		this.value = value;
	}

	public JokoScriptData() {
		this.type = Type.NULL;
	}

	public Type getType() {
		return type;
	}

	public Object getValue() {
		return value;
	}

	@SuppressWarnings("unchecked")
	public <T> T getValue(Class<T> cls) {
		return (T) value;
	}

	@Override
	public String toString() {
		return "JokoScriptData{" +
				"type=" + type +
				", value='" + value + '\'' +
				'}';
	}

	public static JokoScriptData inferType(Object o) {
		if(o == null) return NULL;
		else if(o instanceof Number) {
			return new JokoScriptData(Type.NUMBER, o);
		} else if(o instanceof String) {
			return new JokoScriptData(Type.STRING, o);
		} else {
			throw new RuntimeException("Unexpected type: " + o.getClass().getName());
		}
	}
}
