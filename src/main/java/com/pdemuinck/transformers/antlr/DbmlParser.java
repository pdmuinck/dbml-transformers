// Generated from DbmlParser.g4 by ANTLR 4.8

package com.pdemuinck.transformers.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DbmlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TABLE=1, REF=2, ENUM=3, INDEXES=4, PROJECT=5, NOTE=6, AS=7, DEFAULT=8, 
		DELETE=9, UPDATE=10, PRIMARY_KEY=11, UNIQUE=12, NOT_NULL=13, PK=14, NAME=15, 
		LBRACE=16, RBRACE=17, LPAREN=18, RPAREN=19, LBRACKET=20, RBRACKET=21, 
		COLON=22, COMMA=23, SEMICOLON=24, DOT=25, ASSIGN=26, RELATION_OP=27, BACKTICK=28, 
		STRING_LITERAL=29, IDENTIFIER=30, NUMBER=31, WS=32, COMMENT=33, HEX_COLOR=34, 
		TYPE=35, MULTI_LINE_STRING=36;
	public static final int
		RULE_dbml = 0, RULE_project = 1, RULE_project_settings = 2, RULE_table = 3, 
		RULE_schema_table_name = 4, RULE_schema = 5, RULE_table_settings = 6, 
		RULE_table_setting_list = 7, RULE_table_setting = 8, RULE_column = 9, 
		RULE_type = 10, RULE_column_settings = 11, RULE_column_setting_list = 12, 
		RULE_column_setting = 13, RULE_table_index = 14, RULE_index_entry = 15, 
		RULE_composite_index = 16, RULE_index_columns = 17, RULE_single_column_index = 18, 
		RULE_index_settings = 19, RULE_inline_expression_list = 20, RULE_inline_expression = 21, 
		RULE_index_setting_list = 22, RULE_index_setting = 23, RULE_column_expression_list = 24, 
		RULE_note = 25, RULE_relation = 26, RULE_reference = 27, RULE_relation_settings = 28, 
		RULE_relation_setting_list = 29, RULE_relation_setting = 30, RULE_enumeration = 31, 
		RULE_enum_entry = 32, RULE_column_list = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"dbml", "project", "project_settings", "table", "schema_table_name", 
			"schema", "table_settings", "table_setting_list", "table_setting", "column", 
			"type", "column_settings", "column_setting_list", "column_setting", "table_index", 
			"index_entry", "composite_index", "index_columns", "single_column_index", 
			"index_settings", "inline_expression_list", "inline_expression", "index_setting_list", 
			"index_setting", "column_expression_list", "note", "relation", "reference", 
			"relation_settings", "relation_setting_list", "relation_setting", "enumeration", 
			"enum_entry", "column_list"
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
			"IDENTIFIER", "NUMBER", "WS", "COMMENT", "HEX_COLOR", "TYPE", "MULTI_LINE_STRING"
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
	public String getGrammarFileName() { return "DbmlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DbmlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DbmlContext extends ParserRuleContext {
		public List<ProjectContext> project() {
			return getRuleContexts(ProjectContext.class);
		}
		public ProjectContext project(int i) {
			return getRuleContext(ProjectContext.class,i);
		}
		public List<TableContext> table() {
			return getRuleContexts(TableContext.class);
		}
		public TableContext table(int i) {
			return getRuleContext(TableContext.class,i);
		}
		public List<ReferenceContext> reference() {
			return getRuleContexts(ReferenceContext.class);
		}
		public ReferenceContext reference(int i) {
			return getRuleContext(ReferenceContext.class,i);
		}
		public List<EnumerationContext> enumeration() {
			return getRuleContexts(EnumerationContext.class);
		}
		public EnumerationContext enumeration(int i) {
			return getRuleContext(EnumerationContext.class,i);
		}
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public DbmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterDbml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitDbml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitDbml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DbmlContext dbml() throws RecognitionException {
		DbmlContext _localctx = new DbmlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_dbml);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TABLE) | (1L << REF) | (1L << ENUM) | (1L << PROJECT) | (1L << NOTE))) != 0)) {
				{
				setState(73);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PROJECT:
					{
					setState(68);
					project();
					}
					break;
				case TABLE:
					{
					setState(69);
					table();
					}
					break;
				case REF:
					{
					setState(70);
					reference();
					}
					break;
				case ENUM:
					{
					setState(71);
					enumeration();
					}
					break;
				case NOTE:
					{
					setState(72);
					note();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(77);
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

	public static class ProjectContext extends ParserRuleContext {
		public TerminalNode PROJECT() { return getToken(DbmlParser.PROJECT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DbmlParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(DbmlParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(DbmlParser.RBRACE, 0); }
		public List<Project_settingsContext> project_settings() {
			return getRuleContexts(Project_settingsContext.class);
		}
		public Project_settingsContext project_settings(int i) {
			return getRuleContext(Project_settingsContext.class,i);
		}
		public ProjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_project; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterProject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitProject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitProject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjectContext project() throws RecognitionException {
		ProjectContext _localctx = new ProjectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_project);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(PROJECT);
			setState(79);
			match(IDENTIFIER);
			setState(80);
			match(LBRACE);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOTE || _la==IDENTIFIER) {
				{
				{
				setState(81);
				project_settings();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			match(RBRACE);
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

	public static class Project_settingsContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DbmlParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(DbmlParser.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DbmlParser.STRING_LITERAL, 0); }
		public TerminalNode NOTE() { return getToken(DbmlParser.NOTE, 0); }
		public Project_settingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_project_settings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterProject_settings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitProject_settings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitProject_settings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Project_settingsContext project_settings() throws RecognitionException {
		Project_settingsContext _localctx = new Project_settingsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_project_settings);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(IDENTIFIER);
				setState(90);
				match(COLON);
				setState(91);
				match(STRING_LITERAL);
				}
				break;
			case NOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(NOTE);
				setState(93);
				match(COLON);
				setState(94);
				match(STRING_LITERAL);
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

	public static class TableContext extends ParserRuleContext {
		public TerminalNode TABLE() { return getToken(DbmlParser.TABLE, 0); }
		public Schema_table_nameContext schema_table_name() {
			return getRuleContext(Schema_table_nameContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(DbmlParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(DbmlParser.RBRACE, 0); }
		public TerminalNode AS() { return getToken(DbmlParser.AS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DbmlParser.IDENTIFIER, 0); }
		public Table_settingsContext table_settings() {
			return getRuleContext(Table_settingsContext.class,0);
		}
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public List<Table_indexContext> table_index() {
			return getRuleContexts(Table_indexContext.class);
		}
		public Table_indexContext table_index(int i) {
			return getRuleContext(Table_indexContext.class,i);
		}
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(TABLE);
			setState(98);
			schema_table_name();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(99);
				match(AS);
				setState(100);
				match(IDENTIFIER);
				}
			}

			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(103);
				table_settings();
				}
			}

			setState(106);
			match(LBRACE);
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(107);
					column();
					}
					break;
				case 2:
					{
					setState(108);
					table_index();
					}
					break;
				case 3:
					{
					setState(109);
					note();
					}
					break;
				case 4:
					{
					setState(110);
					relation();
					}
					break;
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INDEXES) | (1L << NOTE) | (1L << IDENTIFIER))) != 0) );
			setState(115);
			match(RBRACE);
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

	public static class Schema_table_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DbmlParser.IDENTIFIER, 0); }
		public SchemaContext schema() {
			return getRuleContext(SchemaContext.class,0);
		}
		public Schema_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterSchema_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitSchema_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitSchema_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Schema_table_nameContext schema_table_name() throws RecognitionException {
		Schema_table_nameContext _localctx = new Schema_table_nameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_schema_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(117);
				schema();
				}
				break;
			}
			setState(120);
			match(IDENTIFIER);
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

	public static class SchemaContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DbmlParser.IDENTIFIER, 0); }
		public TerminalNode DOT() { return getToken(DbmlParser.DOT, 0); }
		public SchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaContext schema() throws RecognitionException {
		SchemaContext _localctx = new SchemaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_schema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(IDENTIFIER);
			setState(123);
			match(DOT);
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

	public static class Table_settingsContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(DbmlParser.LBRACKET, 0); }
		public Table_setting_listContext table_setting_list() {
			return getRuleContext(Table_setting_listContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(DbmlParser.RBRACKET, 0); }
		public Table_settingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_settings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterTable_settings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitTable_settings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitTable_settings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_settingsContext table_settings() throws RecognitionException {
		Table_settingsContext _localctx = new Table_settingsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_table_settings);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(LBRACKET);
			setState(126);
			table_setting_list();
			setState(127);
			match(RBRACKET);
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

	public static class Table_setting_listContext extends ParserRuleContext {
		public List<Table_settingContext> table_setting() {
			return getRuleContexts(Table_settingContext.class);
		}
		public Table_settingContext table_setting(int i) {
			return getRuleContext(Table_settingContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DbmlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DbmlParser.COMMA, i);
		}
		public Table_setting_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_setting_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterTable_setting_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitTable_setting_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitTable_setting_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_setting_listContext table_setting_list() throws RecognitionException {
		Table_setting_listContext _localctx = new Table_setting_listContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_table_setting_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			table_setting();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(130);
				match(COMMA);
				setState(131);
				table_setting();
				}
				}
				setState(136);
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

	public static class Table_settingContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(DbmlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DbmlParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(DbmlParser.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DbmlParser.STRING_LITERAL, 0); }
		public TerminalNode HEX_COLOR() { return getToken(DbmlParser.HEX_COLOR, 0); }
		public Table_settingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_setting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterTable_setting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitTable_setting(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitTable_setting(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_settingContext table_setting() throws RecognitionException {
		Table_settingContext _localctx = new Table_settingContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_table_setting);
		int _la;
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(IDENTIFIER);
				setState(138);
				match(COLON);
				setState(139);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << IDENTIFIER) | (1L << HEX_COLOR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(IDENTIFIER);
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

	public static class ColumnContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DbmlParser.IDENTIFIER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Column_settingsContext column_settings() {
			return getRuleContext(Column_settingsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(DbmlParser.COMMA, 0); }
		public TerminalNode SEMICOLON() { return getToken(DbmlParser.SEMICOLON, 0); }
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(IDENTIFIER);
			setState(144);
			type();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(145);
				column_settings();
				}
			}

			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA || _la==SEMICOLON) {
				{
				setState(148);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==SEMICOLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DbmlParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(DbmlParser.LPAREN, 0); }
		public TerminalNode NUMBER() { return getToken(DbmlParser.NUMBER, 0); }
		public TerminalNode RPAREN() { return getToken(DbmlParser.RPAREN, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(IDENTIFIER);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(152);
				match(LPAREN);
				setState(153);
				match(NUMBER);
				setState(154);
				match(RPAREN);
				}
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

	public static class Column_settingsContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(DbmlParser.LBRACKET, 0); }
		public Column_setting_listContext column_setting_list() {
			return getRuleContext(Column_setting_listContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(DbmlParser.RBRACKET, 0); }
		public Column_settingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_settings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterColumn_settings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitColumn_settings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitColumn_settings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_settingsContext column_settings() throws RecognitionException {
		Column_settingsContext _localctx = new Column_settingsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_column_settings);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(LBRACKET);
			setState(158);
			column_setting_list();
			setState(159);
			match(RBRACKET);
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

	public static class Column_setting_listContext extends ParserRuleContext {
		public List<Column_settingContext> column_setting() {
			return getRuleContexts(Column_settingContext.class);
		}
		public Column_settingContext column_setting(int i) {
			return getRuleContext(Column_settingContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DbmlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DbmlParser.COMMA, i);
		}
		public Column_setting_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_setting_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterColumn_setting_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitColumn_setting_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitColumn_setting_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_setting_listContext column_setting_list() throws RecognitionException {
		Column_setting_listContext _localctx = new Column_setting_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_column_setting_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			column_setting();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(162);
				match(COMMA);
				setState(163);
				column_setting();
				}
				}
				setState(168);
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

	public static class Column_settingContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(DbmlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DbmlParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(DbmlParser.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DbmlParser.STRING_LITERAL, 0); }
		public TerminalNode NUMBER() { return getToken(DbmlParser.NUMBER, 0); }
		public TerminalNode BACKTICK() { return getToken(DbmlParser.BACKTICK, 0); }
		public TerminalNode PRIMARY_KEY() { return getToken(DbmlParser.PRIMARY_KEY, 0); }
		public TerminalNode PK() { return getToken(DbmlParser.PK, 0); }
		public TerminalNode UNIQUE() { return getToken(DbmlParser.UNIQUE, 0); }
		public TerminalNode NOT_NULL() { return getToken(DbmlParser.NOT_NULL, 0); }
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(DbmlParser.DEFAULT, 0); }
		public Column_settingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_setting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterColumn_setting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitColumn_setting(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitColumn_setting(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_settingContext column_setting() throws RecognitionException {
		Column_settingContext _localctx = new Column_settingContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_column_setting);
		int _la;
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(IDENTIFIER);
				setState(170);
				match(COLON);
				setState(171);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BACKTICK) | (1L << STRING_LITERAL) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				match(PRIMARY_KEY);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				match(PK);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(175);
				match(UNIQUE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(176);
				match(NOT_NULL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(177);
				note();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(178);
				match(DEFAULT);
				setState(179);
				match(COLON);
				setState(180);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << IDENTIFIER) | (1L << NUMBER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class Table_indexContext extends ParserRuleContext {
		public TerminalNode INDEXES() { return getToken(DbmlParser.INDEXES, 0); }
		public TerminalNode LBRACE() { return getToken(DbmlParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(DbmlParser.RBRACE, 0); }
		public List<Index_entryContext> index_entry() {
			return getRuleContexts(Index_entryContext.class);
		}
		public Index_entryContext index_entry(int i) {
			return getRuleContext(Index_entryContext.class,i);
		}
		public Table_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterTable_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitTable_index(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitTable_index(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_indexContext table_index() throws RecognitionException {
		Table_indexContext _localctx = new Table_indexContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_table_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(INDEXES);
			setState(184);
			match(LBRACE);
			setState(186); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(185);
				index_entry();
				}
				}
				setState(188); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LPAREN || _la==IDENTIFIER );
			setState(190);
			match(RBRACE);
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

	public static class Index_entryContext extends ParserRuleContext {
		public Composite_indexContext composite_index() {
			return getRuleContext(Composite_indexContext.class,0);
		}
		public Single_column_indexContext single_column_index() {
			return getRuleContext(Single_column_indexContext.class,0);
		}
		public Inline_expression_listContext inline_expression_list() {
			return getRuleContext(Inline_expression_listContext.class,0);
		}
		public Index_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterIndex_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitIndex_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitIndex_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_entryContext index_entry() throws RecognitionException {
		Index_entryContext _localctx = new Index_entryContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_index_entry);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				composite_index();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				single_column_index();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				inline_expression_list();
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

	public static class Composite_indexContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(DbmlParser.LPAREN, 0); }
		public Index_columnsContext index_columns() {
			return getRuleContext(Index_columnsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DbmlParser.RPAREN, 0); }
		public Index_settingsContext index_settings() {
			return getRuleContext(Index_settingsContext.class,0);
		}
		public Composite_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_composite_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterComposite_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitComposite_index(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitComposite_index(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Composite_indexContext composite_index() throws RecognitionException {
		Composite_indexContext _localctx = new Composite_indexContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_composite_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(LPAREN);
			setState(198);
			index_columns();
			setState(199);
			match(RPAREN);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(200);
				index_settings();
				}
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

	public static class Index_columnsContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(DbmlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DbmlParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DbmlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DbmlParser.COMMA, i);
		}
		public Index_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterIndex_columns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitIndex_columns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitIndex_columns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_columnsContext index_columns() throws RecognitionException {
		Index_columnsContext _localctx = new Index_columnsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_index_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(IDENTIFIER);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(204);
				match(COMMA);
				setState(205);
				match(IDENTIFIER);
				}
				}
				setState(210);
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

	public static class Single_column_indexContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DbmlParser.IDENTIFIER, 0); }
		public Index_settingsContext index_settings() {
			return getRuleContext(Index_settingsContext.class,0);
		}
		public Single_column_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_column_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterSingle_column_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitSingle_column_index(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitSingle_column_index(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_column_indexContext single_column_index() throws RecognitionException {
		Single_column_indexContext _localctx = new Single_column_indexContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_single_column_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(IDENTIFIER);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(212);
				index_settings();
				}
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

	public static class Index_settingsContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(DbmlParser.LBRACKET, 0); }
		public Index_setting_listContext index_setting_list() {
			return getRuleContext(Index_setting_listContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(DbmlParser.RBRACKET, 0); }
		public Index_settingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_settings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterIndex_settings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitIndex_settings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitIndex_settings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_settingsContext index_settings() throws RecognitionException {
		Index_settingsContext _localctx = new Index_settingsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_index_settings);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(LBRACKET);
			setState(216);
			index_setting_list();
			setState(217);
			match(RBRACKET);
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

	public static class Inline_expression_listContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(DbmlParser.LPAREN, 0); }
		public List<Inline_expressionContext> inline_expression() {
			return getRuleContexts(Inline_expressionContext.class);
		}
		public Inline_expressionContext inline_expression(int i) {
			return getRuleContext(Inline_expressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(DbmlParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DbmlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DbmlParser.COMMA, i);
		}
		public Inline_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inline_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterInline_expression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitInline_expression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitInline_expression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inline_expression_listContext inline_expression_list() throws RecognitionException {
		Inline_expression_listContext _localctx = new Inline_expression_listContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_inline_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(LPAREN);
			setState(220);
			inline_expression();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(221);
				match(COMMA);
				setState(222);
				inline_expression();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			match(RPAREN);
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

	public static class Inline_expressionContext extends ParserRuleContext {
		public List<TerminalNode> BACKTICK() { return getTokens(DbmlParser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(DbmlParser.BACKTICK, i);
		}
		public Inline_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inline_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterInline_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitInline_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitInline_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inline_expressionContext inline_expression() throws RecognitionException {
		Inline_expressionContext _localctx = new Inline_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_inline_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(BACKTICK);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(231);
					matchWildcard();
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(237);
			match(BACKTICK);
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

	public static class Index_setting_listContext extends ParserRuleContext {
		public List<Index_settingContext> index_setting() {
			return getRuleContexts(Index_settingContext.class);
		}
		public Index_settingContext index_setting(int i) {
			return getRuleContext(Index_settingContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DbmlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DbmlParser.COMMA, i);
		}
		public Index_setting_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_setting_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterIndex_setting_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitIndex_setting_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitIndex_setting_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_setting_listContext index_setting_list() throws RecognitionException {
		Index_setting_listContext _localctx = new Index_setting_listContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_index_setting_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			index_setting();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(240);
				match(COMMA);
				setState(241);
				index_setting();
				}
				}
				setState(246);
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

	public static class Index_settingContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(DbmlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DbmlParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(DbmlParser.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DbmlParser.STRING_LITERAL, 0); }
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public TerminalNode PK() { return getToken(DbmlParser.PK, 0); }
		public TerminalNode UNIQUE() { return getToken(DbmlParser.UNIQUE, 0); }
		public TerminalNode NAME() { return getToken(DbmlParser.NAME, 0); }
		public TerminalNode TYPE() { return getToken(DbmlParser.TYPE, 0); }
		public Index_settingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_setting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterIndex_setting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitIndex_setting(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitIndex_setting(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_settingContext index_setting() throws RecognitionException {
		Index_settingContext _localctx = new Index_settingContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_index_setting);
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(IDENTIFIER);
				setState(248);
				match(COLON);
				setState(249);
				match(STRING_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(IDENTIFIER);
				setState(251);
				match(COLON);
				setState(252);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				note();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
				match(IDENTIFIER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(255);
				match(PK);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(256);
				match(UNIQUE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(257);
				match(NAME);
				setState(258);
				match(COLON);
				setState(259);
				match(STRING_LITERAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(260);
				match(TYPE);
				setState(261);
				match(COLON);
				setState(262);
				match(IDENTIFIER);
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

	public static class Column_expression_listContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(DbmlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DbmlParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DbmlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DbmlParser.COMMA, i);
		}
		public Column_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterColumn_expression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitColumn_expression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitColumn_expression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_expression_listContext column_expression_list() throws RecognitionException {
		Column_expression_listContext _localctx = new Column_expression_listContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_column_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(IDENTIFIER);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(266);
				match(COMMA);
				setState(267);
				match(IDENTIFIER);
				}
				}
				setState(272);
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

	public static class NoteContext extends ParserRuleContext {
		public TerminalNode NOTE() { return getToken(DbmlParser.NOTE, 0); }
		public TerminalNode COLON() { return getToken(DbmlParser.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DbmlParser.STRING_LITERAL, 0); }
		public TerminalNode LBRACE() { return getToken(DbmlParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(DbmlParser.RBRACE, 0); }
		public TerminalNode MULTI_LINE_STRING() { return getToken(DbmlParser.MULTI_LINE_STRING, 0); }
		public NoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitNote(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitNote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_note);
		int _la;
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(NOTE);
				setState(274);
				match(COLON);
				setState(275);
				match(STRING_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(NOTE);
				setState(277);
				match(LBRACE);
				setState(278);
				_la = _input.LA(1);
				if ( !(_la==STRING_LITERAL || _la==MULTI_LINE_STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(279);
				match(RBRACE);
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

	public static class RelationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(DbmlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DbmlParser.IDENTIFIER, i);
		}
		public TerminalNode RELATION_OP() { return getToken(DbmlParser.RELATION_OP, 0); }
		public Column_settingsContext column_settings() {
			return getRuleContext(Column_settingsContext.class,0);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(IDENTIFIER);
			setState(283);
			match(RELATION_OP);
			setState(284);
			match(IDENTIFIER);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(285);
				column_settings();
				}
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

	public static class ReferenceContext extends ParserRuleContext {
		public TerminalNode REF() { return getToken(DbmlParser.REF, 0); }
		public List<Schema_table_nameContext> schema_table_name() {
			return getRuleContexts(Schema_table_nameContext.class);
		}
		public Schema_table_nameContext schema_table_name(int i) {
			return getRuleContext(Schema_table_nameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(DbmlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(DbmlParser.DOT, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(DbmlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DbmlParser.IDENTIFIER, i);
		}
		public TerminalNode RELATION_OP() { return getToken(DbmlParser.RELATION_OP, 0); }
		public TerminalNode COLON() { return getToken(DbmlParser.COLON, 0); }
		public Relation_settingsContext relation_settings() {
			return getRuleContext(Relation_settingsContext.class,0);
		}
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(REF);
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(289);
				match(IDENTIFIER);
				setState(290);
				match(COLON);
				}
				break;
			}
			setState(293);
			schema_table_name();
			setState(294);
			match(DOT);
			setState(295);
			match(IDENTIFIER);
			setState(296);
			match(RELATION_OP);
			setState(297);
			schema_table_name();
			setState(298);
			match(DOT);
			setState(299);
			match(IDENTIFIER);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(300);
				relation_settings();
				}
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

	public static class Relation_settingsContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(DbmlParser.LBRACKET, 0); }
		public Relation_setting_listContext relation_setting_list() {
			return getRuleContext(Relation_setting_listContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(DbmlParser.RBRACKET, 0); }
		public Relation_settingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_settings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterRelation_settings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitRelation_settings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitRelation_settings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relation_settingsContext relation_settings() throws RecognitionException {
		Relation_settingsContext _localctx = new Relation_settingsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_relation_settings);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(LBRACKET);
			setState(304);
			relation_setting_list();
			setState(305);
			match(RBRACKET);
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

	public static class Relation_setting_listContext extends ParserRuleContext {
		public List<Relation_settingContext> relation_setting() {
			return getRuleContexts(Relation_settingContext.class);
		}
		public Relation_settingContext relation_setting(int i) {
			return getRuleContext(Relation_settingContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DbmlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DbmlParser.COMMA, i);
		}
		public Relation_setting_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_setting_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterRelation_setting_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitRelation_setting_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitRelation_setting_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relation_setting_listContext relation_setting_list() throws RecognitionException {
		Relation_setting_listContext _localctx = new Relation_setting_listContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_relation_setting_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			relation_setting();
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(308);
				match(COMMA);
				setState(309);
				relation_setting();
				}
				}
				setState(314);
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

	public static class Relation_settingContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(DbmlParser.DELETE, 0); }
		public TerminalNode COLON() { return getToken(DbmlParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DbmlParser.IDENTIFIER, 0); }
		public TerminalNode UPDATE() { return getToken(DbmlParser.UPDATE, 0); }
		public Relation_settingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_setting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterRelation_setting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitRelation_setting(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitRelation_setting(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relation_settingContext relation_setting() throws RecognitionException {
		Relation_settingContext _localctx = new Relation_settingContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_relation_setting);
		try {
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELETE:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(DELETE);
				setState(316);
				match(COLON);
				setState(317);
				match(IDENTIFIER);
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				match(UPDATE);
				setState(319);
				match(COLON);
				setState(320);
				match(IDENTIFIER);
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

	public static class EnumerationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(DbmlParser.ENUM, 0); }
		public Schema_table_nameContext schema_table_name() {
			return getRuleContext(Schema_table_nameContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(DbmlParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(DbmlParser.RBRACE, 0); }
		public List<Enum_entryContext> enum_entry() {
			return getRuleContexts(Enum_entryContext.class);
		}
		public Enum_entryContext enum_entry(int i) {
			return getRuleContext(Enum_entryContext.class,i);
		}
		public EnumerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterEnumeration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitEnumeration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitEnumeration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumerationContext enumeration() throws RecognitionException {
		EnumerationContext _localctx = new EnumerationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_enumeration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(ENUM);
			setState(324);
			schema_table_name();
			setState(325);
			match(LBRACE);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(326);
				enum_entry();
				}
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(332);
			match(RBRACE);
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

	public static class Enum_entryContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DbmlParser.IDENTIFIER, 0); }
		public TerminalNode LBRACKET() { return getToken(DbmlParser.LBRACKET, 0); }
		public Column_setting_listContext column_setting_list() {
			return getRuleContext(Column_setting_listContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(DbmlParser.RBRACKET, 0); }
		public Enum_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterEnum_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitEnum_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitEnum_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_entryContext enum_entry() throws RecognitionException {
		Enum_entryContext _localctx = new Enum_entryContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_enum_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(IDENTIFIER);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(335);
				match(LBRACKET);
				setState(336);
				column_setting_list();
				setState(337);
				match(RBRACKET);
				}
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

	public static class Column_listContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(DbmlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DbmlParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DbmlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DbmlParser.COMMA, i);
		}
		public Column_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterColumn_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitColumn_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitColumn_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_listContext column_list() throws RecognitionException {
		Column_listContext _localctx = new Column_listContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_column_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(IDENTIFIER);
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(342);
				match(COMMA);
				setState(343);
				match(IDENTIFIER);
				}
				}
				setState(348);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u0160\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\7\2L\n\2\f\2\16\2O\13\2\3\3\3\3"+
		"\3\3\3\3\7\3U\n\3\f\3\16\3X\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4b"+
		"\n\4\3\5\3\5\3\5\3\5\5\5h\n\5\3\5\5\5k\n\5\3\5\3\5\3\5\3\5\3\5\6\5r\n"+
		"\5\r\5\16\5s\3\5\3\5\3\6\5\6y\n\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\7\t\u0087\n\t\f\t\16\t\u008a\13\t\3\n\3\n\3\n\3\n\5\n\u0090"+
		"\n\n\3\13\3\13\3\13\5\13\u0095\n\13\3\13\5\13\u0098\n\13\3\f\3\f\3\f\3"+
		"\f\5\f\u009e\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16\u00a7\n\16\f\16\16"+
		"\16\u00aa\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00b8\n\17\3\20\3\20\3\20\6\20\u00bd\n\20\r\20\16\20\u00be"+
		"\3\20\3\20\3\21\3\21\3\21\5\21\u00c6\n\21\3\22\3\22\3\22\3\22\5\22\u00cc"+
		"\n\22\3\23\3\23\3\23\7\23\u00d1\n\23\f\23\16\23\u00d4\13\23\3\24\3\24"+
		"\5\24\u00d8\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u00e2\n"+
		"\26\f\26\16\26\u00e5\13\26\3\26\3\26\3\27\3\27\7\27\u00eb\n\27\f\27\16"+
		"\27\u00ee\13\27\3\27\3\27\3\30\3\30\3\30\7\30\u00f5\n\30\f\30\16\30\u00f8"+
		"\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u010a\n\31\3\32\3\32\3\32\7\32\u010f\n\32\f\32\16"+
		"\32\u0112\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u011b\n\33\3\34"+
		"\3\34\3\34\3\34\5\34\u0121\n\34\3\35\3\35\3\35\5\35\u0126\n\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0130\n\35\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\7\37\u0139\n\37\f\37\16\37\u013c\13\37\3 \3 \3 \3 \3 "+
		"\3 \5 \u0144\n \3!\3!\3!\3!\7!\u014a\n!\f!\16!\u014d\13!\3!\3!\3\"\3\""+
		"\3\"\3\"\3\"\5\"\u0156\n\"\3#\3#\3#\7#\u015b\n#\f#\16#\u015e\13#\3#\3"+
		"\u00ec\2$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BD\2\7\4\2\37 $$\3\2\31\32\3\2\36!\3\2\37!\4\2\37\37&&\2\u0172\2"+
		"M\3\2\2\2\4P\3\2\2\2\6a\3\2\2\2\bc\3\2\2\2\nx\3\2\2\2\f|\3\2\2\2\16\177"+
		"\3\2\2\2\20\u0083\3\2\2\2\22\u008f\3\2\2\2\24\u0091\3\2\2\2\26\u0099\3"+
		"\2\2\2\30\u009f\3\2\2\2\32\u00a3\3\2\2\2\34\u00b7\3\2\2\2\36\u00b9\3\2"+
		"\2\2 \u00c5\3\2\2\2\"\u00c7\3\2\2\2$\u00cd\3\2\2\2&\u00d5\3\2\2\2(\u00d9"+
		"\3\2\2\2*\u00dd\3\2\2\2,\u00e8\3\2\2\2.\u00f1\3\2\2\2\60\u0109\3\2\2\2"+
		"\62\u010b\3\2\2\2\64\u011a\3\2\2\2\66\u011c\3\2\2\28\u0122\3\2\2\2:\u0131"+
		"\3\2\2\2<\u0135\3\2\2\2>\u0143\3\2\2\2@\u0145\3\2\2\2B\u0150\3\2\2\2D"+
		"\u0157\3\2\2\2FL\5\4\3\2GL\5\b\5\2HL\58\35\2IL\5@!\2JL\5\64\33\2KF\3\2"+
		"\2\2KG\3\2\2\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2"+
		"\2\2N\3\3\2\2\2OM\3\2\2\2PQ\7\7\2\2QR\7 \2\2RV\7\22\2\2SU\5\6\4\2TS\3"+
		"\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7\23\2\2Z\5"+
		"\3\2\2\2[\\\7 \2\2\\]\7\30\2\2]b\7\37\2\2^_\7\b\2\2_`\7\30\2\2`b\7\37"+
		"\2\2a[\3\2\2\2a^\3\2\2\2b\7\3\2\2\2cd\7\3\2\2dg\5\n\6\2ef\7\t\2\2fh\7"+
		" \2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ik\5\16\b\2ji\3\2\2\2jk\3\2\2\2kl\3"+
		"\2\2\2lq\7\22\2\2mr\5\24\13\2nr\5\36\20\2or\5\64\33\2pr\5\66\34\2qm\3"+
		"\2\2\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tu\3"+
		"\2\2\2uv\7\23\2\2v\t\3\2\2\2wy\5\f\7\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z"+
		"{\7 \2\2{\13\3\2\2\2|}\7 \2\2}~\7\33\2\2~\r\3\2\2\2\177\u0080\7\26\2\2"+
		"\u0080\u0081\5\20\t\2\u0081\u0082\7\27\2\2\u0082\17\3\2\2\2\u0083\u0088"+
		"\5\22\n\2\u0084\u0085\7\31\2\2\u0085\u0087\5\22\n\2\u0086\u0084\3\2\2"+
		"\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\21"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7 \2\2\u008c\u008d\7\30\2\2\u008d"+
		"\u0090\t\2\2\2\u008e\u0090\7 \2\2\u008f\u008b\3\2\2\2\u008f\u008e\3\2"+
		"\2\2\u0090\23\3\2\2\2\u0091\u0092\7 \2\2\u0092\u0094\5\26\f\2\u0093\u0095"+
		"\5\30\r\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2"+
		"\u0096\u0098\t\3\2\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\25"+
		"\3\2\2\2\u0099\u009d\7 \2\2\u009a\u009b\7\24\2\2\u009b\u009c\7!\2\2\u009c"+
		"\u009e\7\25\2\2\u009d\u009a\3\2\2\2\u009d\u009e\3\2\2\2\u009e\27\3\2\2"+
		"\2\u009f\u00a0\7\26\2\2\u00a0\u00a1\5\32\16\2\u00a1\u00a2\7\27\2\2\u00a2"+
		"\31\3\2\2\2\u00a3\u00a8\5\34\17\2\u00a4\u00a5\7\31\2\2\u00a5\u00a7\5\34"+
		"\17\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\33\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7 \2\2"+
		"\u00ac\u00ad\7\30\2\2\u00ad\u00b8\t\4\2\2\u00ae\u00b8\7 \2\2\u00af\u00b8"+
		"\7\r\2\2\u00b0\u00b8\7\20\2\2\u00b1\u00b8\7\16\2\2\u00b2\u00b8\7\17\2"+
		"\2\u00b3\u00b8\5\64\33\2\u00b4\u00b5\7\n\2\2\u00b5\u00b6\7\30\2\2\u00b6"+
		"\u00b8\t\5\2\2\u00b7\u00ab\3\2\2\2\u00b7\u00ae\3\2\2\2\u00b7\u00af\3\2"+
		"\2\2\u00b7\u00b0\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b7"+
		"\u00b3\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b8\35\3\2\2\2\u00b9\u00ba\7\6\2"+
		"\2\u00ba\u00bc\7\22\2\2\u00bb\u00bd\5 \21\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c1\7\23\2\2\u00c1\37\3\2\2\2\u00c2\u00c6\5\"\22\2\u00c3"+
		"\u00c6\5&\24\2\u00c4\u00c6\5*\26\2\u00c5\u00c2\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c5\u00c4\3\2\2\2\u00c6!\3\2\2\2\u00c7\u00c8\7\24\2\2\u00c8\u00c9"+
		"\5$\23\2\u00c9\u00cb\7\25\2\2\u00ca\u00cc\5(\25\2\u00cb\u00ca\3\2\2\2"+
		"\u00cb\u00cc\3\2\2\2\u00cc#\3\2\2\2\u00cd\u00d2\7 \2\2\u00ce\u00cf\7\31"+
		"\2\2\u00cf\u00d1\7 \2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3%\3\2\2\2\u00d4\u00d2\3\2\2\2"+
		"\u00d5\u00d7\7 \2\2\u00d6\u00d8\5(\25\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\'\3\2\2\2\u00d9\u00da\7\26\2\2\u00da\u00db\5.\30\2\u00db"+
		"\u00dc\7\27\2\2\u00dc)\3\2\2\2\u00dd\u00de\7\24\2\2\u00de\u00e3\5,\27"+
		"\2\u00df\u00e0\7\31\2\2\u00e0\u00e2\5,\27\2\u00e1\u00df\3\2\2\2\u00e2"+
		"\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2"+
		"\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\7\25\2\2\u00e7+\3\2\2\2\u00e8\u00ec"+
		"\7\36\2\2\u00e9\u00eb\13\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2"+
		"\u00ec\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec"+
		"\3\2\2\2\u00ef\u00f0\7\36\2\2\u00f0-\3\2\2\2\u00f1\u00f6\5\60\31\2\u00f2"+
		"\u00f3\7\31\2\2\u00f3\u00f5\5\60\31\2\u00f4\u00f2\3\2\2\2\u00f5\u00f8"+
		"\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7/\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f9\u00fa\7 \2\2\u00fa\u00fb\7\30\2\2\u00fb\u010a\7\37"+
		"\2\2\u00fc\u00fd\7 \2\2\u00fd\u00fe\7\30\2\2\u00fe\u010a\7 \2\2\u00ff"+
		"\u010a\5\64\33\2\u0100\u010a\7 \2\2\u0101\u010a\7\20\2\2\u0102\u010a\7"+
		"\16\2\2\u0103\u0104\7\21\2\2\u0104\u0105\7\30\2\2\u0105\u010a\7\37\2\2"+
		"\u0106\u0107\7%\2\2\u0107\u0108\7\30\2\2\u0108\u010a\7 \2\2\u0109\u00f9"+
		"\3\2\2\2\u0109\u00fc\3\2\2\2\u0109\u00ff\3\2\2\2\u0109\u0100\3\2\2\2\u0109"+
		"\u0101\3\2\2\2\u0109\u0102\3\2\2\2\u0109\u0103\3\2\2\2\u0109\u0106\3\2"+
		"\2\2\u010a\61\3\2\2\2\u010b\u0110\7 \2\2\u010c\u010d\7\31\2\2\u010d\u010f"+
		"\7 \2\2\u010e\u010c\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\63\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7\b\2"+
		"\2\u0114\u0115\7\30\2\2\u0115\u011b\7\37\2\2\u0116\u0117\7\b\2\2\u0117"+
		"\u0118\7\22\2\2\u0118\u0119\t\6\2\2\u0119\u011b\7\23\2\2\u011a\u0113\3"+
		"\2\2\2\u011a\u0116\3\2\2\2\u011b\65\3\2\2\2\u011c\u011d\7 \2\2\u011d\u011e"+
		"\7\35\2\2\u011e\u0120\7 \2\2\u011f\u0121\5\30\r\2\u0120\u011f\3\2\2\2"+
		"\u0120\u0121\3\2\2\2\u0121\67\3\2\2\2\u0122\u0125\7\4\2\2\u0123\u0124"+
		"\7 \2\2\u0124\u0126\7\30\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0128\5\n\6\2\u0128\u0129\7\33\2\2\u0129\u012a\7"+
		" \2\2\u012a\u012b\7\35\2\2\u012b\u012c\5\n\6\2\u012c\u012d\7\33\2\2\u012d"+
		"\u012f\7 \2\2\u012e\u0130\5:\36\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u01309\3\2\2\2\u0131\u0132\7\26\2\2\u0132\u0133\5<\37\2\u0133\u0134"+
		"\7\27\2\2\u0134;\3\2\2\2\u0135\u013a\5> \2\u0136\u0137\7\31\2\2\u0137"+
		"\u0139\5> \2\u0138\u0136\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2"+
		"\2\u013a\u013b\3\2\2\2\u013b=\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e"+
		"\7\13\2\2\u013e\u013f\7\30\2\2\u013f\u0144\7 \2\2\u0140\u0141\7\f\2\2"+
		"\u0141\u0142\7\30\2\2\u0142\u0144\7 \2\2\u0143\u013d\3\2\2\2\u0143\u0140"+
		"\3\2\2\2\u0144?\3\2\2\2\u0145\u0146\7\5\2\2\u0146\u0147\5\n\6\2\u0147"+
		"\u014b\7\22\2\2\u0148\u014a\5B\"\2\u0149\u0148\3\2\2\2\u014a\u014d\3\2"+
		"\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014e\u014f\7\23\2\2\u014fA\3\2\2\2\u0150\u0155\7 \2\2"+
		"\u0151\u0152\7\26\2\2\u0152\u0153\5\32\16\2\u0153\u0154\7\27\2\2\u0154"+
		"\u0156\3\2\2\2\u0155\u0151\3\2\2\2\u0155\u0156\3\2\2\2\u0156C\3\2\2\2"+
		"\u0157\u015c\7 \2\2\u0158\u0159\7\31\2\2\u0159\u015b\7 \2\2\u015a\u0158"+
		"\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"E\3\2\2\2\u015e\u015c\3\2\2\2%KMVagjqsx\u0088\u008f\u0094\u0097\u009d"+
		"\u00a8\u00b7\u00be\u00c5\u00cb\u00d2\u00d7\u00e3\u00ec\u00f6\u0109\u0110"+
		"\u011a\u0120\u0125\u012f\u013a\u0143\u014b\u0155\u015c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}