package me.august.jokoscript.interpret.runtime;

import me.august.jokoscript.interpret.AbstractFunctionExecutor;
import me.august.jokoscript.interpret.FunctionExecutor;
import me.august.jokoscript.interpret.JokoScriptData;
import me.august.jokoscript.interpret.JokoScriptRuntime;
import me.august.jokoscript.interpret.exception.ArgumentException;
import me.august.jokoscript.interpret.exception.JokoScriptException;
import me.august.jokoscript.interpret.exception.TypeError;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by August on 7/27/14.
 * <p/>
 * Purpose Of File:
 * <p/>
 * Latest Change:
 */
public class StandardFunctions {

	private static final Random RAND = new Random();

	public static final FunctionExecutor EXIT_FUNC = new AbstractFunctionExecutor("exit") {
		@Override
		public JokoScriptData execute(JokoScriptRuntime runtime, JokoScriptData... arguments) throws JokoScriptException {
			if(arguments.length > 1) throw new ArgumentException("Expected 0-1 arguments");
			int status = 0;
			if(arguments.length == 1) {
				JokoScriptData data = arguments[0];
				if(data.getType() != JokoScriptData.Type.NUMBER) throw new TypeError("Expected number");
				status = (int) (float) data.getValue();
			}
			System.exit(status);
			return JokoScriptData.NULL;
		}
	};

	public static final FunctionExecutor PRINTLN_FUNC = new AbstractFunctionExecutor("println") {
		@Override
		public JokoScriptData execute(JokoScriptRuntime runtime, JokoScriptData... arguments) {
			if(arguments.length == 0) System.out.println();
			for(JokoScriptData data : arguments) {
				System.out.println(data.getValue());
			}
			return JokoScriptData.NULL;
		}
	};

	public static final FunctionExecutor PRINT_FUNC = new AbstractFunctionExecutor("print") {
		@Override
		public JokoScriptData execute(JokoScriptRuntime runtime, JokoScriptData... arguments) throws JokoScriptException {
			if(arguments.length < 1) throw new ArgumentException("Expected 1+ arguments");
			for(JokoScriptData data : arguments) {
				System.out.print(data.getValue());
			}
			return JokoScriptData.NULL;
		}
	};

	public static final FunctionExecutor PRINT_ERR_LN_FUNC = new AbstractFunctionExecutor("printerrln") {
		@Override
		public JokoScriptData execute(JokoScriptRuntime runtime, JokoScriptData... arguments) throws JokoScriptException {
			if(arguments.length == 0) System.err.println();
			for(JokoScriptData data : arguments) {
				System.err.println(data.getValue());
			}
			return JokoScriptData.NULL;
		}
	};

	public static final FunctionExecutor PRINT_ERR_FUNC = new AbstractFunctionExecutor("printerr") {
		@Override
		public JokoScriptData execute(JokoScriptRuntime runtime, JokoScriptData... arguments) throws JokoScriptException {
			if(arguments.length < 1) throw new ArgumentException("Expected 1+ arguments");
			for(JokoScriptData data : arguments) {
				System.err.print(data.getValue());
			}
			return JokoScriptData.NULL;
		}
	};

	public static final FunctionExecutor TYPE_OF_FUNC = new AbstractFunctionExecutor("typeof") {
		@Override
		public JokoScriptData execute(JokoScriptRuntime runtime, JokoScriptData... arguments) throws JokoScriptException {
			if(arguments.length != 1) throw new ArgumentException("Expected 1 argument");
			return JokoScriptData.inferType(arguments[0].getType().name());
		}
	};

	public static final FunctionExecutor COS_FUNC = new AbstractFunctionExecutor("cos") {
		@Override
		public JokoScriptData execute(JokoScriptRuntime runtime, JokoScriptData... arguments) throws JokoScriptException {
			if(arguments.length != 1) throw new ArgumentException("Expected 1 argument");
			JokoScriptData data = arguments[0];
			if(data.getType() != JokoScriptData.Type.NUMBER) throw new TypeError("Expected number");
			return JokoScriptData.inferType((float) Math.cos((float) data.getValue()));
		}
	};

