// Generated from C:/Users/patry/Desktop/Projekty/antlr-sql-project/src/main/java/com/example/antlr_sql_project/ColumnMapperLexer.g4 by ANTLR 4.13.1
package com.example.antlr_sql_project;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ColumnMapperLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		POKAZ=1, Z=2, GDZIE=3, I=4, LUB=5, OPERATOR=6, SUM=7, AVG=8, COUNT=9, 
		MAX=10, MIN=11, LPAREN=12, RPAREN=13, WORD=14, NUMBER=15, STRING=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"POKAZ", "Z", "GDZIE", "I", "LUB", "OPERATOR", "SUM", "AVG", "COUNT", 
			"MAX", "MIN", "LPAREN", "RPAREN", "WORD", "NUMBER", "STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Pokaz'", "'z'", "'gdzie'", "'i'", "'lub'", null, "'SUM'", "'AVG'", 
			"'COUNT'", "'MAX'", "'MIN'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "POKAZ", "Z", "GDZIE", "I", "LUB", "OPERATOR", "SUM", "AVG", "COUNT", 
			"MAX", "MIN", "LPAREN", "RPAREN", "WORD", "NUMBER", "STRING", "WS"
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


	public ColumnMapperLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ColumnMapperLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 13:
			WORD_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WORD_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 setText("price"); 
			break;
		case 1:
			 setText("category"); 
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0011\u0089\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005?\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0005\rn\b\r\n\r\f\rq\t\r\u0003\rs\b\r\u0001\u000e\u0004\u000ev\b\u000e"+
		"\u000b\u000e\f\u000ew\u0001\u000f\u0001\u000f\u0005\u000f|\b\u000f\n\u000f"+
		"\f\u000f\u007f\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010"+
		"\u0084\b\u0010\u000b\u0010\f\u0010\u0085\u0001\u0010\u0001\u0010\u0000"+
		"\u0000\u0011\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011\u0001\u0000\u0005\u0003\u0000AZ"+
		"__az\u0004\u000009AZ__az\u0001\u000009\u0005\u0000  09AZ__az\u0003\u0000"+
		"\t\n\r\r  \u0091\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0001#\u0001\u0000\u0000\u0000\u0003"+
		")\u0001\u0000\u0000\u0000\u0005+\u0001\u0000\u0000\u0000\u00071\u0001"+
		"\u0000\u0000\u0000\t3\u0001\u0000\u0000\u0000\u000b>\u0001\u0000\u0000"+
		"\u0000\r@\u0001\u0000\u0000\u0000\u000fD\u0001\u0000\u0000\u0000\u0011"+
		"H\u0001\u0000\u0000\u0000\u0013N\u0001\u0000\u0000\u0000\u0015R\u0001"+
		"\u0000\u0000\u0000\u0017V\u0001\u0000\u0000\u0000\u0019X\u0001\u0000\u0000"+
		"\u0000\u001br\u0001\u0000\u0000\u0000\u001du\u0001\u0000\u0000\u0000\u001f"+
		"y\u0001\u0000\u0000\u0000!\u0083\u0001\u0000\u0000\u0000#$\u0005P\u0000"+
		"\u0000$%\u0005o\u0000\u0000%&\u0005k\u0000\u0000&\'\u0005a\u0000\u0000"+
		"\'(\u0005z\u0000\u0000(\u0002\u0001\u0000\u0000\u0000)*\u0005z\u0000\u0000"+
		"*\u0004\u0001\u0000\u0000\u0000+,\u0005g\u0000\u0000,-\u0005d\u0000\u0000"+
		"-.\u0005z\u0000\u0000./\u0005i\u0000\u0000/0\u0005e\u0000\u00000\u0006"+
		"\u0001\u0000\u0000\u000012\u0005i\u0000\u00002\b\u0001\u0000\u0000\u0000"+
		"34\u0005l\u0000\u000045\u0005u\u0000\u000056\u0005b\u0000\u00006\n\u0001"+
		"\u0000\u0000\u00007?\u0002<>\u000089\u0005<\u0000\u00009?\u0005=\u0000"+
		"\u0000:;\u0005>\u0000\u0000;?\u0005=\u0000\u0000<=\u0005<\u0000\u0000"+
		"=?\u0005>\u0000\u0000>7\u0001\u0000\u0000\u0000>8\u0001\u0000\u0000\u0000"+
		">:\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?\f\u0001\u0000\u0000"+
		"\u0000@A\u0005S\u0000\u0000AB\u0005U\u0000\u0000BC\u0005M\u0000\u0000"+
		"C\u000e\u0001\u0000\u0000\u0000DE\u0005A\u0000\u0000EF\u0005V\u0000\u0000"+
		"FG\u0005G\u0000\u0000G\u0010\u0001\u0000\u0000\u0000HI\u0005C\u0000\u0000"+
		"IJ\u0005O\u0000\u0000JK\u0005U\u0000\u0000KL\u0005N\u0000\u0000LM\u0005"+
		"T\u0000\u0000M\u0012\u0001\u0000\u0000\u0000NO\u0005M\u0000\u0000OP\u0005"+
		"A\u0000\u0000PQ\u0005X\u0000\u0000Q\u0014\u0001\u0000\u0000\u0000RS\u0005"+
		"M\u0000\u0000ST\u0005I\u0000\u0000TU\u0005N\u0000\u0000U\u0016\u0001\u0000"+
		"\u0000\u0000VW\u0005(\u0000\u0000W\u0018\u0001\u0000\u0000\u0000XY\u0005"+
		")\u0000\u0000Y\u001a\u0001\u0000\u0000\u0000Z[\u0005c\u0000\u0000[\\\u0005"+
		"e\u0000\u0000\\]\u0005n\u0000\u0000]^\u0005a\u0000\u0000^_\u0001\u0000"+
		"\u0000\u0000_s\u0006\r\u0000\u0000`a\u0005k\u0000\u0000ab\u0005a\u0000"+
		"\u0000bc\u0005t\u0000\u0000cd\u0005e\u0000\u0000de\u0005g\u0000\u0000"+
		"ef\u0005o\u0000\u0000fg\u0005r\u0000\u0000gh\u0005i\u0000\u0000hi\u0005"+
		"a\u0000\u0000ij\u0001\u0000\u0000\u0000js\u0006\r\u0001\u0000ko\u0007"+
		"\u0000\u0000\u0000ln\u0007\u0001\u0000\u0000ml\u0001\u0000\u0000\u0000"+
		"nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000rZ\u0001\u0000"+
		"\u0000\u0000r`\u0001\u0000\u0000\u0000rk\u0001\u0000\u0000\u0000s\u001c"+
		"\u0001\u0000\u0000\u0000tv\u0007\u0002\u0000\u0000ut\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000x\u001e\u0001\u0000\u0000\u0000y}\u0005\'\u0000\u0000z|\u0007"+
		"\u0003\u0000\u0000{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000"+
		"\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0001"+
		"\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0081\u0005\'"+
		"\u0000\u0000\u0081 \u0001\u0000\u0000\u0000\u0082\u0084\u0007\u0004\u0000"+
		"\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000"+
		"\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0006\u0010\u0002"+
		"\u0000\u0088\"\u0001\u0000\u0000\u0000\u0007\u0000>orw}\u0085\u0003\u0001"+
		"\r\u0000\u0001\r\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}