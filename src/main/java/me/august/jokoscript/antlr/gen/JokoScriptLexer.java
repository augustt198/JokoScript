// Generated from /Users/August/Code/jokoscript/JokoScript/src/main/java/me/august/jokoscript/antlr/JokoScript.g4 by ANTLR 4.x

package me.august.jokoscript.antlr.gen;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JokoScriptLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, NUMBER=7, IDENT=8, STR=9, 
		L_PAREN=10, R_PAREN=11, PLUS=12, MINUS=13, MULT=14, DIV=15, WS=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'"
	};
	public static final String[] ruleNames = {
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "NUMBER", "IDENT", "STR", 
		"L_PAREN", "R_PAREN", "PLUS", "MINUS", "MULT", "DIV", "WS"
	};


	public JokoScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JokoScript.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22\u008e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\6\bc\n\b\r\b\16\bd\3\b\3\b\6\bi\n"+
		"\b\r\b\16\bj\5\bm\n\b\3\t\6\tp\n\t\r\t\16\tq\3\n\3\n\6\nv\n\n\r\n\16\n"+
		"w\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\6\21\u0089\n\21\r\21\16\21\u008a\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\6\3\2"+
		"\62;\4\2C\\c|\6\2\"\"\62;C\\c|\5\2\13\f\17\17\"\"\u0093\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5\65\3\2\2"+
		"\2\7J\3\2\2\2\tL\3\2\2\2\13T\3\2\2\2\rV\3\2\2\2\17b\3\2\2\2\21o\3\2\2"+
		"\2\23s\3\2\2\2\25{\3\2\2\2\27}\3\2\2\2\31\177\3\2\2\2\33\u0081\3\2\2\2"+
		"\35\u0083\3\2\2\2\37\u0085\3\2\2\2!\u0088\3\2\2\2#$\7p\2\2$%\7g\2\2%&"+
		"\7y\2\2&\'\7\"\2\2\'(\7J\2\2()\7c\2\2)*\7u\2\2*+\7o\2\2+,\7c\2\2,-\7r"+
		"\2\2-.\7>\2\2./\7e\2\2/\60\7n\2\2\60\61\7c\2\2\61\62\7u\2\2\62\63\7u\2"+
		"\2\63\64\7.\2\2\64\4\3\2\2\2\65\66\7p\2\2\66\67\7g\2\2\678\7y\2\289\7"+
		"\"\2\29:\7J\2\2:;\7c\2\2;<\7u\2\2<=\7o\2\2=>\7c\2\2>?\7r\2\2?@\7>\2\2"+
		"@A\7h\2\2AB\7w\2\2BC\7p\2\2CD\7e\2\2DE\7v\2\2EF\7k\2\2FG\7q\2\2GH\7p\2"+
		"\2HI\7.\2\2I\6\3\2\2\2JK\7@\2\2K\b\3\2\2\2LM\7J\2\2MN\7c\2\2NO\7u\2\2"+
		"OP\7o\2\2PQ\7c\2\2QR\7r\2\2RS\7>\2\2S\n\3\2\2\2TU\7.\2\2U\f\3\2\2\2VW"+
		"\7q\2\2WX\7n\2\2XY\7f\2\2YZ\7\"\2\2Z[\7J\2\2[\\\7c\2\2\\]\7u\2\2]^\7o"+
		"\2\2^_\7c\2\2_`\7r\2\2`\16\3\2\2\2ac\t\2\2\2ba\3\2\2\2cd\3\2\2\2db\3\2"+
		"\2\2de\3\2\2\2el\3\2\2\2fh\7\60\2\2gi\t\2\2\2hg\3\2\2\2ij\3\2\2\2jh\3"+
		"\2\2\2jk\3\2\2\2km\3\2\2\2lf\3\2\2\2lm\3\2\2\2m\20\3\2\2\2np\t\3\2\2o"+
		"n\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\22\3\2\2\2su\7$\2\2tv\t\4\2\2"+
		"ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7$\2\2z\24\3\2\2"+
		"\2{|\7*\2\2|\26\3\2\2\2}~\7+\2\2~\30\3\2\2\2\177\u0080\7-\2\2\u0080\32"+
		"\3\2\2\2\u0081\u0082\7/\2\2\u0082\34\3\2\2\2\u0083\u0084\7,\2\2\u0084"+
		"\36\3\2\2\2\u0085\u0086\7\61\2\2\u0086 \3\2\2\2\u0087\u0089\t\5\2\2\u0088"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\u008d\b\21\2\2\u008d\"\3\2\2\2\n\2djlq"+
		"uw\u008a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}