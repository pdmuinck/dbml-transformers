// Generated from DbmlLexer.g4 by ANTLR 4.8

package com.pdemuinck.transformers.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DbmlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TABLE=1, REF=2, ENUM=3, INDEXES=4, PROJECT=5, NOTE=6, AS=7, DEFAULT=8, 
		DELETE=9, UPDATE=10, PRIMARY_KEY=11, UNIQUE=12, NOT_NULL=13, PK=14, NAME=15, 
		LBRACE=16, RBRACE=17, LPAREN=18, RPAREN=19, LBRACKET=20, RBRACKET=21, 
		COLON=22, COMMA=23, SEMICOLON=24, DOT=25, ASSIGN=26, RELATION_OP=27, BACKTICK=28, 
		STRING_LITERAL=29, IDENTIFIER=30, NUMBER=31, WS=32, COMMENT=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TABLE", "REF", "ENUM", "INDEXES", "PROJECT", "NOTE", "AS", "DEFAULT", 
			"DELETE", "UPDATE", "PRIMARY_KEY", "UNIQUE", "NOT_NULL", "PK", "NAME", 
			"LBRACE", "RBRACE", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "COLON", 
			"COMMA", "SEMICOLON", "DOT", "ASSIGN", "RELATION_OP", "BACKTICK", "STRING_LITERAL", 
			"MULTI_LINE_STRING", "IDENTIFIER", "NUMBER", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Table'", "'Ref'", "'Enum'", "'indexes'", "'Project'", null, "'as'", 
			"'default'", "'delete'", "'update'", "'primary key'", "'unique'", "'not null'", 
			"'pk'", "'name'", "'{'", "'}'", "'('", "')'", "'['", "']'", "':'", "','", 
			"';'", "'.'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TABLE", "REF", "ENUM", "INDEXES", "PROJECT", "NOTE", "AS", "DEFAULT", 
			"DELETE", "UPDATE", "PRIMARY_KEY", "UNIQUE", "NOT_NULL", "PK", "NAME", 
			"LBRACE", "RBRACE", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "COLON", 
			"COMMA", "SEMICOLON", "DOT", "ASSIGN", "RELATION_OP", "BACKTICK", "STRING_LITERAL", 
			"IDENTIFIER", "NUMBER", "WS", "COMMENT"
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


	public DbmlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DbmlLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u010d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7o\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\34\5\34\u00c7\n\34\3\35\3\35\3\35\3\35\7\35\u00cd\n\35\f"+
		"\35\16\35\u00d0\13\35\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u00d8\n\36\f"+
		"\36\16\36\u00db\13\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\7\37\u00e4\n"+
		"\37\f\37\16\37\u00e7\13\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \7"+
		" \u00f2\n \f \16 \u00f5\13 \3!\6!\u00f8\n!\r!\16!\u00f9\3\"\6\"\u00fd"+
		"\n\"\r\"\16\"\u00fe\3\"\3\"\3#\3#\3#\3#\7#\u0107\n#\f#\16#\u010a\13#\3"+
		"#\3#\3\u00e5\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37=\2? A!C\"E#\3\2\n\5\2//>>@@\4\2^^bb\4\2))^^\5\2C\\a"+
		"ac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u0117\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2"+
		"\5M\3\2\2\2\7Q\3\2\2\2\tV\3\2\2\2\13^\3\2\2\2\rn\3\2\2\2\17p\3\2\2\2\21"+
		"s\3\2\2\2\23{\3\2\2\2\25\u0082\3\2\2\2\27\u0089\3\2\2\2\31\u0095\3\2\2"+
		"\2\33\u009c\3\2\2\2\35\u00a5\3\2\2\2\37\u00a8\3\2\2\2!\u00ad\3\2\2\2#"+
		"\u00af\3\2\2\2%\u00b1\3\2\2\2\'\u00b3\3\2\2\2)\u00b5\3\2\2\2+\u00b7\3"+
		"\2\2\2-\u00b9\3\2\2\2/\u00bb\3\2\2\2\61\u00bd\3\2\2\2\63\u00bf\3\2\2\2"+
		"\65\u00c1\3\2\2\2\67\u00c6\3\2\2\29\u00c8\3\2\2\2;\u00d3\3\2\2\2=\u00de"+
		"\3\2\2\2?\u00ef\3\2\2\2A\u00f7\3\2\2\2C\u00fc\3\2\2\2E\u0102\3\2\2\2G"+
		"H\7V\2\2HI\7c\2\2IJ\7d\2\2JK\7n\2\2KL\7g\2\2L\4\3\2\2\2MN\7T\2\2NO\7g"+
		"\2\2OP\7h\2\2P\6\3\2\2\2QR\7G\2\2RS\7p\2\2ST\7w\2\2TU\7o\2\2U\b\3\2\2"+
		"\2VW\7k\2\2WX\7p\2\2XY\7f\2\2YZ\7g\2\2Z[\7z\2\2[\\\7g\2\2\\]\7u\2\2]\n"+
		"\3\2\2\2^_\7R\2\2_`\7t\2\2`a\7q\2\2ab\7l\2\2bc\7g\2\2cd\7e\2\2de\7v\2"+
		"\2e\f\3\2\2\2fg\7P\2\2gh\7q\2\2hi\7v\2\2io\7g\2\2jk\7p\2\2kl\7q\2\2lm"+
		"\7v\2\2mo\7g\2\2nf\3\2\2\2nj\3\2\2\2o\16\3\2\2\2pq\7c\2\2qr\7u\2\2r\20"+
		"\3\2\2\2st\7f\2\2tu\7g\2\2uv\7h\2\2vw\7c\2\2wx\7w\2\2xy\7n\2\2yz\7v\2"+
		"\2z\22\3\2\2\2{|\7f\2\2|}\7g\2\2}~\7n\2\2~\177\7g\2\2\177\u0080\7v\2\2"+
		"\u0080\u0081\7g\2\2\u0081\24\3\2\2\2\u0082\u0083\7w\2\2\u0083\u0084\7"+
		"r\2\2\u0084\u0085\7f\2\2\u0085\u0086\7c\2\2\u0086\u0087\7v\2\2\u0087\u0088"+
		"\7g\2\2\u0088\26\3\2\2\2\u0089\u008a\7r\2\2\u008a\u008b\7t\2\2\u008b\u008c"+
		"\7k\2\2\u008c\u008d\7o\2\2\u008d\u008e\7c\2\2\u008e\u008f\7t\2\2\u008f"+
		"\u0090\7{\2\2\u0090\u0091\7\"\2\2\u0091\u0092\7m\2\2\u0092\u0093\7g\2"+
		"\2\u0093\u0094\7{\2\2\u0094\30\3\2\2\2\u0095\u0096\7w\2\2\u0096\u0097"+
		"\7p\2\2\u0097\u0098\7k\2\2\u0098\u0099\7s\2\2\u0099\u009a\7w\2\2\u009a"+
		"\u009b\7g\2\2\u009b\32\3\2\2\2\u009c\u009d\7p\2\2\u009d\u009e\7q\2\2\u009e"+
		"\u009f\7v\2\2\u009f\u00a0\7\"\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7w\2"+
		"\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7n\2\2\u00a4\34\3\2\2\2\u00a5\u00a6"+
		"\7r\2\2\u00a6\u00a7\7m\2\2\u00a7\36\3\2\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa"+
		"\7c\2\2\u00aa\u00ab\7o\2\2\u00ab\u00ac\7g\2\2\u00ac \3\2\2\2\u00ad\u00ae"+
		"\7}\2\2\u00ae\"\3\2\2\2\u00af\u00b0\7\177\2\2\u00b0$\3\2\2\2\u00b1\u00b2"+
		"\7*\2\2\u00b2&\3\2\2\2\u00b3\u00b4\7+\2\2\u00b4(\3\2\2\2\u00b5\u00b6\7"+
		"]\2\2\u00b6*\3\2\2\2\u00b7\u00b8\7_\2\2\u00b8,\3\2\2\2\u00b9\u00ba\7<"+
		"\2\2\u00ba.\3\2\2\2\u00bb\u00bc\7.\2\2\u00bc\60\3\2\2\2\u00bd\u00be\7"+
		"=\2\2\u00be\62\3\2\2\2\u00bf\u00c0\7\60\2\2\u00c0\64\3\2\2\2\u00c1\u00c2"+
		"\7?\2\2\u00c2\66\3\2\2\2\u00c3\u00c7\t\2\2\2\u00c4\u00c5\7>\2\2\u00c5"+
		"\u00c7\7@\2\2\u00c6\u00c3\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c78\3\2\2\2\u00c8"+
		"\u00ce\7b\2\2\u00c9\u00cd\n\3\2\2\u00ca\u00cb\7^\2\2\u00cb\u00cd\13\2"+
		"\2\2\u00cc\u00c9\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2"+
		"\2\2\u00d1\u00d2\7b\2\2\u00d2:\3\2\2\2\u00d3\u00d9\7)\2\2\u00d4\u00d8"+
		"\n\4\2\2\u00d5\u00d6\7^\2\2\u00d6\u00d8\13\2\2\2\u00d7\u00d4\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7)\2\2\u00dd"+
		"<\3\2\2\2\u00de\u00df\7$\2\2\u00df\u00e0\7$\2\2\u00e0\u00e1\7$\2\2\u00e1"+
		"\u00e5\3\2\2\2\u00e2\u00e4\13\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3"+
		"\2\2\2\u00e5\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e8\u00e9\7$\2\2\u00e9\u00ea\7$\2\2\u00ea\u00eb\7$\2"+
		"\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\b\37\2\2\u00ed\u00ee\b\37\3\2\u00ee"+
		">\3\2\2\2\u00ef\u00f3\t\5\2\2\u00f0\u00f2\t\6\2\2\u00f1\u00f0\3\2\2\2"+
		"\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4@\3"+
		"\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8\t\7\2\2\u00f7\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00faB\3\2\2\2"+
		"\u00fb\u00fd\t\b\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00fc"+
		"\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\b\"\4\2\u0101"+
		"D\3\2\2\2\u0102\u0103\7\61\2\2\u0103\u0104\7\61\2\2\u0104\u0108\3\2\2"+
		"\2\u0105\u0107\n\t\2\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106"+
		"\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b"+
		"\u010c\b#\4\2\u010cF\3\2\2\2\16\2n\u00c6\u00cc\u00ce\u00d7\u00d9\u00e5"+
		"\u00f3\u00f9\u00fe\u0108\5\5\2\2\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}