	public static final FunctionExecutor SIN_FUNC = new AbstractFunctionExecutor("sin") {
		@Override
		public JokoScriptData execute(JokoScriptRuntime runtime, JokoScriptData... arguments) throws JokoScriptException {
			if(arguments.length != 1) throw new ArgumentException("Expected 1 argument");
			JokoScriptData data = arguments[0];
			if(data.getType() != JokoScriptData.Type.NUMBER) throw new TypeError("Expected number");
			return JokoScriptData.inferType((float) Math.sin((float) data.getValue()));
		}
	};

	public static final FunctionExecutor TAN_FUNC = new AbstractFunctionExecutor("tan") {
		@Override
		public JokoScriptData execute(JokoScriptRuntime runtime, JokoScriptData... arguments) throws JokoScriptException {
			if(arguments.length != 1) throw new ArgumentException("Expected 1 argument");
			JokoScriptData data = arguments[0];
			if(data.getType() != JokoScriptData.Type.NUMBER) throw new TypeError("Expected number");
			return JokoScriptData.inferType((float) Math.tan((float) data.getValue()));
		}
	};

	public static final FunctionExecutor RAD_TO_DEG_FUNC = new AbstractFunctionExecutor("radToDeg") {
		@Override
		public JokoScriptData execute(JokoScriptRuntime runtime, JokoScriptData... arguments) throws JokoScriptException {
			if(arguments.length != 1) throw new ArgumentException("Expected 1 argument");
			JokoScriptData data = arguments[0];
			if(data.getType() != JokoScriptData.Type.NUMBER) throw new TypeError("Expected number");
			return JokoScriptData.inferType((float) Math.toDegrees((float) data.getValue()));
		}
	};

	public static final FunctionExecutor DEG_TO_RAD_FUNC = new AbstractFunctionExecutor("degToRad") {
		@Override
		public JokoScriptData execute(JokoScriptRuntime runtime, JokoScriptData... arguments) throws JokoScriptException {
			if(arguments.length != 1) throw new ArgumentException("Expected 1 argument");
			JokoScriptData data = arguments[0];
			if(data.getType() != JokoScriptData.Type.NUMBER) throw new TypeError("Expected number");
			return JokoScriptData.inferType((float) Math.toRadians((float) data.getValue()));
		}
	};

	public static final FunctionExecutor RANDOM_FUNC = new AbstractFunctionExecutor("random") {
		@Override
		public JokoScriptData execute(JokoScriptRuntime runtime, JokoScriptData... arguments) throws JokoScriptException {
			if(arguments.length > 2) throw new ArgumentException("Expected 0-2 arguments");
			if(arguments.length == 0) {
				return JokoScriptData.inferType((float) RAND.nextInt());
			} else if(arguments.length == 1) {
				if(arguments[0].getType() != JokoScriptData.Type.NUMBER) throw new TypeError("Expected number");
				return JokoScriptData.inferType((float) RAND.nextInt((int) (float) arguments[0].getValue()));
			} else {
				if(arguments[0].getType() != JokoScriptData.Type.NUMBER || arguments[1].getType() != JokoScriptData.Type.NUMBER)
					throw new TypeError("Expected number");
				int min = (int) (float) arguments[0].getValue();
				int max = (int) (float) arguments[1].getValue();
				return JokoScriptData.inferType((float) (RAND.nextInt(max - min + 1) + max));
			}
		}
	};

	private StandardFunctions() {
	}

	public static List<FunctionExecutor> collectFunctionExecutors() {
		FunctionExecutor[] executors = {
				EXIT_FUNC,
				PRINTLN_FUNC, PRINT_FUNC, PRINT_ERR_LN_FUNC, PRINT_ERR_FUNC,
				TYPE_OF_FUNC,
				COS_FUNC, SIN_FUNC, TAN_FUNC,
				RAD_TO_DEG_FUNC, DEG_TO_RAD_FUNC,
				RANDOM_FUNC
		};
		return Arrays.asList(executors);
	}

}
