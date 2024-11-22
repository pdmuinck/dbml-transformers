// Generated from /home/pieterjand/projects/dbml-transformers/src/main/antlr4/DbmlLexer.g4 by ANTLR 4.13.2

package com.pdemuinck.transformers.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class DbmlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

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
		"\u0004\u0000!\u010b\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005m\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u00c5\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0005\u001b\u00cb\b\u001b\n\u001b\f\u001b\u00ce\t\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005"+
		"\u001c\u00d6\b\u001c\n\u001c\f\u001c\u00d9\t\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d"+
		"\u00e2\b\u001d\n\u001d\f\u001d\u00e5\t\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0005\u001e\u00f0\b\u001e\n\u001e\f\u001e\u00f3\t\u001e\u0001\u001f"+
		"\u0004\u001f\u00f6\b\u001f\u000b\u001f\f\u001f\u00f7\u0001 \u0004 \u00fb"+
		"\b \u000b \f \u00fc\u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0005!\u0105"+
		"\b!\n!\f!\u0108\t!\u0001!\u0001!\u0001\u00e3\u0000\"\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a"+
		"5\u001b7\u001c9\u001d;\u0000=\u001e?\u001fA C!\u0001\u0000\b\u0003\u0000"+
		"--<<>>\u0002\u0000\\\\``\u0002\u0000\'\'\\\\\u0003\u0000AZ__az\u0004\u0000"+
		"09AZ__az\u0001\u000009\u0003\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u0115"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000"+
		"\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0001E\u0001\u0000\u0000\u0000"+
		"\u0003K\u0001\u0000\u0000\u0000\u0005O\u0001\u0000\u0000\u0000\u0007T"+
		"\u0001\u0000\u0000\u0000\t\\\u0001\u0000\u0000\u0000\u000bl\u0001\u0000"+
		"\u0000\u0000\rn\u0001\u0000\u0000\u0000\u000fq\u0001\u0000\u0000\u0000"+
		"\u0011y\u0001\u0000\u0000\u0000\u0013\u0080\u0001\u0000\u0000\u0000\u0015"+
		"\u0087\u0001\u0000\u0000\u0000\u0017\u0093\u0001\u0000\u0000\u0000\u0019"+
		"\u009a\u0001\u0000\u0000\u0000\u001b\u00a3\u0001\u0000\u0000\u0000\u001d"+
		"\u00a6\u0001\u0000\u0000\u0000\u001f\u00ab\u0001\u0000\u0000\u0000!\u00ad"+
		"\u0001\u0000\u0000\u0000#\u00af\u0001\u0000\u0000\u0000%\u00b1\u0001\u0000"+
		"\u0000\u0000\'\u00b3\u0001\u0000\u0000\u0000)\u00b5\u0001\u0000\u0000"+
		"\u0000+\u00b7\u0001\u0000\u0000\u0000-\u00b9\u0001\u0000\u0000\u0000/"+
		"\u00bb\u0001\u0000\u0000\u00001\u00bd\u0001\u0000\u0000\u00003\u00bf\u0001"+
		"\u0000\u0000\u00005\u00c4\u0001\u0000\u0000\u00007\u00c6\u0001\u0000\u0000"+
		"\u00009\u00d1\u0001\u0000\u0000\u0000;\u00dc\u0001\u0000\u0000\u0000="+
		"\u00ed\u0001\u0000\u0000\u0000?\u00f5\u0001\u0000\u0000\u0000A\u00fa\u0001"+
		"\u0000\u0000\u0000C\u0100\u0001\u0000\u0000\u0000EF\u0005T\u0000\u0000"+
		"FG\u0005a\u0000\u0000GH\u0005b\u0000\u0000HI\u0005l\u0000\u0000IJ\u0005"+
		"e\u0000\u0000J\u0002\u0001\u0000\u0000\u0000KL\u0005R\u0000\u0000LM\u0005"+
		"e\u0000\u0000MN\u0005f\u0000\u0000N\u0004\u0001\u0000\u0000\u0000OP\u0005"+
		"E\u0000\u0000PQ\u0005n\u0000\u0000QR\u0005u\u0000\u0000RS\u0005m\u0000"+
		"\u0000S\u0006\u0001\u0000\u0000\u0000TU\u0005i\u0000\u0000UV\u0005n\u0000"+
		"\u0000VW\u0005d\u0000\u0000WX\u0005e\u0000\u0000XY\u0005x\u0000\u0000"+
		"YZ\u0005e\u0000\u0000Z[\u0005s\u0000\u0000[\b\u0001\u0000\u0000\u0000"+
		"\\]\u0005P\u0000\u0000]^\u0005r\u0000\u0000^_\u0005o\u0000\u0000_`\u0005"+
		"j\u0000\u0000`a\u0005e\u0000\u0000ab\u0005c\u0000\u0000bc\u0005t\u0000"+
		"\u0000c\n\u0001\u0000\u0000\u0000de\u0005N\u0000\u0000ef\u0005o\u0000"+
		"\u0000fg\u0005t\u0000\u0000gm\u0005e\u0000\u0000hi\u0005n\u0000\u0000"+
		"ij\u0005o\u0000\u0000jk\u0005t\u0000\u0000km\u0005e\u0000\u0000ld\u0001"+
		"\u0000\u0000\u0000lh\u0001\u0000\u0000\u0000m\f\u0001\u0000\u0000\u0000"+
		"no\u0005a\u0000\u0000op\u0005s\u0000\u0000p\u000e\u0001\u0000\u0000\u0000"+
		"qr\u0005d\u0000\u0000rs\u0005e\u0000\u0000st\u0005f\u0000\u0000tu\u0005"+
		"a\u0000\u0000uv\u0005u\u0000\u0000vw\u0005l\u0000\u0000wx\u0005t\u0000"+
		"\u0000x\u0010\u0001\u0000\u0000\u0000yz\u0005d\u0000\u0000z{\u0005e\u0000"+
		"\u0000{|\u0005l\u0000\u0000|}\u0005e\u0000\u0000}~\u0005t\u0000\u0000"+
		"~\u007f\u0005e\u0000\u0000\u007f\u0012\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005u\u0000\u0000\u0081\u0082\u0005p\u0000\u0000\u0082\u0083\u0005d"+
		"\u0000\u0000\u0083\u0084\u0005a\u0000\u0000\u0084\u0085\u0005t\u0000\u0000"+
		"\u0085\u0086\u0005e\u0000\u0000\u0086\u0014\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0005p\u0000\u0000\u0088\u0089\u0005r\u0000\u0000\u0089\u008a\u0005"+
		"i\u0000\u0000\u008a\u008b\u0005m\u0000\u0000\u008b\u008c\u0005a\u0000"+
		"\u0000\u008c\u008d\u0005r\u0000\u0000\u008d\u008e\u0005y\u0000\u0000\u008e"+
		"\u008f\u0005 \u0000\u0000\u008f\u0090\u0005k\u0000\u0000\u0090\u0091\u0005"+
		"e\u0000\u0000\u0091\u0092\u0005y\u0000\u0000\u0092\u0016\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0005u\u0000\u0000\u0094\u0095\u0005n\u0000\u0000\u0095"+
		"\u0096\u0005i\u0000\u0000\u0096\u0097\u0005q\u0000\u0000\u0097\u0098\u0005"+
		"u\u0000\u0000\u0098\u0099\u0005e\u0000\u0000\u0099\u0018\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0005n\u0000\u0000\u009b\u009c\u0005o\u0000\u0000\u009c"+
		"\u009d\u0005t\u0000\u0000\u009d\u009e\u0005 \u0000\u0000\u009e\u009f\u0005"+
		"n\u0000\u0000\u009f\u00a0\u0005u\u0000\u0000\u00a0\u00a1\u0005l\u0000"+
		"\u0000\u00a1\u00a2\u0005l\u0000\u0000\u00a2\u001a\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0005p\u0000\u0000\u00a4\u00a5\u0005k\u0000\u0000\u00a5\u001c"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005n\u0000\u0000\u00a7\u00a8\u0005"+
		"a\u0000\u0000\u00a8\u00a9\u0005m\u0000\u0000\u00a9\u00aa\u0005e\u0000"+
		"\u0000\u00aa\u001e\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005{\u0000\u0000"+
		"\u00ac \u0001\u0000\u0000\u0000\u00ad\u00ae\u0005}\u0000\u0000\u00ae\""+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u0005(\u0000\u0000\u00b0$\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0005)\u0000\u0000\u00b2&\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0005[\u0000\u0000\u00b4(\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0005]\u0000\u0000\u00b6*\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005:"+
		"\u0000\u0000\u00b8,\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005,\u0000\u0000"+
		"\u00ba.\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005;\u0000\u0000\u00bc0"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\u0005.\u0000\u0000\u00be2\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0005=\u0000\u0000\u00c04\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c5\u0007\u0000\u0000\u0000\u00c2\u00c3\u0005<\u0000\u0000\u00c3"+
		"\u00c5\u0005>\u0000\u0000\u00c4\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c56\u0001\u0000\u0000\u0000\u00c6\u00cc\u0005"+
		"`\u0000\u0000\u00c7\u00cb\b\u0001\u0000\u0000\u00c8\u00c9\u0005\\\u0000"+
		"\u0000\u00c9\u00cb\t\u0000\u0000\u0000\u00ca\u00c7\u0001\u0000\u0000\u0000"+
		"\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000"+
		"\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0005`\u0000\u0000\u00d08\u0001\u0000\u0000\u0000\u00d1\u00d7"+
		"\u0005\'\u0000\u0000\u00d2\u00d6\b\u0002\u0000\u0000\u00d3\u00d4\u0005"+
		"\\\u0000\u0000\u00d4\u00d6\t\u0000\u0000\u0000\u00d5\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d8\u00da\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u0005\'\u0000\u0000\u00db:\u0001\u0000\u0000"+
		"\u0000\u00dc\u00dd\u0005\"\u0000\u0000\u00dd\u00de\u0005\"\u0000\u0000"+
		"\u00de\u00df\u0005\"\u0000\u0000\u00df\u00e3\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e2\t\u0000\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e3\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\"\u0000\u0000\u00e7\u00e8\u0005"+
		"\"\u0000\u0000\u00e8\u00e9\u0005\"\u0000\u0000\u00e9\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u0006\u001d\u0000\u0000\u00eb\u00ec\u0006\u001d"+
		"\u0001\u0000\u00ec<\u0001\u0000\u0000\u0000\u00ed\u00f1\u0007\u0003\u0000"+
		"\u0000\u00ee\u00f0\u0007\u0004\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2>\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f6\u0007\u0005\u0000\u0000"+
		"\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000"+
		"\u00f8@\u0001\u0000\u0000\u0000\u00f9\u00fb\u0007\u0006\u0000\u0000\u00fa"+
		"\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0006 \u0002\u0000\u00ffB\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0005/\u0000\u0000\u0101\u0102\u0005/\u0000"+
		"\u0000\u0102\u0106\u0001\u0000\u0000\u0000\u0103\u0105\b\u0007\u0000\u0000"+
		"\u0104\u0103\u0001\u0000\u0000\u0000\u0105\u0108\u0001\u0000\u0000\u0000"+
		"\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000"+
		"\u0107\u0109\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000"+
		"\u0109\u010a\u0006!\u0002\u0000\u010aD\u0001\u0000\u0000\u0000\f\u0000"+
		"l\u00c4\u00ca\u00cc\u00d5\u00d7\u00e3\u00f1\u00f7\u00fc\u0106\u0003\u0003"+
		"\u0000\u0000\u0000\u0001\u0000\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}