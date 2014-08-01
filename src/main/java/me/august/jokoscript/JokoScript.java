package me.august.jokoscript;

import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import me.august.jokoscript.interpret.JokoScriptData;
import me.august.jokoscript.interpret.exception.JokoScriptException;
import me.august.jokoscript.interpret.runtime.JokoScriptEvaluator;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * Created by August on 7/26/14.
 * <p/>
 * Purpose Of File:
 * <p/>
 * Latest Change:
 */
public class JokoScript {


	public static JokoScriptEvaluator EVAL = new JokoScriptEvaluator();
	//public static JokoScriptRuntime RUNTIME = new JokoScriptRuntimeImpl();

	public static void main(String[] args) throws IOException {

		OptionParser parser = new OptionParser();
		OptionSpec helpSpec = parser.acceptsAll(Arrays.asList("h", "help"), "display this message");
		OptionSpec<String> inlineCode = parser.accepts("e", "one line of code").withRequiredArg().ofType(String.class);
		OptionSpec interactive = parser.accepts("i", "interactive console").withOptionalArg();
		OptionSpec<String> inputFile = parser.acceptsAll(Arrays.asList("f", "file"), "input file").withRequiredArg().ofType(String.class);

		OptionSet set = parser.parse(args);

		if(set.has(inlineCode)) {
			evaluate(inlineCode.value(set));
		} else if(set.has(interactive)) {
			System.out.println("Entering interactive console");
			enterInteractive();
		} else if(set.has(helpSpec)) {
			parser.printHelpOn(System.out);
		} else if(set.has(inputFile)) {
			Path path = Paths.get(inputFile.value(set));
			if(!path.toFile().exists()) {
				System.err.println("File not found: " + path);
				System.exit(1);
			}
			String source = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);
			evaluate(source);
		} else {
			System.out.println("No options specified. Use -h to display help");
		}
	}

	private static void evaluate(String src) {
		try {
			JokoScriptData result = EVAL.evaluate(src);
			System.out.println("Finished with result: " + result.getValue() + " (of " + result.getType() + " type)");
		} catch(JokoScriptException e) {
			System.out.println("Encounter error evaluating JokoScript");
			e.printStackTrace();
		}
	}

	private static void enterInteractive() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.print("> ");
			String source = reader.readLine();
			if(source.isEmpty()) continue;

			long start = System.currentTimeMillis();

			JokoScriptData result = JokoScriptData.NULL;
			try {
				result = EVAL.evaluate(source);
			} catch(JokoScriptException e) {
				System.out.println("Encounter error evaluating JokoScript");
				e.printStackTrace();
			}
			long end = System.currentTimeMillis();
			System.out.println("=> " + result.getValue() + " (" + result.getType() + " type) in " + (end - start) + "ms");
		}
	}

}
