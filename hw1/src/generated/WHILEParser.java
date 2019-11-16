// Generated from WHILE.g4 by ANTLR 4.7.2

	package generated;
	import main.StateToInt;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WHILEParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, N=4, IDENT=5, WS=6;
	public static final int
		RULE_program = 0, RULE_aexpr = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "aexpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "N", "IDENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "WHILE.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WHILEParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public AexprContext aexpr() {
			return getRuleContext(AexprContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			aexpr(0);
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

	public static class AexprContext extends ParserRuleContext {
		public int sv;
		public AexprContext a1;
		public Token N;
		public Token IDENT;
		public AexprContext a2;
		public TerminalNode N() { return getToken(WHILEParser.N, 0); }
		public TerminalNode IDENT() { return getToken(WHILEParser.IDENT, 0); }
		public List<AexprContext> aexpr() {
			return getRuleContexts(AexprContext.class);
		}
		public AexprContext aexpr(int i) {
			return getRuleContext(AexprContext.class,i);
		}
		public AexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).enterAexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WHILEListener ) ((WHILEListener)listener).exitAexpr(this);
		}
	}

	public final AexprContext aexpr() throws RecognitionException {
		return aexpr(0);
	}

	private AexprContext aexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AexprContext _localctx = new AexprContext(_ctx, _parentState);
		AexprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_aexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case N:
				{
				setState(7);
				((AexprContext)_localctx).N = match(N);

						String n = ((AexprContext)_localctx).N.getText();
						((AexprContext)_localctx).sv =  Integer.parseInt(n);
					
				}
				break;
			case IDENT:
				{
				setState(9);
				((AexprContext)_localctx).IDENT = match(IDENT);

						String id = ((AexprContext)_localctx).IDENT.getText();
						((AexprContext)_localctx).sv =  (StateToInt.get(id));
					
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(30);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(28);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new AexprContext(_parentctx, _parentState);
						_localctx.a1 = _prevctx;
						_localctx.a1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_aexpr);
						setState(13);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(14);
						match(T__0);
						setState(15);
						((AexprContext)_localctx).a2 = aexpr(4);
						((AexprContext)_localctx).sv =  (((AexprContext)_localctx).a1.sv * ((AexprContext)_localctx).a2.sv); 
						}
						break;
					case 2:
						{
						_localctx = new AexprContext(_parentctx, _parentState);
						_localctx.a1 = _prevctx;
						_localctx.a1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_aexpr);
						setState(18);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(19);
						match(T__1);
						setState(20);
						((AexprContext)_localctx).a2 = aexpr(3);
						((AexprContext)_localctx).sv =  (((AexprContext)_localctx).a1.sv + ((AexprContext)_localctx).a2.sv);
						}
						break;
					case 3:
						{
						_localctx = new AexprContext(_parentctx, _parentState);
						_localctx.a1 = _prevctx;
						_localctx.a1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_aexpr);
						setState(23);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(24);
						match(T__2);
						setState(25);
						((AexprContext)_localctx).a2 = aexpr(2);
						((AexprContext)_localctx).sv =  (((AexprContext)_localctx).a1.sv - ((AexprContext)_localctx).a2.sv); 
						}
						break;
					}
					} 
				}
				setState(32);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return aexpr_sempred((AexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean aexpr_sempred(AexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b$\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\16\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\37\n\3\f\3\16\3\"\13\3\3\3\2\3\4"+
		"\4\2\4\2\2\2%\2\6\3\2\2\2\4\r\3\2\2\2\6\7\5\4\3\2\7\3\3\2\2\2\b\t\b\3"+
		"\1\2\t\n\7\6\2\2\n\16\b\3\1\2\13\f\7\7\2\2\f\16\b\3\1\2\r\b\3\2\2\2\r"+
		"\13\3\2\2\2\16 \3\2\2\2\17\20\f\5\2\2\20\21\7\3\2\2\21\22\5\4\3\6\22\23"+
		"\b\3\1\2\23\37\3\2\2\2\24\25\f\4\2\2\25\26\7\4\2\2\26\27\5\4\3\5\27\30"+
		"\b\3\1\2\30\37\3\2\2\2\31\32\f\3\2\2\32\33\7\5\2\2\33\34\5\4\3\4\34\35"+
		"\b\3\1\2\35\37\3\2\2\2\36\17\3\2\2\2\36\24\3\2\2\2\36\31\3\2\2\2\37\""+
		"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\5\3\2\2\2\" \3\2\2\2\5\r\36 ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}