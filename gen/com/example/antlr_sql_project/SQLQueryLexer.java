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
		SUM=10, AVG=11, COUNT=12, MAX=13, MIN=14, COMMA=15, DOT=16, DODAJ=17, 
		ON=18, WORD=19, NUMBER=20, STRING=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"POKAZ", "WSZYSTKO", "Z", "GDZIE", "I", "LUB", "LPAREN", "RPAREN", "OPERATOR", 
			"SUM", "AVG", "COUNT", "MAX", "MIN", "COMMA", "DOT", "DODAJ", "ON", "WORD", 
			"NUMBER", "STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Pokaz'", "'wszystko'", "'z'", "'gdzie'", "'i'", "'lub'", "'('", 
			"')'", null, "'SUM'", "'AVG'", "'COUNT'", "'MAX'", "'MIN'", "','", "'.'", 
			"'dodaj'", "'warunek'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "POKAZ", "WSZYSTKO", "Z", "GDZIE", "I", "LUB", "LPAREN", "RPAREN", 
			"OPERATOR", "SUM", "AVG", "COUNT", "MAX", "MIN", "COMMA", "DOT", "DODAJ", 
			"ON", "WORD", "NUMBER", "STRING", "WS"
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

	public static final String _serializedATN =
		"\u0004\u0000\u0016\u009b\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bV\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u0082\b\u0012\n\u0012\f\u0012\u0085\t\u0012\u0001\u0013\u0004\u0013"+
		"\u0088\b\u0013\u000b\u0013\f\u0013\u0089\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u008e\b\u0014\n\u0014\f\u0014\u0091\t\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0004\u0015\u0096\b\u0015\u000b\u0015\f\u0015\u0097\u0001"+
		"\u0015\u0001\u0015\u0000\u0000\u0016\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015+\u0016\u0001\u0000\u0005\u0003\u0000AZ__az\u0004"+
		"\u000009AZ__az\u0001\u000009\u0005\u0000  09AZ__az\u0003\u0000\t\n\r\r"+
		"  \u00a1\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0001-\u0001\u0000\u0000\u0000"+
		"\u00033\u0001\u0000\u0000\u0000\u0005<\u0001\u0000\u0000\u0000\u0007>"+
		"\u0001\u0000\u0000\u0000\tD\u0001\u0000\u0000\u0000\u000bF\u0001\u0000"+
		"\u0000\u0000\rJ\u0001\u0000\u0000\u0000\u000fL\u0001\u0000\u0000\u0000"+
		"\u0011U\u0001\u0000\u0000\u0000\u0013W\u0001\u0000\u0000\u0000\u0015["+
		"\u0001\u0000\u0000\u0000\u0017_\u0001\u0000\u0000\u0000\u0019e\u0001\u0000"+
		"\u0000\u0000\u001bi\u0001\u0000\u0000\u0000\u001dm\u0001\u0000\u0000\u0000"+
		"\u001fo\u0001\u0000\u0000\u0000!q\u0001\u0000\u0000\u0000#w\u0001\u0000"+
		"\u0000\u0000%\u007f\u0001\u0000\u0000\u0000\'\u0087\u0001\u0000\u0000"+
		"\u0000)\u008b\u0001\u0000\u0000\u0000+\u0095\u0001\u0000\u0000\u0000-"+
		".\u0005P\u0000\u0000./\u0005o\u0000\u0000/0\u0005k\u0000\u000001\u0005"+
		"a\u0000\u000012\u0005z\u0000\u00002\u0002\u0001\u0000\u0000\u000034\u0005"+
		"w\u0000\u000045\u0005s\u0000\u000056\u0005z\u0000\u000067\u0005y\u0000"+
		"\u000078\u0005s\u0000\u000089\u0005t\u0000\u00009:\u0005k\u0000\u0000"+
		":;\u0005o\u0000\u0000;\u0004\u0001\u0000\u0000\u0000<=\u0005z\u0000\u0000"+
		"=\u0006\u0001\u0000\u0000\u0000>?\u0005g\u0000\u0000?@\u0005d\u0000\u0000"+
		"@A\u0005z\u0000\u0000AB\u0005i\u0000\u0000BC\u0005e\u0000\u0000C\b\u0001"+
		"\u0000\u0000\u0000DE\u0005i\u0000\u0000E\n\u0001\u0000\u0000\u0000FG\u0005"+
		"l\u0000\u0000GH\u0005u\u0000\u0000HI\u0005b\u0000\u0000I\f\u0001\u0000"+
		"\u0000\u0000JK\u0005(\u0000\u0000K\u000e\u0001\u0000\u0000\u0000LM\u0005"+
		")\u0000\u0000M\u0010\u0001\u0000\u0000\u0000NV\u0002<>\u0000OP\u0005<"+
		"\u0000\u0000PV\u0005=\u0000\u0000QR\u0005>\u0000\u0000RV\u0005=\u0000"+
		"\u0000ST\u0005<\u0000\u0000TV\u0005>\u0000\u0000UN\u0001\u0000\u0000\u0000"+
		"UO\u0001\u0000\u0000\u0000UQ\u0001\u0000\u0000\u0000US\u0001\u0000\u0000"+
		"\u0000V\u0012\u0001\u0000\u0000\u0000WX\u0005S\u0000\u0000XY\u0005U\u0000"+
		"\u0000YZ\u0005M\u0000\u0000Z\u0014\u0001\u0000\u0000\u0000[\\\u0005A\u0000"+
		"\u0000\\]\u0005V\u0000\u0000]^\u0005G\u0000\u0000^\u0016\u0001\u0000\u0000"+
		"\u0000_`\u0005C\u0000\u0000`a\u0005O\u0000\u0000ab\u0005U\u0000\u0000"+
		"bc\u0005N\u0000\u0000cd\u0005T\u0000\u0000d\u0018\u0001\u0000\u0000\u0000"+
		"ef\u0005M\u0000\u0000fg\u0005A\u0000\u0000gh\u0005X\u0000\u0000h\u001a"+
		"\u0001\u0000\u0000\u0000ij\u0005M\u0000\u0000jk\u0005I\u0000\u0000kl\u0005"+
		"N\u0000\u0000l\u001c\u0001\u0000\u0000\u0000mn\u0005,\u0000\u0000n\u001e"+
		"\u0001\u0000\u0000\u0000op\u0005.\u0000\u0000p \u0001\u0000\u0000\u0000"+
		"qr\u0005d\u0000\u0000rs\u0005o\u0000\u0000st\u0005d\u0000\u0000tu\u0005"+
		"a\u0000\u0000uv\u0005j\u0000\u0000v\"\u0001\u0000\u0000\u0000wx\u0005"+
		"w\u0000\u0000xy\u0005a\u0000\u0000yz\u0005r\u0000\u0000z{\u0005u\u0000"+
		"\u0000{|\u0005n\u0000\u0000|}\u0005e\u0000\u0000}~\u0005k\u0000\u0000"+
		"~$\u0001\u0000\u0000\u0000\u007f\u0083\u0007\u0000\u0000\u0000\u0080\u0082"+
		"\u0007\u0001\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0085"+
		"\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084&\u0001\u0000\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0086\u0088\u0007\u0002\u0000\u0000\u0087\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0087\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a(\u0001\u0000"+
		"\u0000\u0000\u008b\u008f\u0005\'\u0000\u0000\u008c\u008e\u0007\u0003\u0000"+
		"\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000"+
		"\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000"+
		"\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0005\'\u0000\u0000\u0093*\u0001\u0000\u0000\u0000"+
		"\u0094\u0096\u0007\u0004\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0006\u0015\u0000\u0000\u009a,\u0001\u0000\u0000\u0000\u0006"+
		"\u0000U\u0083\u0089\u008f\u0097\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}