package me.august.jokoscript.interpret.runtime;

import me.august.jokoscript.antlr.gen.JokoScriptLexer;
import me.august.jokoscript.antlr.gen.JokoScriptParser;
import me.august.jokoscript.interpret.Evaluator;
import me.august.jokoscript.interpret.JokoScriptData;
import me.august.jokoscript.interpret.JokoScriptRuntime;
import me.august.jokoscript.interpret.exception.JokoScriptException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * Created by August on 7/28/14.
 * <p/>
 * Purpose Of File:
 * <p/>
 * Latest Change:
 */
public class JokoScriptEvaluator implements Evaluator {

	//private String source;

	JokoScriptRuntime runtime;

	public JokoScriptEvaluator() {
	}

	@Override
	public JokoScriptData evaluate(String source) throws JokoScriptException {
		//this.source = source;
		this.runtime = new JokoScriptRuntimeImpl(getMainContext(source));
		return runtime.run();
	}

	private JokoScriptParser.Joko_mainContext getMainContext(String source) {
		JokoScriptLexer lexer = new JokoScriptLexer(new ANTLRInputStream(source));
		JokoScriptParser parser = new JokoScriptParser(new CommonTokenStream(lexer));
		return parser.joko_main();
	}
}
