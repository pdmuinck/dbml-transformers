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
		STRING_LITERAL=29, IDENTIFIER=30, NUMBER=31, WS=32, COMMENT=33, OPERATOR=34, 
		MULTI_LINE_STRING=35;
	public static final int
		RULE_dbml = 0, RULE_project = 1, RULE_project_settings = 2, RULE_table = 3, 
		RULE_schema_table_name = 4, RULE_schema = 5, RULE_table_settings = 6, 
		RULE_table_setting_list = 7, RULE_table_setting = 8, RULE_column = 9, 
		RULE_type = 10, RULE_column_settings = 11, RULE_column_setting_list = 12, 
		RULE_column_setting = 13, RULE_table_index = 14, RULE_index_entry = 15, 
		RULE_composite_index = 16, RULE_index_columns = 17, RULE_single_column_index = 18, 
		RULE_index_settings = 19, RULE_inline_expression_list = 20, RULE_inline_expression = 21, 
		RULE_expression = 22, RULE_function_call = 23, RULE_index_setting_list = 24, 
		RULE_index_setting = 25, RULE_column_expression_list = 26, RULE_note = 27, 
		RULE_relation = 28, RULE_reference = 29, RULE_reference_long_form = 30, 
		RULE_reference_short_form = 31, RULE_relation_settings = 32, RULE_relation_setting_list = 33, 
		RULE_relation_setting = 34, RULE_enumeration = 35, RULE_enum_entry = 36, 
		RULE_column_list = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"dbml", "project", "project_settings", "table", "schema_table_name", 
			"schema", "table_settings", "table_setting_list", "table_setting", "column", 
			"type", "column_settings", "column_setting_list", "column_setting", "table_index", 
			"index_entry", "composite_index", "index_columns", "single_column_index", 
			"index_settings", "inline_expression_list", "inline_expression", "expression", 
			"function_call", "index_setting_list", "index_setting", "column_expression_list", 
			"note", "relation", "reference", "reference_long_form", "reference_short_form", 
			"relation_settings", "relation_setting_list", "relation_setting", "enumeration", 
			"enum_entry", "column_list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Table'", null, null, "'indexes'", "'Project'", null, "'as'", 
			"'default'", "'delete'", "'update'", "'primary key'", "'unique'", "'not null'", 
			"'pk'", "'name'", "'{'", "'}'", "'('", "')'", "'['", "']'", "':'", "','", 
			"';'", "'.'", "'='", null, "'`'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TABLE", "REF", "ENUM", "INDEXES", "PROJECT", "NOTE", "AS", "DEFAULT", 
			"DELETE", "UPDATE", "PRIMARY_KEY", "UNIQUE", "NOT_NULL", "PK", "NAME", 
			"LBRACE", "RBRACE", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "COLON", 
			"COMMA", "SEMICOLON", "DOT", "ASSIGN", "RELATION_OP", "BACKTICK", "STRING_LITERAL", 
			"IDENTIFIER", "NUMBER", "WS", "COMMENT", "OPERATOR", "MULTI_LINE_STRING"
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
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TABLE) | (1L << REF) | (1L << ENUM) | (1L << PROJECT) | (1L << NOTE))) != 0)) {
				{
				setState(81);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PROJECT:
					{
					setState(76);
					project();
					}
					break;
				case TABLE:
					{
					setState(77);
					table();
					}
					break;
				case REF:
					{
					setState(78);
					reference();
					}
					break;
				case ENUM:
					{
					setState(79);
					enumeration();
					}
					break;
				case NOTE:
					{
					setState(80);
					note();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(85);
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
			setState(86);
			match(PROJECT);
			setState(87);
			match(IDENTIFIER);
			setState(88);
			match(LBRACE);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOTE || _la==IDENTIFIER) {
				{
				{
				setState(89);
				project_settings();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
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
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(IDENTIFIER);
				setState(98);
				match(COLON);
				setState(99);
				match(STRING_LITERAL);
				}
				break;
			case NOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(NOTE);
				setState(101);
				match(COLON);
				setState(102);
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
			setState(105);
			match(TABLE);
			setState(106);
			schema_table_name();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(107);
				match(AS);
				setState(108);
				match(IDENTIFIER);
				}
			}

			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(111);
				table_settings();
				}
			}

			setState(114);
			match(LBRACE);
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(119);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(115);
					column();
					}
					break;
				case 2:
					{
					setState(116);
					table_index();
					}
					break;
				case 3:
					{
					setState(117);
					note();
					}
					break;
				case 4:
					{
					setState(118);
					relation();
					}
					break;
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INDEXES) | (1L << NOTE) | (1L << IDENTIFIER))) != 0) );
			setState(123);
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
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(125);
				schema();
				}
				break;
			}
			setState(128);
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
			setState(130);
			match(IDENTIFIER);
			setState(131);
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
			setState(133);
			match(LBRACKET);
			setState(134);
			table_setting_list();
			setState(135);
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
			setState(137);
			table_setting();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(138);
				match(COMMA);
				setState(139);
				table_setting();
				}
				}
				setState(144);
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
		public TerminalNode IDENTIFIER() { return getToken(DbmlParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(DbmlParser.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(DbmlParser.STRING_LITERAL, 0); }
		public TerminalNode NUMBER() { return getToken(DbmlParser.NUMBER, 0); }
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
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(IDENTIFIER);
				setState(146);
				match(COLON);
				setState(147);
				_la = _input.LA(1);
				if ( !(_la==STRING_LITERAL || _la==NUMBER) ) {
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
				setState(148);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(DbmlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DbmlParser.IDENTIFIER, i);
		}
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
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(IDENTIFIER);
				setState(152);
				type();
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(153);
					column_settings();
					}
				}

				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==SEMICOLON) {
					{
					setState(156);
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
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(IDENTIFIER);
				setState(160);
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
			setState(163);
			match(IDENTIFIER);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(164);
				match(LPAREN);
				setState(165);
				match(NUMBER);
				setState(166);
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
			setState(169);
			match(LBRACKET);
			setState(170);
			column_setting_list();
			setState(171);
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
		public List<ReferenceContext> reference() {
			return getRuleContexts(ReferenceContext.class);
		}
		public ReferenceContext reference(int i) {
			return getRuleContext(ReferenceContext.class,i);
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
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOTE:
			case DEFAULT:
			case PRIMARY_KEY:
			case UNIQUE:
			case NOT_NULL:
			case PK:
			case IDENTIFIER:
				{
				setState(173);
				column_setting();
				}
				break;
			case REF:
				{
				setState(174);
				reference();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==REF || _la==COMMA) {
				{
				setState(180);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COMMA:
					{
					setState(177);
					match(COMMA);
					setState(178);
					column_setting();
					}
					break;
				case REF:
					{
					setState(179);
					reference();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(184);
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
		public Inline_expressionContext inline_expression() {
			return getRuleContext(Inline_expressionContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(DbmlParser.STRING_LITERAL, 0); }
		public TerminalNode NUMBER() { return getToken(DbmlParser.NUMBER, 0); }
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
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(IDENTIFIER);
				setState(186);
				match(COLON);
				setState(191);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(187);
					inline_expression();
					}
					break;
				case 2:
					{
					setState(188);
					match(STRING_LITERAL);
					}
					break;
				case 3:
					{
					setState(189);
					match(NUMBER);
					}
					break;
				case 4:
					{
					setState(190);
					match(IDENTIFIER);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				match(PRIMARY_KEY);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				match(PK);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				match(UNIQUE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(197);
				match(NOT_NULL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(198);
				note();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(199);
				match(DEFAULT);
				setState(200);
				match(COLON);
				setState(205);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(201);
					inline_expression();
					}
					break;
				case 2:
					{
					setState(202);
					match(STRING_LITERAL);
					}
					break;
				case 3:
					{
					setState(203);
					match(NUMBER);
					}
					break;
				case 4:
					{
					setState(204);
					match(IDENTIFIER);
					}
					break;
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
			setState(209);
			match(INDEXES);
			setState(210);
			match(LBRACE);
			setState(212); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(211);
				index_entry();
				}
				}
				setState(214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LPAREN || _la==IDENTIFIER );
			setState(216);
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
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				composite_index();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				single_column_index();
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
			setState(222);
			match(LPAREN);
			setState(223);
			index_columns();
			setState(224);
			match(RPAREN);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(225);
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
		public Column_expression_listContext column_expression_list() {
			return getRuleContext(Column_expression_listContext.class,0);
		}
		public Inline_expression_listContext inline_expression_list() {
			return getRuleContext(Inline_expression_listContext.class,0);
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
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				column_expression_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
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
			setState(232);
			match(IDENTIFIER);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(233);
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
			setState(236);
			match(LBRACKET);
			setState(237);
			index_setting_list();
			setState(238);
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
		public List<Inline_expressionContext> inline_expression() {
			return getRuleContexts(Inline_expressionContext.class);
		}
		public Inline_expressionContext inline_expression(int i) {
			return getRuleContext(Inline_expressionContext.class,i);
		}
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
			setState(240);
			inline_expression();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(241);
				match(COMMA);
				setState(242);
				inline_expression();
				}
				}
				setState(247);
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

	public static class Inline_expressionContext extends ParserRuleContext {
		public List<TerminalNode> BACKTICK() { return getTokens(DbmlParser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(DbmlParser.BACKTICK, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(DbmlParser.IDENTIFIER, 0); }
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
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACKTICK:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(BACKTICK);
				setState(249);
				expression();
				setState(250);
				match(BACKTICK);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(DbmlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DbmlParser.IDENTIFIER, i);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public List<TerminalNode> OPERATOR() { return getTokens(DbmlParser.OPERATOR); }
		public TerminalNode OPERATOR(int i) {
			return getToken(DbmlParser.OPERATOR, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(DbmlParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(DbmlParser.NUMBER, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(255);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(256);
				function_call();
				}
				break;
			}
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATOR) {
				{
				{
				setState(259);
				match(OPERATOR);
				setState(260);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(265);
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

	public static class Function_callContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(DbmlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DbmlParser.IDENTIFIER, i);
		}
		public TerminalNode LPAREN() { return getToken(DbmlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(DbmlParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DbmlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DbmlParser.COMMA, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(IDENTIFIER);
			setState(267);
			match(LPAREN);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(268);
				match(IDENTIFIER);
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(269);
					match(COMMA);
					setState(270);
					match(IDENTIFIER);
					}
					}
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(278);
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
		enterRule(_localctx, 48, RULE_index_setting_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			index_setting();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(281);
				match(COMMA);
				setState(282);
				index_setting();
				}
				}
				setState(287);
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
		enterRule(_localctx, 50, RULE_index_setting);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(IDENTIFIER);
				setState(289);
				match(COLON);
				setState(290);
				match(STRING_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(IDENTIFIER);
				setState(292);
				match(COLON);
				setState(293);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				note();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				match(IDENTIFIER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(296);
				match(PK);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(297);
				match(UNIQUE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(298);
				match(NAME);
				setState(299);
				match(COLON);
				setState(300);
				match(STRING_LITERAL);
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
		enterRule(_localctx, 52, RULE_column_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(IDENTIFIER);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(304);
				match(COMMA);
				setState(305);
				match(IDENTIFIER);
				}
				}
				setState(310);
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
		enterRule(_localctx, 54, RULE_note);
		int _la;
		try {
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(NOTE);
				setState(312);
				match(COLON);
				setState(313);
				match(STRING_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(NOTE);
				setState(315);
				match(LBRACE);
				setState(316);
				_la = _input.LA(1);
				if ( !(_la==STRING_LITERAL || _la==MULTI_LINE_STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(317);
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
		enterRule(_localctx, 56, RULE_relation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(IDENTIFIER);
			setState(321);
			match(RELATION_OP);
			setState(322);
			match(IDENTIFIER);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(323);
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
		public Reference_short_formContext reference_short_form() {
			return getRuleContext(Reference_short_formContext.class,0);
		}
		public TerminalNode REF() { return getToken(DbmlParser.REF, 0); }
		public TerminalNode COLON() { return getToken(DbmlParser.COLON, 0); }
		public TerminalNode RELATION_OP() { return getToken(DbmlParser.RELATION_OP, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(DbmlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DbmlParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(DbmlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(DbmlParser.DOT, i);
		}
		public Reference_long_formContext reference_long_form() {
			return getRuleContext(Reference_long_formContext.class,0);
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
		enterRule(_localctx, 58, RULE_reference);
		try {
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				reference_short_form();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				match(REF);
				setState(328);
				match(COLON);
				setState(329);
				match(RELATION_OP);
				setState(332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(330);
					match(IDENTIFIER);
					setState(331);
					match(DOT);
					}
					break;
				}
				setState(334);
				match(IDENTIFIER);
				setState(335);
				match(DOT);
				setState(336);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(337);
				reference_long_form();
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

	public static class Reference_long_formContext extends ParserRuleContext {
		public TerminalNode REF() { return getToken(DbmlParser.REF, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(DbmlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DbmlParser.IDENTIFIER, i);
		}
		public TerminalNode LBRACE() { return getToken(DbmlParser.LBRACE, 0); }
		public List<TerminalNode> DOT() { return getTokens(DbmlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(DbmlParser.DOT, i);
		}
		public TerminalNode RELATION_OP() { return getToken(DbmlParser.RELATION_OP, 0); }
		public TerminalNode RBRACE() { return getToken(DbmlParser.RBRACE, 0); }
		public Reference_long_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_long_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterReference_long_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitReference_long_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitReference_long_form(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reference_long_formContext reference_long_form() throws RecognitionException {
		Reference_long_formContext _localctx = new Reference_long_formContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_reference_long_form);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(REF);
			setState(341);
			match(IDENTIFIER);
			setState(342);
			match(LBRACE);
			setState(343);
			match(IDENTIFIER);
			setState(344);
			match(DOT);
			setState(345);
			match(IDENTIFIER);
			setState(346);
			match(RELATION_OP);
			setState(347);
			match(IDENTIFIER);
			setState(348);
			match(DOT);
			setState(349);
			match(IDENTIFIER);
			setState(350);
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

	public static class Reference_short_formContext extends ParserRuleContext {
		public TerminalNode REF() { return getToken(DbmlParser.REF, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(DbmlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DbmlParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(DbmlParser.COLON, 0); }
		public List<TerminalNode> DOT() { return getTokens(DbmlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(DbmlParser.DOT, i);
		}
		public TerminalNode RELATION_OP() { return getToken(DbmlParser.RELATION_OP, 0); }
		public Reference_short_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_short_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).enterReference_short_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DbmlParserListener ) ((DbmlParserListener)listener).exitReference_short_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DbmlParserVisitor ) return ((DbmlParserVisitor<? extends T>)visitor).visitReference_short_form(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reference_short_formContext reference_short_form() throws RecognitionException {
		Reference_short_formContext _localctx = new Reference_short_formContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_reference_short_form);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(REF);
			setState(353);
			match(IDENTIFIER);
			setState(354);
			match(COLON);
			setState(355);
			match(IDENTIFIER);
			setState(356);
			match(DOT);
			setState(357);
			match(IDENTIFIER);
			setState(358);
			match(RELATION_OP);
			setState(359);
			match(IDENTIFIER);
			setState(360);
			match(DOT);
			setState(361);
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
		enterRule(_localctx, 64, RULE_relation_settings);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(LBRACKET);
			setState(364);
			relation_setting_list();
			setState(365);
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
		enterRule(_localctx, 66, RULE_relation_setting_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			relation_setting();
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(368);
				match(COMMA);
				setState(369);
				relation_setting();
				}
				}
				setState(374);
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
		enterRule(_localctx, 68, RULE_relation_setting);
		try {
			setState(381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELETE:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(DELETE);
				setState(376);
				match(COLON);
				setState(377);
				match(IDENTIFIER);
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				match(UPDATE);
				setState(379);
				match(COLON);
				setState(380);
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
		public TerminalNode IDENTIFIER() { return getToken(DbmlParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 70, RULE_enumeration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(ENUM);
			setState(384);
			match(IDENTIFIER);
			setState(385);
			match(LBRACE);
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(386);
				enum_entry();
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(392);
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
		enterRule(_localctx, 72, RULE_enum_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(IDENTIFIER);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(395);
				match(LBRACKET);
				setState(396);
				column_setting_list();
				setState(397);
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
		enterRule(_localctx, 74, RULE_column_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(IDENTIFIER);
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(402);
				match(COMMA);
				setState(403);
				match(IDENTIFIER);
				}
				}
				setState(408);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u019c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\7\2T\n"+
		"\2\f\2\16\2W\13\2\3\3\3\3\3\3\3\3\7\3]\n\3\f\3\16\3`\13\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4j\n\4\3\5\3\5\3\5\3\5\5\5p\n\5\3\5\5\5s\n\5\3"+
		"\5\3\5\3\5\3\5\3\5\6\5z\n\5\r\5\16\5{\3\5\3\5\3\6\5\6\u0081\n\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u008f\n\t\f\t\16\t\u0092"+
		"\13\t\3\n\3\n\3\n\3\n\5\n\u0098\n\n\3\13\3\13\3\13\5\13\u009d\n\13\3\13"+
		"\5\13\u00a0\n\13\3\13\3\13\5\13\u00a4\n\13\3\f\3\f\3\f\3\f\5\f\u00aa\n"+
		"\f\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u00b2\n\16\3\16\3\16\3\16\7\16\u00b7"+
		"\n\16\f\16\16\16\u00ba\13\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c2"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00d0\n\17\5\17\u00d2\n\17\3\20\3\20\3\20\6\20\u00d7\n\20\r\20\16\20"+
		"\u00d8\3\20\3\20\3\21\3\21\5\21\u00df\n\21\3\22\3\22\3\22\3\22\5\22\u00e5"+
		"\n\22\3\23\3\23\5\23\u00e9\n\23\3\24\3\24\5\24\u00ed\n\24\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\7\26\u00f6\n\26\f\26\16\26\u00f9\13\26\3\27\3"+
		"\27\3\27\3\27\3\27\5\27\u0100\n\27\3\30\3\30\5\30\u0104\n\30\3\30\3\30"+
		"\7\30\u0108\n\30\f\30\16\30\u010b\13\30\3\31\3\31\3\31\3\31\3\31\7\31"+
		"\u0112\n\31\f\31\16\31\u0115\13\31\5\31\u0117\n\31\3\31\3\31\3\32\3\32"+
		"\3\32\7\32\u011e\n\32\f\32\16\32\u0121\13\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0130\n\33\3\34\3\34\3\34"+
		"\7\34\u0135\n\34\f\34\16\34\u0138\13\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u0141\n\35\3\36\3\36\3\36\3\36\5\36\u0147\n\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\5\37\u014f\n\37\3\37\3\37\3\37\3\37\5\37\u0155\n\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3\"\3\"\3\"\3\"\3#\3#\3#\7#\u0175\n#\f#\16#\u0178\13#\3$\3$\3$\3$\3$"+
		"\3$\5$\u0180\n$\3%\3%\3%\3%\7%\u0186\n%\f%\16%\u0189\13%\3%\3%\3&\3&\3"+
		"&\3&\3&\5&\u0192\n&\3\'\3\'\3\'\7\'\u0197\n\'\f\'\16\'\u019a\13\'\3\'"+
		"\2\2(\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>"+
		"@BDFHJL\2\6\4\2\37\37!!\3\2\31\32\3\2 !\4\2\37\37%%\2\u01b6\2U\3\2\2\2"+
		"\4X\3\2\2\2\6i\3\2\2\2\bk\3\2\2\2\n\u0080\3\2\2\2\f\u0084\3\2\2\2\16\u0087"+
		"\3\2\2\2\20\u008b\3\2\2\2\22\u0097\3\2\2\2\24\u00a3\3\2\2\2\26\u00a5\3"+
		"\2\2\2\30\u00ab\3\2\2\2\32\u00b1\3\2\2\2\34\u00d1\3\2\2\2\36\u00d3\3\2"+
		"\2\2 \u00de\3\2\2\2\"\u00e0\3\2\2\2$\u00e8\3\2\2\2&\u00ea\3\2\2\2(\u00ee"+
		"\3\2\2\2*\u00f2\3\2\2\2,\u00ff\3\2\2\2.\u0103\3\2\2\2\60\u010c\3\2\2\2"+
		"\62\u011a\3\2\2\2\64\u012f\3\2\2\2\66\u0131\3\2\2\28\u0140\3\2\2\2:\u0142"+
		"\3\2\2\2<\u0154\3\2\2\2>\u0156\3\2\2\2@\u0162\3\2\2\2B\u016d\3\2\2\2D"+
		"\u0171\3\2\2\2F\u017f\3\2\2\2H\u0181\3\2\2\2J\u018c\3\2\2\2L\u0193\3\2"+
		"\2\2NT\5\4\3\2OT\5\b\5\2PT\5<\37\2QT\5H%\2RT\58\35\2SN\3\2\2\2SO\3\2\2"+
		"\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\3\3\2"+
		"\2\2WU\3\2\2\2XY\7\7\2\2YZ\7 \2\2Z^\7\22\2\2[]\5\6\4\2\\[\3\2\2\2]`\3"+
		"\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab\7\23\2\2b\5\3\2\2\2"+
		"cd\7 \2\2de\7\30\2\2ej\7\37\2\2fg\7\b\2\2gh\7\30\2\2hj\7\37\2\2ic\3\2"+
		"\2\2if\3\2\2\2j\7\3\2\2\2kl\7\3\2\2lo\5\n\6\2mn\7\t\2\2np\7 \2\2om\3\2"+
		"\2\2op\3\2\2\2pr\3\2\2\2qs\5\16\b\2rq\3\2\2\2rs\3\2\2\2st\3\2\2\2ty\7"+
		"\22\2\2uz\5\24\13\2vz\5\36\20\2wz\58\35\2xz\5:\36\2yu\3\2\2\2yv\3\2\2"+
		"\2yw\3\2\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\23"+
		"\2\2~\t\3\2\2\2\177\u0081\5\f\7\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2"+
		"\2\u0081\u0082\3\2\2\2\u0082\u0083\7 \2\2\u0083\13\3\2\2\2\u0084\u0085"+
		"\7 \2\2\u0085\u0086\7\33\2\2\u0086\r\3\2\2\2\u0087\u0088\7\26\2\2\u0088"+
		"\u0089\5\20\t\2\u0089\u008a\7\27\2\2\u008a\17\3\2\2\2\u008b\u0090\5\22"+
		"\n\2\u008c\u008d\7\31\2\2\u008d\u008f\5\22\n\2\u008e\u008c\3\2\2\2\u008f"+
		"\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\21\3\2\2"+
		"\2\u0092\u0090\3\2\2\2\u0093\u0094\7 \2\2\u0094\u0095\7\30\2\2\u0095\u0098"+
		"\t\2\2\2\u0096\u0098\7 \2\2\u0097\u0093\3\2\2\2\u0097\u0096\3\2\2\2\u0098"+
		"\23\3\2\2\2\u0099\u009a\7 \2\2\u009a\u009c\5\26\f\2\u009b\u009d\5\30\r"+
		"\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u00a0"+
		"\t\3\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a4\3\2\2\2\u00a1"+
		"\u00a2\7 \2\2\u00a2\u00a4\7 \2\2\u00a3\u0099\3\2\2\2\u00a3\u00a1\3\2\2"+
		"\2\u00a4\25\3\2\2\2\u00a5\u00a9\7 \2\2\u00a6\u00a7\7\24\2\2\u00a7\u00a8"+
		"\7!\2\2\u00a8\u00aa\7\25\2\2\u00a9\u00a6\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\27\3\2\2\2\u00ab\u00ac\7\26\2\2\u00ac\u00ad\5\32\16\2\u00ad\u00ae\7\27"+
		"\2\2\u00ae\31\3\2\2\2\u00af\u00b2\5\34\17\2\u00b0\u00b2\5<\37\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b8\3\2\2\2\u00b3\u00b4\7\31"+
		"\2\2\u00b4\u00b7\5\34\17\2\u00b5\u00b7\5<\37\2\u00b6\u00b3\3\2\2\2\u00b6"+
		"\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\33\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7 \2\2\u00bc\u00c1"+
		"\7\30\2\2\u00bd\u00c2\5,\27\2\u00be\u00c2\7\37\2\2\u00bf\u00c2\7!\2\2"+
		"\u00c0\u00c2\7 \2\2\u00c1\u00bd\3\2\2\2\u00c1\u00be\3\2\2\2\u00c1\u00bf"+
		"\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00d2\3\2\2\2\u00c3\u00d2\7 \2\2\u00c4"+
		"\u00d2\7\r\2\2\u00c5\u00d2\7\20\2\2\u00c6\u00d2\7\16\2\2\u00c7\u00d2\7"+
		"\17\2\2\u00c8\u00d2\58\35\2\u00c9\u00ca\7\n\2\2\u00ca\u00cf\7\30\2\2\u00cb"+
		"\u00d0\5,\27\2\u00cc\u00d0\7\37\2\2\u00cd\u00d0\7!\2\2\u00ce\u00d0\7 "+
		"\2\2\u00cf\u00cb\3\2\2\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00ce\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00bb\3\2\2\2\u00d1\u00c3\3\2"+
		"\2\2\u00d1\u00c4\3\2\2\2\u00d1\u00c5\3\2\2\2\u00d1\u00c6\3\2\2\2\u00d1"+
		"\u00c7\3\2\2\2\u00d1\u00c8\3\2\2\2\u00d1\u00c9\3\2\2\2\u00d2\35\3\2\2"+
		"\2\u00d3\u00d4\7\6\2\2\u00d4\u00d6\7\22\2\2\u00d5\u00d7\5 \21\2\u00d6"+
		"\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\7\23\2\2\u00db\37\3\2\2\2\u00dc\u00df"+
		"\5\"\22\2\u00dd\u00df\5&\24\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2"+
		"\u00df!\3\2\2\2\u00e0\u00e1\7\24\2\2\u00e1\u00e2\5$\23\2\u00e2\u00e4\7"+
		"\25\2\2\u00e3\u00e5\5(\25\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"#\3\2\2\2\u00e6\u00e9\5\66\34\2\u00e7\u00e9\5*\26\2\u00e8\u00e6\3\2\2"+
		"\2\u00e8\u00e7\3\2\2\2\u00e9%\3\2\2\2\u00ea\u00ec\7 \2\2\u00eb\u00ed\5"+
		"(\25\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\'\3\2\2\2\u00ee\u00ef"+
		"\7\26\2\2\u00ef\u00f0\5\62\32\2\u00f0\u00f1\7\27\2\2\u00f1)\3\2\2\2\u00f2"+
		"\u00f7\5,\27\2\u00f3\u00f4\7\31\2\2\u00f4\u00f6\5,\27\2\u00f5\u00f3\3"+
		"\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"+\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7\36\2\2\u00fb\u00fc\5.\30\2"+
		"\u00fc\u00fd\7\36\2\2\u00fd\u0100\3\2\2\2\u00fe\u0100\7 \2\2\u00ff\u00fa"+
		"\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100-\3\2\2\2\u0101\u0104\7 \2\2\u0102\u0104"+
		"\5\60\31\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104\u0109\3\2\2\2"+
		"\u0105\u0106\7$\2\2\u0106\u0108\t\4\2\2\u0107\u0105\3\2\2\2\u0108\u010b"+
		"\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a/\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010c\u010d\7 \2\2\u010d\u0116\7\24\2\2\u010e\u0113\7 "+
		"\2\2\u010f\u0110\7\31\2\2\u0110\u0112\7 \2\2\u0111\u010f\3\2\2\2\u0112"+
		"\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0117\3\2"+
		"\2\2\u0115\u0113\3\2\2\2\u0116\u010e\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u0119\7\25\2\2\u0119\61\3\2\2\2\u011a\u011f\5\64"+
		"\33\2\u011b\u011c\7\31\2\2\u011c\u011e\5\64\33\2\u011d\u011b\3\2\2\2\u011e"+
		"\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\63\3\2\2"+
		"\2\u0121\u011f\3\2\2\2\u0122\u0123\7 \2\2\u0123\u0124\7\30\2\2\u0124\u0130"+
		"\7\37\2\2\u0125\u0126\7 \2\2\u0126\u0127\7\30\2\2\u0127\u0130\7 \2\2\u0128"+
		"\u0130\58\35\2\u0129\u0130\7 \2\2\u012a\u0130\7\20\2\2\u012b\u0130\7\16"+
		"\2\2\u012c\u012d\7\21\2\2\u012d\u012e\7\30\2\2\u012e\u0130\7\37\2\2\u012f"+
		"\u0122\3\2\2\2\u012f\u0125\3\2\2\2\u012f\u0128\3\2\2\2\u012f\u0129\3\2"+
		"\2\2\u012f\u012a\3\2\2\2\u012f\u012b\3\2\2\2\u012f\u012c\3\2\2\2\u0130"+
		"\65\3\2\2\2\u0131\u0136\7 \2\2\u0132\u0133\7\31\2\2\u0133\u0135\7 \2\2"+
		"\u0134\u0132\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137"+
		"\3\2\2\2\u0137\67\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7\b\2\2\u013a"+
		"\u013b\7\30\2\2\u013b\u0141\7\37\2\2\u013c\u013d\7\b\2\2\u013d\u013e\7"+
		"\22\2\2\u013e\u013f\t\5\2\2\u013f\u0141\7\23\2\2\u0140\u0139\3\2\2\2\u0140"+
		"\u013c\3\2\2\2\u01419\3\2\2\2\u0142\u0143\7 \2\2\u0143\u0144\7\35\2\2"+
		"\u0144\u0146\7 \2\2\u0145\u0147\5\30\r\2\u0146\u0145\3\2\2\2\u0146\u0147"+
		"\3\2\2\2\u0147;\3\2\2\2\u0148\u0155\5@!\2\u0149\u014a\7\4\2\2\u014a\u014b"+
		"\7\30\2\2\u014b\u014e\7\35\2\2\u014c\u014d\7 \2\2\u014d\u014f\7\33\2\2"+
		"\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151"+
		"\7 \2\2\u0151\u0152\7\33\2\2\u0152\u0155\7 \2\2\u0153\u0155\5> \2\u0154"+
		"\u0148\3\2\2\2\u0154\u0149\3\2\2\2\u0154\u0153\3\2\2\2\u0155=\3\2\2\2"+
		"\u0156\u0157\7\4\2\2\u0157\u0158\7 \2\2\u0158\u0159\7\22\2\2\u0159\u015a"+
		"\7 \2\2\u015a\u015b\7\33\2\2\u015b\u015c\7 \2\2\u015c\u015d\7\35\2\2\u015d"+
		"\u015e\7 \2\2\u015e\u015f\7\33\2\2\u015f\u0160\7 \2\2\u0160\u0161\7\23"+
		"\2\2\u0161?\3\2\2\2\u0162\u0163\7\4\2\2\u0163\u0164\7 \2\2\u0164\u0165"+
		"\7\30\2\2\u0165\u0166\7 \2\2\u0166\u0167\7\33\2\2\u0167\u0168\7 \2\2\u0168"+
		"\u0169\7\35\2\2\u0169\u016a\7 \2\2\u016a\u016b\7\33\2\2\u016b\u016c\7"+
		" \2\2\u016cA\3\2\2\2\u016d\u016e\7\26\2\2\u016e\u016f\5D#\2\u016f\u0170"+
		"\7\27\2\2\u0170C\3\2\2\2\u0171\u0176\5F$\2\u0172\u0173\7\31\2\2\u0173"+
		"\u0175\5F$\2\u0174\u0172\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2"+
		"\2\u0176\u0177\3\2\2\2\u0177E\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017a"+
		"\7\13\2\2\u017a\u017b\7\30\2\2\u017b\u0180\7 \2\2\u017c\u017d\7\f\2\2"+
		"\u017d\u017e\7\30\2\2\u017e\u0180\7 \2\2\u017f\u0179\3\2\2\2\u017f\u017c"+
		"\3\2\2\2\u0180G\3\2\2\2\u0181\u0182\7\5\2\2\u0182\u0183\7 \2\2\u0183\u0187"+
		"\7\22\2\2\u0184\u0186\5J&\2\u0185\u0184\3\2\2\2\u0186\u0189\3\2\2\2\u0187"+
		"\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2\2\2\u0189\u0187\3\2"+
		"\2\2\u018a\u018b\7\23\2\2\u018bI\3\2\2\2\u018c\u0191\7 \2\2\u018d\u018e"+
		"\7\26\2\2\u018e\u018f\5\32\16\2\u018f\u0190\7\27\2\2\u0190\u0192\3\2\2"+
		"\2\u0191\u018d\3\2\2\2\u0191\u0192\3\2\2\2\u0192K\3\2\2\2\u0193\u0198"+
		"\7 \2\2\u0194\u0195\7\31\2\2\u0195\u0197\7 \2\2\u0196\u0194\3\2\2\2\u0197"+
		"\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199M\3\2\2\2"+
		"\u019a\u0198\3\2\2\2.SU^iory{\u0080\u0090\u0097\u009c\u009f\u00a3\u00a9"+
		"\u00b1\u00b6\u00b8\u00c1\u00cf\u00d1\u00d8\u00de\u00e4\u00e8\u00ec\u00f7"+
		"\u00ff\u0103\u0109\u0113\u0116\u011f\u012f\u0136\u0140\u0146\u014e\u0154"+
		"\u0176\u017f\u0187\u0191\u0198";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}