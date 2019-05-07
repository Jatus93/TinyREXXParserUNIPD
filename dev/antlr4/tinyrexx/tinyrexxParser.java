// Generated from tinyrexx.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tinyrexxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, MINUS=12, PLUS=13, MUL=14, DIV=15, EQUAL=16, LT=17, 
		LEQ=18, GT=19, GEQ=20, ID=21, NUMBER=22, WS=23, ErrorChar=24;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_assign = 2, RULE_print = 3, 
		RULE_input = 4, RULE_w_loop = 5, RULE_test = 6, RULE_a_expr = 7, RULE_a_op = 8, 
		RULE_r_op = 9, RULE_i_op = 10, RULE_guardia = 11;
	public static final String[] ruleNames = {
		"program", "statement", "assign", "print", "input", "w_loop", "test", 
		"a_expr", "a_op", "r_op", "i_op", "guardia"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'say'", "'pull'", "'do'", "'while'", "'end'", "'('", "')'", 
		"'if'", "'then'", "'else'", "'-'", "'+'", "'*'", "'/'", "'=='", "'<'", 
		"'<='", "'>'", "'>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"MINUS", "PLUS", "MUL", "DIV", "EQUAL", "LT", "LEQ", "GT", "GEQ", "ID", 
		"NUMBER", "WS", "ErrorChar"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "tinyrexx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public tinyrexxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyrexxListener ) ((tinyrexxListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyrexxListener ) ((tinyrexxListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				statement();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << ID))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public W_loopContext w_loop() {
			return getRuleContext(W_loopContext.class,0);
		}
		public I_opContext i_op() {
			return getRuleContext(I_opContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyrexxListener ) ((tinyrexxListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyrexxListener ) ((tinyrexxListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				assign();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				print();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				input();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(32);
				w_loop();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(33);
				i_op();
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tinyrexxParser.ID, 0); }
		public A_exprContext a_expr() {
			return getRuleContext(A_exprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyrexxListener ) ((tinyrexxListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyrexxListener ) ((tinyrexxListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(ID);
			setState(37);
			match(T__0);
			setState(38);
			a_expr(0);
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

	public static class PrintContext extends ParserRuleContext {
		public A_exprContext a_expr() {
			return getRuleContext(A_exprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyrexxListener ) ((tinyrexxListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyrexxListener ) ((tinyrexxListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__1);
			setState(41);
			a_expr(0);
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tinyrexxParser.ID, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyrexxListener ) ((tinyrexxListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyrexxListener ) ((tinyrexxListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__2);
			setState(44);
			match(ID);
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

	public static class W_loopContext extends ParserRuleContext {
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public W_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_w_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyrexxListener ) ((tinyrexxListener)listener).enterW_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyrexxListener ) ((tinyrexxListener)listener).exitW_loop(this);
		}
	}

	public final W_loopContext w_loop() throws RecognitionException {
		W_loopContext _localctx = new W_loopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_w_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__3);
			setState(47);
			match(T__4);
			setState(48);
			test();
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				statement();
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << ID))) != 0) );
			setState(54);
			match(T__5);
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

	public static class TestContext extends ParserRuleContext {
		public List<A_exprContext> a_expr() {
			return getRuleContexts(A_exprContext.class);
		}
		public A_exprContext a_expr(int i) {
			return getRuleContext(A_exprContext.class,i);
		}
		public R_opContext r_op() {
			return getRuleContext(R_opContext.class,0);
		}
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyrexxListener ) ((tinyrexxListener)listener).enterTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyrexxListener ) ((tinyrexxListener)listener).exitTest(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			a_expr(0);
			setState(57);
			r_op();
			setState(58);
			a_expr(0);
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

	public static class A_exprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tinyrexxParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(tinyrexxParser.NUMBER, 0); }
		public List<A_exprContext> a_expr() {
			return getRuleContexts(A_exprContext.class);
		}
		public A_exprContext a_expr(int i) {
			return getRuleContext(A_exprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(tinyrexxParser.MINUS, 0); }
		public A_opContext a_op() {
			return getRuleContext(A_opContext.class,0);
		}
		public A_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyrexxListener ) ((tinyrexxListener)listener).enterA_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyrexxListener ) ((tinyrexxListener)listener).exitA_expr(this);
		}
	}

	public final A_exprContext a_expr() throws RecognitionException {
		return a_expr(0);
	}

	private A_exprContext a_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		A_exprContext _localctx = new A_exprContext(_ctx, _parentState);
		A_exprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_a_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(61);
				match(ID);
				}
				break;
			case NUMBER:
				{
				setState(62);
				match(NUMBER);
				}
				break;
			case T__6:
				{
				setState(63);
				match(T__6);
				setState(64);
				a_expr(0);
				setState(65);
				match(T__7);
				}
				break;
			case MINUS:
				{
				setState(67);
				match(MINUS);
				setState(68);
				a_expr(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new A_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_a_expr);
					setState(71);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(72);
					a_op();
					setState(73);
					a_expr(3);
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class A_opContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(tinyrexxParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(tinyrexxParser.PLUS, 0); }
		public TerminalNode MUL() { return getToken(tinyrexxParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(tinyrexxParser.DIV, 0); }
		public A_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyrexxListener ) ((tinyrexxListener)listener).enterA_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyrexxListener ) ((tinyrexxListener)listener).exitA_op(this);
		}
	}

	public final A_opContext a_op() throws RecognitionException {
		A_opContext _localctx = new A_opContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_a_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << PLUS) | (1L << MUL) | (1L << DIV))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class R_opContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(tinyrexxParser.EQUAL, 0); }
		public TerminalNode LT() { return getToken(tinyrexxParser.LT, 0); }
		public TerminalNode LEQ() { return getToken(tinyrexxParser.LEQ, 0); }
		public TerminalNode GT() { return getToken(tinyrexxParser.GT, 0); }
		public TerminalNode GEQ() { return getToken(tinyrexxParser.GEQ, 0); }
		public R_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyrexxListener ) ((tinyrexxListener)listener).enterR_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyrexxListener ) ((tinyrexxListener)listener).exitR_op(this);
		}
	}

	public final R_opContext r_op() throws RecognitionException {
		R_opContext _localctx = new R_opContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_r_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << LT) | (1L << LEQ) | (1L << GT) | (1L << GEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class I_opContext extends ParserRuleContext {
		public GuardiaContext guardia() {
			return getRuleContext(GuardiaContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public I_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyrexxListener ) ((tinyrexxListener)listener).enterI_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyrexxListener ) ((tinyrexxListener)listener).exitI_op(this);
		}
	}

	public final I_opContext i_op() throws RecognitionException {
		I_opContext _localctx = new I_opContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_i_op);
		int _la;
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(T__8);
				setState(85);
				guardia();
				setState(86);
				match(T__9);
				setState(87);
				match(T__3);
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(88);
					statement();
					}
					}
					setState(91); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << ID))) != 0) );
				setState(93);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(T__8);
				setState(96);
				guardia();
				setState(97);
				match(T__9);
				setState(98);
				match(T__3);
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(99);
					statement();
					}
					}
					setState(102); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << ID))) != 0) );
				setState(104);
				match(T__10);
				setState(105);
				match(T__3);
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(106);
					statement();
					}
					}
					setState(109); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << ID))) != 0) );
				setState(111);
				match(T__5);
				}
				break;
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

	public static class GuardiaContext extends ParserRuleContext {
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public A_exprContext a_expr() {
			return getRuleContext(A_exprContext.class,0);
		}
		public GuardiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinyrexxListener ) ((tinyrexxListener)listener).enterGuardia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinyrexxListener ) ((tinyrexxListener)listener).exitGuardia(this);
		}
	}

	public final GuardiaContext guardia() throws RecognitionException {
		GuardiaContext _localctx = new GuardiaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_guardia);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				test();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				a_expr(0);
				}
				break;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return a_expr_sempred((A_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean a_expr_sempred(A_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32z\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\6\2\34\n\2\r\2\16\2\35\3\3\3\3\3\3\3\3\3\3\5\3%\n\3"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\6\7\65\n\7\r"+
		"\7\16\7\66\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\tH\n\t\3\t\3\t\3\t\3\t\7\tN\n\t\f\t\16\tQ\13\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\6\f\\\n\f\r\f\16\f]\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6\f"+
		"g\n\f\r\f\16\fh\3\f\3\f\3\f\6\fn\n\f\r\f\16\fo\3\f\3\f\5\ft\n\f\3\r\3"+
		"\r\5\rx\n\r\3\r\2\3\20\16\2\4\6\b\n\f\16\20\22\24\26\30\2\4\3\2\16\21"+
		"\3\2\22\26\2|\2\33\3\2\2\2\4$\3\2\2\2\6&\3\2\2\2\b*\3\2\2\2\n-\3\2\2\2"+
		"\f\60\3\2\2\2\16:\3\2\2\2\20G\3\2\2\2\22R\3\2\2\2\24T\3\2\2\2\26s\3\2"+
		"\2\2\30w\3\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2"+
		"\2\35\36\3\2\2\2\36\3\3\2\2\2\37%\5\6\4\2 %\5\b\5\2!%\5\n\6\2\"%\5\f\7"+
		"\2#%\5\26\f\2$\37\3\2\2\2$ \3\2\2\2$!\3\2\2\2$\"\3\2\2\2$#\3\2\2\2%\5"+
		"\3\2\2\2&\'\7\27\2\2\'(\7\3\2\2()\5\20\t\2)\7\3\2\2\2*+\7\4\2\2+,\5\20"+
		"\t\2,\t\3\2\2\2-.\7\5\2\2./\7\27\2\2/\13\3\2\2\2\60\61\7\6\2\2\61\62\7"+
		"\7\2\2\62\64\5\16\b\2\63\65\5\4\3\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64"+
		"\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\7\b\2\29\r\3\2\2\2:;\5\20\t\2;<\5"+
		"\24\13\2<=\5\20\t\2=\17\3\2\2\2>?\b\t\1\2?H\7\27\2\2@H\7\30\2\2AB\7\t"+
		"\2\2BC\5\20\t\2CD\7\n\2\2DH\3\2\2\2EF\7\16\2\2FH\5\20\t\3G>\3\2\2\2G@"+
		"\3\2\2\2GA\3\2\2\2GE\3\2\2\2HO\3\2\2\2IJ\f\4\2\2JK\5\22\n\2KL\5\20\t\5"+
		"LN\3\2\2\2MI\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\21\3\2\2\2QO\3\2\2"+
		"\2RS\t\2\2\2S\23\3\2\2\2TU\t\3\2\2U\25\3\2\2\2VW\7\13\2\2WX\5\30\r\2X"+
		"Y\7\f\2\2Y[\7\6\2\2Z\\\5\4\3\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2"+
		"\2^_\3\2\2\2_`\7\b\2\2`t\3\2\2\2ab\7\13\2\2bc\5\30\r\2cd\7\f\2\2df\7\6"+
		"\2\2eg\5\4\3\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7\r"+
		"\2\2km\7\6\2\2ln\5\4\3\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pq\3\2"+
		"\2\2qr\7\b\2\2rt\3\2\2\2sV\3\2\2\2sa\3\2\2\2t\27\3\2\2\2ux\5\16\b\2vx"+
		"\5\20\t\2wu\3\2\2\2wv\3\2\2\2x\31\3\2\2\2\f\35$\66GO]hosw";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}