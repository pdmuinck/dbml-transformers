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
		HEX_COLOR=35, MULTI_LINE_STRING=36;
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
		RULE_relation = 28, RULE_reference = 29, RULE_relation_settings = 30, 
		RULE_relation_setting_list = 31, RULE_relation_setting = 32, RULE_enumeration = 33, 
		RULE_enum_entry = 34, RULE_column_list = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"dbml", "project", "project_settings", "table", "schema_table_name", 
			"schema", "table_settings", "table_setting_list", "table_setting", "column", 
			"type", "column_settings", "column_setting_list", "column_setting", "table_index", 
			"index_entry", "composite_index", "index_columns", "single_column_index", 
			"index_settings", "inline_expression_list", "inline_expression", "expression", 
			"function_call", "index_setting_list", "index_setting", "column_expression_list", 
			"note", "relation", "reference", "relation_settings", "relation_setting_list", 
			"relation_setting", "enumeration", "enum_entry", "column_list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Table'", "'Ref'", "'Enum'", "'indexes'", "'Project'", null, "'as'", 
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
			"IDENTIFIER", "NUMBER", "WS", "COMMENT", "OPERATOR", "HEX_COLOR", "MULTI_LINE_STRING"
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
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TABLE) | (1L << REF) | (1L << ENUM) | (1L << PROJECT) | (1L << NOTE))) != 0)) {
				{
				setState(77);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PROJECT:
					{
					setState(72);
					project();
					}
					break;
				case TABLE:
					{
					setState(73);
					table();
					}
					break;
				case REF:
					{
					setState(74);
					reference();
					}
					break;
				case ENUM:
					{
					setState(75);
					enumeration();
					}
					break;
				case NOTE:
					{
					setState(76);
					note();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(81);
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
			setState(82);
			match(PROJECT);
			setState(83);
			match(IDENTIFIER);
			setState(84);
			match(LBRACE);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOTE || _la==IDENTIFIER) {
				{
				{
				setState(85);
				project_settings();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
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
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(IDENTIFIER);
				setState(94);
				match(COLON);
				setState(95);
				match(STRING_LITERAL);
				}
				break;
			case NOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(NOTE);
				setState(97);
				match(COLON);
				setState(98);
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
			setState(101);
			match(TABLE);
			setState(102);
			schema_table_name();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(103);
				match(AS);
				setState(104);
				match(IDENTIFIER);
				}
			}

			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(107);
				table_settings();
				}
			}

			setState(110);
			match(LBRACE);
			setState(115); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(115);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(111);
					column();
					}
					break;
				case 2:
					{
					setState(112);
					table_index();
					}
					break;
				case 3:
					{
					setState(113);
					note();
					}
					break;
				case 4:
					{
					setState(114);
					relation();
					}
					break;
				}
				}
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INDEXES) | (1L << NOTE) | (1L << IDENTIFIER))) != 0) );
			setState(119);
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
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(121);
				schema();
				}
				break;
			}
			setState(124);
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
			setState(126);
			match(IDENTIFIER);
			setState(127);
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
			setState(129);
			match(LBRACKET);
			setState(130);
			table_setting_list();
			setState(131);
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
			setState(133);
			table_setting();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(134);
				match(COMMA);
				setState(135);
				table_setting();
				}
				}
				setState(140);
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
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(IDENTIFIER);
				setState(142);
				match(COLON);
				setState(143);
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
				setState(144);
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
			setState(147);
			match(IDENTIFIER);
			setState(148);
			type();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(149);
				column_settings();
				}
			}

			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA || _la==SEMICOLON) {
				{
				setState(152);
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
			setState(155);
			match(IDENTIFIER);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(156);
				match(LPAREN);
				setState(157);
				match(NUMBER);
				setState(158);
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
			setState(161);
			match(LBRACKET);
			setState(162);
			column_setting_list();
			setState(163);
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
			setState(165);
			column_setting();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(166);
				match(COMMA);
				setState(167);
				column_setting();
				}
				}
				setState(172);
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
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(IDENTIFIER);
				setState(174);
				match(COLON);
				setState(179);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(175);
					inline_expression();
					}
					break;
				case 2:
					{
					setState(176);
					match(STRING_LITERAL);
					}
					break;
				case 3:
					{
					setState(177);
					match(NUMBER);
					}
					break;
				case 4:
					{
					setState(178);
					match(IDENTIFIER);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				match(PRIMARY_KEY);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				match(PK);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				match(UNIQUE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(185);
				match(NOT_NULL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(186);
				note();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(187);
				match(DEFAULT);
				setState(188);
				match(COLON);
				setState(193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(189);
					inline_expression();
					}
					break;
				case 2:
					{
					setState(190);
					match(STRING_LITERAL);
					}
					break;
				case 3:
					{
					setState(191);
					match(NUMBER);
					}
					break;
				case 4:
					{
					setState(192);
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
			setState(197);
			match(INDEXES);
			setState(198);
			match(LBRACE);
			setState(200); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(199);
				index_entry();
				}
				}
				setState(202); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LPAREN || _la==IDENTIFIER );
			setState(204);
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
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				composite_index();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
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
			setState(210);
			match(LPAREN);
			setState(211);
			index_columns();
			setState(212);
			match(RPAREN);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(213);
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
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				column_expression_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
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
			setState(220);
			match(IDENTIFIER);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(221);
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
			setState(224);
			match(LBRACKET);
			setState(225);
			index_setting_list();
			setState(226);
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
			setState(228);
			inline_expression();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(229);
				match(COMMA);
				setState(230);
				inline_expression();
				}
				}
				setState(235);
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
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACKTICK:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(BACKTICK);
				setState(237);
				expression();
				setState(238);
				match(BACKTICK);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
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
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(243);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(244);
				function_call();
				}
				break;
			}
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATOR) {
				{
				{
				setState(247);
				match(OPERATOR);
				setState(248);
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
				setState(253);
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
			setState(254);
			match(IDENTIFIER);
			setState(255);
			match(LPAREN);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(256);
				match(IDENTIFIER);
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(257);
					match(COMMA);
					setState(258);
					match(IDENTIFIER);
					}
					}
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(266);
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
			setState(268);
			index_setting();
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(269);
				match(COMMA);
				setState(270);
				index_setting();
				}
				}
				setState(275);
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
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(IDENTIFIER);
				setState(277);
				match(COLON);
				setState(278);
				match(STRING_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(IDENTIFIER);
				setState(280);
				match(COLON);
				setState(281);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				note();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(283);
				match(IDENTIFIER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(284);
				match(PK);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(285);
				match(UNIQUE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(286);
				match(NAME);
				setState(287);
				match(COLON);
				setState(288);
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
			setState(291);
			match(IDENTIFIER);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(292);
				match(COMMA);
				setState(293);
				match(IDENTIFIER);
				}
				}
				setState(298);
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
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(NOTE);
				setState(300);
				match(COLON);
				setState(301);
				match(STRING_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				match(NOTE);
				setState(303);
				match(LBRACE);
				setState(304);
				_la = _input.LA(1);
				if ( !(_la==STRING_LITERAL || _la==MULTI_LINE_STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(305);
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
			setState(308);
			match(IDENTIFIER);
			setState(309);
			match(RELATION_OP);
			setState(310);
			match(IDENTIFIER);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(311);
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
		enterRule(_localctx, 58, RULE_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(REF);
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(315);
				match(IDENTIFIER);
				setState(316);
				match(COLON);
				}
				break;
			}
			setState(319);
			schema_table_name();
			setState(320);
			match(DOT);
			setState(321);
			match(IDENTIFIER);
			setState(322);
			match(RELATION_OP);
			setState(323);
			schema_table_name();
			setState(324);
			match(DOT);
			setState(325);
			match(IDENTIFIER);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(326);
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
		enterRule(_localctx, 60, RULE_relation_settings);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(LBRACKET);
			setState(330);
			relation_setting_list();
			setState(331);
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
		enterRule(_localctx, 62, RULE_relation_setting_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			relation_setting();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(334);
				match(COMMA);
				setState(335);
				relation_setting();
				}
				}
				setState(340);
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
		enterRule(_localctx, 64, RULE_relation_setting);
		try {
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELETE:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(DELETE);
				setState(342);
				match(COLON);
				setState(343);
				match(IDENTIFIER);
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				match(UPDATE);
				setState(345);
				match(COLON);
				setState(346);
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
		enterRule(_localctx, 66, RULE_enumeration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(ENUM);
			setState(350);
			schema_table_name();
			setState(351);
			match(LBRACE);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(352);
				enum_entry();
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358);
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
		enterRule(_localctx, 68, RULE_enum_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(IDENTIFIER);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(361);
				match(LBRACKET);
				setState(362);
				column_setting_list();
				setState(363);
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
		enterRule(_localctx, 70, RULE_column_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(IDENTIFIER);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(368);
				match(COMMA);
				setState(369);
				match(IDENTIFIER);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u017a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\7\2P\n\2\f\2\16\2S\13"+
		"\2\3\3\3\3\3\3\3\3\7\3Y\n\3\f\3\16\3\\\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4f\n\4\3\5\3\5\3\5\3\5\5\5l\n\5\3\5\5\5o\n\5\3\5\3\5\3\5\3\5"+
		"\3\5\6\5v\n\5\r\5\16\5w\3\5\3\5\3\6\5\6}\n\6\3\6\3\6\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\7\t\u008b\n\t\f\t\16\t\u008e\13\t\3\n\3\n\3\n\3"+
		"\n\5\n\u0094\n\n\3\13\3\13\3\13\5\13\u0099\n\13\3\13\5\13\u009c\n\13\3"+
		"\f\3\f\3\f\3\f\5\f\u00a2\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16\u00ab"+
		"\n\16\f\16\16\16\u00ae\13\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b6"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00c4\n\17\5\17\u00c6\n\17\3\20\3\20\3\20\6\20\u00cb\n\20\r\20\16\20"+
		"\u00cc\3\20\3\20\3\21\3\21\5\21\u00d3\n\21\3\22\3\22\3\22\3\22\5\22\u00d9"+
		"\n\22\3\23\3\23\5\23\u00dd\n\23\3\24\3\24\5\24\u00e1\n\24\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\7\26\u00ea\n\26\f\26\16\26\u00ed\13\26\3\27\3"+
		"\27\3\27\3\27\3\27\5\27\u00f4\n\27\3\30\3\30\5\30\u00f8\n\30\3\30\3\30"+
		"\7\30\u00fc\n\30\f\30\16\30\u00ff\13\30\3\31\3\31\3\31\3\31\3\31\7\31"+
		"\u0106\n\31\f\31\16\31\u0109\13\31\5\31\u010b\n\31\3\31\3\31\3\32\3\32"+
		"\3\32\7\32\u0112\n\32\f\32\16\32\u0115\13\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0124\n\33\3\34\3\34\3\34"+
		"\7\34\u0129\n\34\f\34\16\34\u012c\13\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u0135\n\35\3\36\3\36\3\36\3\36\5\36\u013b\n\36\3\37\3\37\3"+
		"\37\5\37\u0140\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u014a"+
		"\n\37\3 \3 \3 \3 \3!\3!\3!\7!\u0153\n!\f!\16!\u0156\13!\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\5\"\u015e\n\"\3#\3#\3#\3#\7#\u0164\n#\f#\16#\u0167\13#\3#\3"+
		"#\3$\3$\3$\3$\3$\5$\u0170\n$\3%\3%\3%\7%\u0175\n%\f%\16%\u0178\13%\3%"+
		"\2\2&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>"+
		"@BDFH\2\6\4\2\37 %%\3\2\31\32\3\2 !\4\2\37\37&&\2\u0192\2Q\3\2\2\2\4T"+
		"\3\2\2\2\6e\3\2\2\2\bg\3\2\2\2\n|\3\2\2\2\f\u0080\3\2\2\2\16\u0083\3\2"+
		"\2\2\20\u0087\3\2\2\2\22\u0093\3\2\2\2\24\u0095\3\2\2\2\26\u009d\3\2\2"+
		"\2\30\u00a3\3\2\2\2\32\u00a7\3\2\2\2\34\u00c5\3\2\2\2\36\u00c7\3\2\2\2"+
		" \u00d2\3\2\2\2\"\u00d4\3\2\2\2$\u00dc\3\2\2\2&\u00de\3\2\2\2(\u00e2\3"+
		"\2\2\2*\u00e6\3\2\2\2,\u00f3\3\2\2\2.\u00f7\3\2\2\2\60\u0100\3\2\2\2\62"+
		"\u010e\3\2\2\2\64\u0123\3\2\2\2\66\u0125\3\2\2\28\u0134\3\2\2\2:\u0136"+
		"\3\2\2\2<\u013c\3\2\2\2>\u014b\3\2\2\2@\u014f\3\2\2\2B\u015d\3\2\2\2D"+
		"\u015f\3\2\2\2F\u016a\3\2\2\2H\u0171\3\2\2\2JP\5\4\3\2KP\5\b\5\2LP\5<"+
		"\37\2MP\5D#\2NP\58\35\2OJ\3\2\2\2OK\3\2\2\2OL\3\2\2\2OM\3\2\2\2ON\3\2"+
		"\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\3\3\2\2\2SQ\3\2\2\2TU\7\7\2\2UV\7"+
		" \2\2VZ\7\22\2\2WY\5\6\4\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]"+
		"\3\2\2\2\\Z\3\2\2\2]^\7\23\2\2^\5\3\2\2\2_`\7 \2\2`a\7\30\2\2af\7\37\2"+
		"\2bc\7\b\2\2cd\7\30\2\2df\7\37\2\2e_\3\2\2\2eb\3\2\2\2f\7\3\2\2\2gh\7"+
		"\3\2\2hk\5\n\6\2ij\7\t\2\2jl\7 \2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mo\5"+
		"\16\b\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pu\7\22\2\2qv\5\24\13\2rv\5\36\20"+
		"\2sv\58\35\2tv\5:\36\2uq\3\2\2\2ur\3\2\2\2us\3\2\2\2ut\3\2\2\2vw\3\2\2"+
		"\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\23\2\2z\t\3\2\2\2{}\5\f\7\2|{\3\2"+
		"\2\2|}\3\2\2\2}~\3\2\2\2~\177\7 \2\2\177\13\3\2\2\2\u0080\u0081\7 \2\2"+
		"\u0081\u0082\7\33\2\2\u0082\r\3\2\2\2\u0083\u0084\7\26\2\2\u0084\u0085"+
		"\5\20\t\2\u0085\u0086\7\27\2\2\u0086\17\3\2\2\2\u0087\u008c\5\22\n\2\u0088"+
		"\u0089\7\31\2\2\u0089\u008b\5\22\n\2\u008a\u0088\3\2\2\2\u008b\u008e\3"+
		"\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\21\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\u0090\7 \2\2\u0090\u0091\7\30\2\2\u0091\u0094\t\2"+
		"\2\2\u0092\u0094\7 \2\2\u0093\u008f\3\2\2\2\u0093\u0092\3\2\2\2\u0094"+
		"\23\3\2\2\2\u0095\u0096\7 \2\2\u0096\u0098\5\26\f\2\u0097\u0099\5\30\r"+
		"\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u009c"+
		"\t\3\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\25\3\2\2\2\u009d"+
		"\u00a1\7 \2\2\u009e\u009f\7\24\2\2\u009f\u00a0\7!\2\2\u00a0\u00a2\7\25"+
		"\2\2\u00a1\u009e\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\27\3\2\2\2\u00a3\u00a4"+
		"\7\26\2\2\u00a4\u00a5\5\32\16\2\u00a5\u00a6\7\27\2\2\u00a6\31\3\2\2\2"+
		"\u00a7\u00ac\5\34\17\2\u00a8\u00a9\7\31\2\2\u00a9\u00ab\5\34\17\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\33\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7 \2\2\u00b0\u00b5"+
		"\7\30\2\2\u00b1\u00b6\5,\27\2\u00b2\u00b6\7\37\2\2\u00b3\u00b6\7!\2\2"+
		"\u00b4\u00b6\7 \2\2\u00b5\u00b1\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00c6\3\2\2\2\u00b7\u00c6\7 \2\2\u00b8"+
		"\u00c6\7\r\2\2\u00b9\u00c6\7\20\2\2\u00ba\u00c6\7\16\2\2\u00bb\u00c6\7"+
		"\17\2\2\u00bc\u00c6\58\35\2\u00bd\u00be\7\n\2\2\u00be\u00c3\7\30\2\2\u00bf"+
		"\u00c4\5,\27\2\u00c0\u00c4\7\37\2\2\u00c1\u00c4\7!\2\2\u00c2\u00c4\7 "+
		"\2\2\u00c3\u00bf\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00af\3\2\2\2\u00c5\u00b7\3\2"+
		"\2\2\u00c5\u00b8\3\2\2\2\u00c5\u00b9\3\2\2\2\u00c5\u00ba\3\2\2\2\u00c5"+
		"\u00bb\3\2\2\2\u00c5\u00bc\3\2\2\2\u00c5\u00bd\3\2\2\2\u00c6\35\3\2\2"+
		"\2\u00c7\u00c8\7\6\2\2\u00c8\u00ca\7\22\2\2\u00c9\u00cb\5 \21\2\u00ca"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\7\23\2\2\u00cf\37\3\2\2\2\u00d0\u00d3"+
		"\5\"\22\2\u00d1\u00d3\5&\24\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2"+
		"\u00d3!\3\2\2\2\u00d4\u00d5\7\24\2\2\u00d5\u00d6\5$\23\2\u00d6\u00d8\7"+
		"\25\2\2\u00d7\u00d9\5(\25\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"#\3\2\2\2\u00da\u00dd\5\66\34\2\u00db\u00dd\5*\26\2\u00dc\u00da\3\2\2"+
		"\2\u00dc\u00db\3\2\2\2\u00dd%\3\2\2\2\u00de\u00e0\7 \2\2\u00df\u00e1\5"+
		"(\25\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\'\3\2\2\2\u00e2\u00e3"+
		"\7\26\2\2\u00e3\u00e4\5\62\32\2\u00e4\u00e5\7\27\2\2\u00e5)\3\2\2\2\u00e6"+
		"\u00eb\5,\27\2\u00e7\u00e8\7\31\2\2\u00e8\u00ea\5,\27\2\u00e9\u00e7\3"+
		"\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"+\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7\36\2\2\u00ef\u00f0\5.\30\2"+
		"\u00f0\u00f1\7\36\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f4\7 \2\2\u00f3\u00ee"+
		"\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4-\3\2\2\2\u00f5\u00f8\7 \2\2\u00f6\u00f8"+
		"\5\60\31\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fd\3\2\2\2"+
		"\u00f9\u00fa\7$\2\2\u00fa\u00fc\t\4\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff"+
		"\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe/\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u0100\u0101\7 \2\2\u0101\u010a\7\24\2\2\u0102\u0107\7 "+
		"\2\2\u0103\u0104\7\31\2\2\u0104\u0106\7 \2\2\u0105\u0103\3\2\2\2\u0106"+
		"\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010b\3\2"+
		"\2\2\u0109\u0107\3\2\2\2\u010a\u0102\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010d\7\25\2\2\u010d\61\3\2\2\2\u010e\u0113\5\64"+
		"\33\2\u010f\u0110\7\31\2\2\u0110\u0112\5\64\33\2\u0111\u010f\3\2\2\2\u0112"+
		"\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\63\3\2\2"+
		"\2\u0115\u0113\3\2\2\2\u0116\u0117\7 \2\2\u0117\u0118\7\30\2\2\u0118\u0124"+
		"\7\37\2\2\u0119\u011a\7 \2\2\u011a\u011b\7\30\2\2\u011b\u0124\7 \2\2\u011c"+
		"\u0124\58\35\2\u011d\u0124\7 \2\2\u011e\u0124\7\20\2\2\u011f\u0124\7\16"+
		"\2\2\u0120\u0121\7\21\2\2\u0121\u0122\7\30\2\2\u0122\u0124\7\37\2\2\u0123"+
		"\u0116\3\2\2\2\u0123\u0119\3\2\2\2\u0123\u011c\3\2\2\2\u0123\u011d\3\2"+
		"\2\2\u0123\u011e\3\2\2\2\u0123\u011f\3\2\2\2\u0123\u0120\3\2\2\2\u0124"+
		"\65\3\2\2\2\u0125\u012a\7 \2\2\u0126\u0127\7\31\2\2\u0127\u0129\7 \2\2"+
		"\u0128\u0126\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b"+
		"\3\2\2\2\u012b\67\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7\b\2\2\u012e"+
		"\u012f\7\30\2\2\u012f\u0135\7\37\2\2\u0130\u0131\7\b\2\2\u0131\u0132\7"+
		"\22\2\2\u0132\u0133\t\5\2\2\u0133\u0135\7\23\2\2\u0134\u012d\3\2\2\2\u0134"+
		"\u0130\3\2\2\2\u01359\3\2\2\2\u0136\u0137\7 \2\2\u0137\u0138\7\35\2\2"+
		"\u0138\u013a\7 \2\2\u0139\u013b\5\30\r\2\u013a\u0139\3\2\2\2\u013a\u013b"+
		"\3\2\2\2\u013b;\3\2\2\2\u013c\u013f\7\4\2\2\u013d\u013e\7 \2\2\u013e\u0140"+
		"\7\30\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\3\2\2\2"+
		"\u0141\u0142\5\n\6\2\u0142\u0143\7\33\2\2\u0143\u0144\7 \2\2\u0144\u0145"+
		"\7\35\2\2\u0145\u0146\5\n\6\2\u0146\u0147\7\33\2\2\u0147\u0149\7 \2\2"+
		"\u0148\u014a\5> \2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a=\3\2"+
		"\2\2\u014b\u014c\7\26\2\2\u014c\u014d\5@!\2\u014d\u014e\7\27\2\2\u014e"+
		"?\3\2\2\2\u014f\u0154\5B\"\2\u0150\u0151\7\31\2\2\u0151\u0153\5B\"\2\u0152"+
		"\u0150\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155A\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158\7\13\2\2\u0158\u0159"+
		"\7\30\2\2\u0159\u015e\7 \2\2\u015a\u015b\7\f\2\2\u015b\u015c\7\30\2\2"+
		"\u015c\u015e\7 \2\2\u015d\u0157\3\2\2\2\u015d\u015a\3\2\2\2\u015eC\3\2"+
		"\2\2\u015f\u0160\7\5\2\2\u0160\u0161\5\n\6\2\u0161\u0165\7\22\2\2\u0162"+
		"\u0164\5F$\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2"+
		"\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u0169"+
		"\7\23\2\2\u0169E\3\2\2\2\u016a\u016f\7 \2\2\u016b\u016c\7\26\2\2\u016c"+
		"\u016d\5\32\16\2\u016d\u016e\7\27\2\2\u016e\u0170\3\2\2\2\u016f\u016b"+
		"\3\2\2\2\u016f\u0170\3\2\2\2\u0170G\3\2\2\2\u0171\u0176\7 \2\2\u0172\u0173"+
		"\7\31\2\2\u0173\u0175\7 \2\2\u0174\u0172\3\2\2\2\u0175\u0178\3\2\2\2\u0176"+
		"\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177I\3\2\2\2\u0178\u0176\3\2\2\2"+
		"+OQZeknuw|\u008c\u0093\u0098\u009b\u00a1\u00ac\u00b5\u00c3\u00c5\u00cc"+
		"\u00d2\u00d8\u00dc\u00e0\u00eb\u00f3\u00f7\u00fd\u0107\u010a\u0113\u0123"+
		"\u012a\u0134\u013a\u013f\u0149\u0154\u015d\u0165\u016f\u0176";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}