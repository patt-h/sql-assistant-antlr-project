// Generated from C:/Users/patry/Desktop/Projekty/antlr-sql-project/src/main/java/com/example/antlr_sql_project/SQLQueryLexer.g4 by ANTLR 4.13.1
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
public class SQLQueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		POKAZ=1, WSZYSTKO=2, Z=3, GDZIE=4, I=5, LUB=6, LPAREN=7, RPAREN=8, OPERATOR=9, 
		SUM=10, AVG=11, COUNT=12, MAX=13, MIN=14, WORD=15, NUMBER=16, STRING=17, 
		WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"POKAZ", "WSZYSTKO", "Z", "GDZIE", "I", "LUB", "LPAREN", "RPAREN", "OPERATOR", 
			"SUM", "AVG", "COUNT", "MAX", "MIN", "WORD", "NUMBER", "STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Pokaz'", "'wszystko'", "'z'", "'gdzie'", "'i'", "'lub'", "'('", 
			"')'", null, "'SUM'", "'AVG'", "'COUNT'", "'MAX'", "'MIN'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "POKAZ", "WSZYSTKO", "Z", "GDZIE", "I", "LUB", "LPAREN", "RPAREN", 
			"OPERATOR", "SUM", "AVG", "COUNT", "MAX", "MIN", "WORD", "NUMBER", "STRING", 
			"WS"
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


	public SQLQueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SQLQueryLexer.g4"; }

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
		case 1:
			WSZYSTKO_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WSZYSTKO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 setText("*"); 
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0012\u0083\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bP\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0005"+
		"\u000ej\b\u000e\n\u000e\f\u000em\t\u000e\u0001\u000f\u0004\u000fp\b\u000f"+
		"\u000b\u000f\f\u000fq\u0001\u0010\u0001\u0010\u0005\u0010v\b\u0010\n\u0010"+
		"\f\u0010y\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0004\u0011~\b\u0011"+
		"\u000b\u0011\f\u0011\u007f\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012\u0001\u0000\u0005\u0003\u0000AZ__az\u0004"+
		"\u000009AZ__az\u0001\u000009\u0005\u0000  09AZ__az\u0003\u0000\t\n\r\r"+
		"  \u0089\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0001%\u0001"+
		"\u0000\u0000\u0000\u0003+\u0001\u0000\u0000\u0000\u00056\u0001\u0000\u0000"+
		"\u0000\u00078\u0001\u0000\u0000\u0000\t>\u0001\u0000\u0000\u0000\u000b"+
		"@\u0001\u0000\u0000\u0000\rD\u0001\u0000\u0000\u0000\u000fF\u0001\u0000"+
		"\u0000\u0000\u0011O\u0001\u0000\u0000\u0000\u0013Q\u0001\u0000\u0000\u0000"+
		"\u0015U\u0001\u0000\u0000\u0000\u0017Y\u0001\u0000\u0000\u0000\u0019_"+
		"\u0001\u0000\u0000\u0000\u001bc\u0001\u0000\u0000\u0000\u001dg\u0001\u0000"+
		"\u0000\u0000\u001fo\u0001\u0000\u0000\u0000!s\u0001\u0000\u0000\u0000"+
		"#}\u0001\u0000\u0000\u0000%&\u0005P\u0000\u0000&\'\u0005o\u0000\u0000"+
		"\'(\u0005k\u0000\u0000()\u0005a\u0000\u0000)*\u0005z\u0000\u0000*\u0002"+
		"\u0001\u0000\u0000\u0000+,\u0005w\u0000\u0000,-\u0005s\u0000\u0000-.\u0005"+
		"z\u0000\u0000./\u0005y\u0000\u0000/0\u0005s\u0000\u000001\u0005t\u0000"+
		"\u000012\u0005k\u0000\u000023\u0005o\u0000\u000034\u0001\u0000\u0000\u0000"+
		"45\u0006\u0001\u0000\u00005\u0004\u0001\u0000\u0000\u000067\u0005z\u0000"+
		"\u00007\u0006\u0001\u0000\u0000\u000089\u0005g\u0000\u00009:\u0005d\u0000"+
		"\u0000:;\u0005z\u0000\u0000;<\u0005i\u0000\u0000<=\u0005e\u0000\u0000"+
		"=\b\u0001\u0000\u0000\u0000>?\u0005i\u0000\u0000?\n\u0001\u0000\u0000"+
		"\u0000@A\u0005l\u0000\u0000AB\u0005u\u0000\u0000BC\u0005b\u0000\u0000"+
		"C\f\u0001\u0000\u0000\u0000DE\u0005(\u0000\u0000E\u000e\u0001\u0000\u0000"+
		"\u0000FG\u0005)\u0000\u0000G\u0010\u0001\u0000\u0000\u0000HP\u0002<>\u0000"+
		"IJ\u0005<\u0000\u0000JP\u0005=\u0000\u0000KL\u0005>\u0000\u0000LP\u0005"+
		"=\u0000\u0000MN\u0005<\u0000\u0000NP\u0005>\u0000\u0000OH\u0001\u0000"+
		"\u0000\u0000OI\u0001\u0000\u0000\u0000OK\u0001\u0000\u0000\u0000OM\u0001"+
		"\u0000\u0000\u0000P\u0012\u0001\u0000\u0000\u0000QR\u0005S\u0000\u0000"+
		"RS\u0005U\u0000\u0000ST\u0005M\u0000\u0000T\u0014\u0001\u0000\u0000\u0000"+
		"UV\u0005A\u0000\u0000VW\u0005V\u0000\u0000WX\u0005G\u0000\u0000X\u0016"+
		"\u0001\u0000\u0000\u0000YZ\u0005C\u0000\u0000Z[\u0005O\u0000\u0000[\\"+
		"\u0005U\u0000\u0000\\]\u0005N\u0000\u0000]^\u0005T\u0000\u0000^\u0018"+
		"\u0001\u0000\u0000\u0000_`\u0005M\u0000\u0000`a\u0005A\u0000\u0000ab\u0005"+
		"X\u0000\u0000b\u001a\u0001\u0000\u0000\u0000cd\u0005M\u0000\u0000de\u0005"+
		"I\u0000\u0000ef\u0005N\u0000\u0000f\u001c\u0001\u0000\u0000\u0000gk\u0007"+
		"\u0000\u0000\u0000hj\u0007\u0001\u0000\u0000ih\u0001\u0000\u0000\u0000"+
		"jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000l\u001e\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000np\u0007"+
		"\u0002\u0000\u0000on\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r \u0001\u0000\u0000"+
		"\u0000sw\u0005\'\u0000\u0000tv\u0007\u0003\u0000\u0000ut\u0001\u0000\u0000"+
		"\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000xz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z{\u0005"+
		"\'\u0000\u0000{\"\u0001\u0000\u0000\u0000|~\u0007\u0004\u0000\u0000}|"+
		"\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f}\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0006\u0011\u0001\u0000\u0082$\u0001\u0000\u0000"+
		"\u0000\u0006\u0000Okqw\u007f\u0002\u0001\u0001\u0000\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}