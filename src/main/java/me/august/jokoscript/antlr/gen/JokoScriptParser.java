// Generated from /Users/August/Code/jokoscript/JokoScript/src/main/java/me/august/jokoscript/antlr/JokoScript.g4 by ANTLR 4.x

package me.august.jokoscript.antlr.gen;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JokoScriptParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, NUMBER=7, IDENT=8, STR=9, 
		L_PAREN=10, R_PAREN=11, PLUS=12, MINUS=13, MULT=14, DIV=15, WS=16;
	public static final String[] tokenNames = {
		"<INVALID>", "'new Hasmap<class,'", "'new Hasmap<function,'", "'>'", "'Hasmap<'", 
		"','", "'old Hasmap'", "NUMBER", "IDENT", "STR", "'('", "')'", "'+'", 
		"'-'", "'*'", "'/'", "WS"
	};
	public static final int
		RULE_joko_main = 0, RULE_joko_class = 1, RULE_joko_function = 2, RULE_joko_call = 3, 
		RULE_expr = 4, RULE_shiftExpr = 5, RULE_scaleExpr = 6, RULE_component = 7;
	public static final String[] ruleNames = {
		"joko_main", "joko_class", "joko_function", "joko_call", "expr", "shiftExpr", 
		"scaleExpr", "component"
	};

	@Override
	public String getGrammarFileName() { return "JokoScript.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JokoScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Joko_mainContext extends ParserRuleContext {
		public List<Joko_classContext> joko_class() {
			return getRuleContexts(Joko_classContext.class);
		}
		public List<Joko_callContext> joko_call() {
			return getRuleContexts(Joko_callContext.class);
		}
		public Joko_functionContext joko_function(int i) {
			return getRuleContext(Joko_functionContext.class,i);
		}
		public List<Joko_functionContext> joko_function() {
			return getRuleContexts(Joko_functionContext.class);
		}
		public Joko_callContext joko_call(int i) {
			return getRuleContext(Joko_callContext.class,i);
		}
		public Joko_classContext joko_class(int i) {
			return getRuleContext(Joko_classContext.class,i);
		}
		public Joko_mainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joko_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JokoScriptListener ) ((JokoScriptListener)listener).enterJoko_main(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JokoScriptListener ) ((JokoScriptListener)listener).exitJoko_main(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JokoScriptVisitor ) return ((JokoScriptVisitor<? extends T>)visitor).visitJoko_main(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Joko_mainContext joko_main() throws RecognitionException {
		Joko_mainContext _localctx = new Joko_mainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_joko_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(19);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(16); joko_call();
					}
					break;
				case T__4:
					{
					setState(17); joko_function();
					}
					break;
				case T__5:
					{
					setState(18); joko_class();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__4) | (1L << T__2))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Joko_classContext extends ParserRuleContext {
		public List<Joko_callContext> joko_call() {
			return getRuleContexts(Joko_callContext.class);
		}
		public Joko_functionContext joko_function(int i) {
			return getRuleContext(Joko_functionContext.class,i);
		}
		public List<Joko_functionContext> joko_function() {
			return getRuleContexts(Joko_functionContext.class);
		}
		public Joko_callContext joko_call(int i) {
			return getRuleContext(Joko_callContext.class,i);
		}
		public TerminalNode IDENT() { return getToken(JokoScriptParser.IDENT, 0); }
		public Joko_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joko_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JokoScriptListener ) ((JokoScriptListener)listener).enterJoko_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JokoScriptListener ) ((JokoScriptListener)listener).exitJoko_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JokoScriptVisitor ) return ((JokoScriptVisitor<? extends T>)visitor).visitJoko_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Joko_classContext joko_class() throws RecognitionException {
		Joko_classContext _localctx = new Joko_classContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_joko_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(23); match(T__5);
			setState(24); match(IDENT);
			setState(25); match(T__3);
			}
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(29);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(27); joko_call();
					}
					break;
				case T__4:
					{
					setState(28); joko_function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 || _la==T__2 );
			setState(33); match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Joko_functionContext extends ParserRuleContext {
		public List<Joko_callContext> joko_call() {
			return getRuleContexts(Joko_callContext.class);
		}
		public Joko_callContext joko_call(int i) {
			return getRuleContext(Joko_callContext.class,i);
		}
		public TerminalNode IDENT() { return getToken(JokoScriptParser.IDENT, 0); }
		public Joko_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joko_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JokoScriptListener ) ((JokoScriptListener)listener).enterJoko_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JokoScriptListener ) ((JokoScriptListener)listener).exitJoko_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JokoScriptVisitor ) return ((JokoScriptVisitor<? extends T>)visitor).visitJoko_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Joko_functionContext joko_function() throws RecognitionException {
		Joko_functionContext _localctx = new Joko_functionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_joko_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(35); match(T__4);
			setState(36); match(IDENT);
			setState(37); match(T__3);
			}
			setState(40); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(39); joko_call();
				}
				}
				setState(42); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
			setState(44); match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Joko_callContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IDENT() { return getToken(JokoScriptParser.IDENT, 0); }
		public Joko_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joko_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JokoScriptListener ) ((JokoScriptListener)listener).enterJoko_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JokoScriptListener ) ((JokoScriptListener)listener).exitJoko_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JokoScriptVisitor ) return ((JokoScriptVisitor<? extends T>)visitor).visitJoko_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Joko_callContext joko_call() throws RecognitionException {
		Joko_callContext _localctx = new Joko_callContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_joko_call);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(46); match(T__2);
			setState(47); match(IDENT);
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=1 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(48); match(T__1);
					setState(49); expr();
					}
					} 
				}
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(55); match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ShiftExprContext shiftExpr() {
			return getRuleContext(ShiftExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JokoScriptListener ) ((JokoScriptListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JokoScriptListener ) ((JokoScriptListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JokoScriptVisitor ) return ((JokoScriptVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); shiftExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShiftExprContext extends ParserRuleContext {
		public List<ScaleExprContext> scaleExpr() {
			return getRuleContexts(ScaleExprContext.class);
		}
		public TerminalNode MINUS(int i) {
			return getToken(JokoScriptParser.MINUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(JokoScriptParser.MINUS); }
		public List<TerminalNode> PLUS() { return getTokens(JokoScriptParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(JokoScriptParser.PLUS, i);
		}
		public ScaleExprContext scaleExpr(int i) {
			return getRuleContext(ScaleExprContext.class,i);
		}
		public ShiftExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JokoScriptListener ) ((JokoScriptListener)listener).enterShiftExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JokoScriptListener ) ((JokoScriptListener)listener).exitShiftExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JokoScriptVisitor ) return ((JokoScriptVisitor<? extends T>)visitor).visitShiftExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExprContext shiftExpr() throws RecognitionException {
		ShiftExprContext _localctx = new ShiftExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_shiftExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); scaleExpr();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(60);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(61); scaleExpr();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScaleExprContext extends ParserRuleContext {
		public List<TerminalNode> DIV() { return getTokens(JokoScriptParser.DIV); }
		public List<TerminalNode> MULT() { return getTokens(JokoScriptParser.MULT); }
		public TerminalNode DIV(int i) {
			return getToken(JokoScriptParser.DIV, i);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public TerminalNode MULT(int i) {
			return getToken(JokoScriptParser.MULT, i);
		}
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ScaleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaleExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JokoScriptListener ) ((JokoScriptListener)listener).enterScaleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JokoScriptListener ) ((JokoScriptListener)listener).exitScaleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JokoScriptVisitor ) return ((JokoScriptVisitor<? extends T>)visitor).visitScaleExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaleExprContext scaleExpr() throws RecognitionException {
		ScaleExprContext _localctx = new ScaleExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_scaleExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); component();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(68);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(69); component();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentContext extends ParserRuleContext {
		public TerminalNode R_PAREN() { return getToken(JokoScriptParser.R_PAREN, 0); }
		public Joko_callContext joko_call() {
			return getRuleContext(Joko_callContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(JokoScriptParser.L_PAREN, 0); }
		public TerminalNode STR() { return getToken(JokoScriptParser.STR, 0); }
		public TerminalNode NUMBER() { return getToken(JokoScriptParser.NUMBER, 0); }
		public TerminalNode IDENT() { return getToken(JokoScriptParser.IDENT, 0); }
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JokoScriptListener ) ((JokoScriptListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JokoScriptListener ) ((JokoScriptListener)listener).exitComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JokoScriptVisitor ) return ((JokoScriptVisitor<? extends T>)visitor).visitComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_component);
		try {
			setState(83);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(75); match(NUMBER);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(76); match(IDENT);
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(77); match(STR);
				}
				break;
			case L_PAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(78); match(L_PAREN);
				setState(79); expr();
				setState(80); match(R_PAREN);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 5);
				{
				setState(82); joko_call();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22X\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\6\2\26"+
		"\n\2\r\2\16\2\27\3\3\3\3\3\3\3\3\3\3\3\3\6\3 \n\3\r\3\16\3!\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\6\4+\n\4\r\4\16\4,\3\4\3\4\3\5\3\5\3\5\3\5\7\5\65\n"+
		"\5\f\5\16\58\13\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\7\7A\n\7\f\7\16\7D\13\7"+
		"\3\b\3\b\3\b\7\bI\n\b\f\b\16\bL\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\tV\n\t\3\t\3\66\2\n\2\4\6\b\n\f\16\20\2\4\3\2\16\17\3\2\20\21\\\2\25"+
		"\3\2\2\2\4\31\3\2\2\2\6%\3\2\2\2\b\60\3\2\2\2\n;\3\2\2\2\f=\3\2\2\2\16"+
		"E\3\2\2\2\20U\3\2\2\2\22\26\5\b\5\2\23\26\5\6\4\2\24\26\5\4\3\2\25\22"+
		"\3\2\2\2\25\23\3\2\2\2\25\24\3\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30"+
		"\3\2\2\2\30\3\3\2\2\2\31\32\7\3\2\2\32\33\7\n\2\2\33\34\7\5\2\2\34\37"+
		"\3\2\2\2\35 \5\b\5\2\36 \5\6\4\2\37\35\3\2\2\2\37\36\3\2\2\2 !\3\2\2\2"+
		"!\37\3\2\2\2!\"\3\2\2\2\"#\3\2\2\2#$\7\b\2\2$\5\3\2\2\2%&\7\4\2\2&\'\7"+
		"\n\2\2\'(\7\5\2\2(*\3\2\2\2)+\5\b\5\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-"+
		"\3\2\2\2-.\3\2\2\2./\7\b\2\2/\7\3\2\2\2\60\61\7\6\2\2\61\66\7\n\2\2\62"+
		"\63\7\7\2\2\63\65\5\n\6\2\64\62\3\2\2\2\658\3\2\2\2\66\67\3\2\2\2\66\64"+
		"\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\7\5\2\2:\t\3\2\2\2;<\5\f\7\2<\13\3"+
		"\2\2\2=B\5\16\b\2>?\t\2\2\2?A\5\16\b\2@>\3\2\2\2AD\3\2\2\2B@\3\2\2\2B"+
		"C\3\2\2\2C\r\3\2\2\2DB\3\2\2\2EJ\5\20\t\2FG\t\3\2\2GI\5\20\t\2HF\3\2\2"+
		"\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\17\3\2\2\2LJ\3\2\2\2MV\7\t\2\2NV\7\n"+
		"\2\2OV\7\13\2\2PQ\7\f\2\2QR\5\n\6\2RS\7\r\2\2SV\3\2\2\2TV\5\b\5\2UM\3"+
		"\2\2\2UN\3\2\2\2UO\3\2\2\2UP\3\2\2\2UT\3\2\2\2V\21\3\2\2\2\13\25\27\37"+
		"!,\66BJU";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}