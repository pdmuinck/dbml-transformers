// Generated from DbmlParser.g4 by ANTLR 4.8

package com.pdemuinck.transformers.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DbmlParser}.
 */
public interface DbmlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DbmlParser#dbml}.
	 * @param ctx the parse tree
	 */
	void enterDbml(DbmlParser.DbmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#dbml}.
	 * @param ctx the parse tree
	 */
	void exitDbml(DbmlParser.DbmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#project}.
	 * @param ctx the parse tree
	 */
	void enterProject(DbmlParser.ProjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#project}.
	 * @param ctx the parse tree
	 */
	void exitProject(DbmlParser.ProjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#project_settings}.
	 * @param ctx the parse tree
	 */
	void enterProject_settings(DbmlParser.Project_settingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#project_settings}.
	 * @param ctx the parse tree
	 */
	void exitProject_settings(DbmlParser.Project_settingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(DbmlParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(DbmlParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#schema_table_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_table_name(DbmlParser.Schema_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#schema_table_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_table_name(DbmlParser.Schema_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#schema}.
	 * @param ctx the parse tree
	 */
	void enterSchema(DbmlParser.SchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#schema}.
	 * @param ctx the parse tree
	 */
	void exitSchema(DbmlParser.SchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#table_settings}.
	 * @param ctx the parse tree
	 */
	void enterTable_settings(DbmlParser.Table_settingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#table_settings}.
	 * @param ctx the parse tree
	 */
	void exitTable_settings(DbmlParser.Table_settingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#table_setting_list}.
	 * @param ctx the parse tree
	 */
	void enterTable_setting_list(DbmlParser.Table_setting_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#table_setting_list}.
	 * @param ctx the parse tree
	 */
	void exitTable_setting_list(DbmlParser.Table_setting_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#table_setting}.
	 * @param ctx the parse tree
	 */
	void enterTable_setting(DbmlParser.Table_settingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#table_setting}.
	 * @param ctx the parse tree
	 */
	void exitTable_setting(DbmlParser.Table_settingContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(DbmlParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(DbmlParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DbmlParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DbmlParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#column_settings}.
	 * @param ctx the parse tree
	 */
	void enterColumn_settings(DbmlParser.Column_settingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#column_settings}.
	 * @param ctx the parse tree
	 */
	void exitColumn_settings(DbmlParser.Column_settingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#column_setting_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_setting_list(DbmlParser.Column_setting_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#column_setting_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_setting_list(DbmlParser.Column_setting_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#column_setting}.
	 * @param ctx the parse tree
	 */
	void enterColumn_setting(DbmlParser.Column_settingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#column_setting}.
	 * @param ctx the parse tree
	 */
	void exitColumn_setting(DbmlParser.Column_settingContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#table_index}.
	 * @param ctx the parse tree
	 */
	void enterTable_index(DbmlParser.Table_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#table_index}.
	 * @param ctx the parse tree
	 */
	void exitTable_index(DbmlParser.Table_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#index_entry}.
	 * @param ctx the parse tree
	 */
	void enterIndex_entry(DbmlParser.Index_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#index_entry}.
	 * @param ctx the parse tree
	 */
	void exitIndex_entry(DbmlParser.Index_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#composite_index}.
	 * @param ctx the parse tree
	 */
	void enterComposite_index(DbmlParser.Composite_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#composite_index}.
	 * @param ctx the parse tree
	 */
	void exitComposite_index(DbmlParser.Composite_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#index_columns}.
	 * @param ctx the parse tree
	 */
	void enterIndex_columns(DbmlParser.Index_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#index_columns}.
	 * @param ctx the parse tree
	 */
	void exitIndex_columns(DbmlParser.Index_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#single_column_index}.
	 * @param ctx the parse tree
	 */
	void enterSingle_column_index(DbmlParser.Single_column_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#single_column_index}.
	 * @param ctx the parse tree
	 */
	void exitSingle_column_index(DbmlParser.Single_column_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#index_settings}.
	 * @param ctx the parse tree
	 */
	void enterIndex_settings(DbmlParser.Index_settingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#index_settings}.
	 * @param ctx the parse tree
	 */
	void exitIndex_settings(DbmlParser.Index_settingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#inline_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterInline_expression_list(DbmlParser.Inline_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#inline_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitInline_expression_list(DbmlParser.Inline_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#inline_expression}.
	 * @param ctx the parse tree
	 */
	void enterInline_expression(DbmlParser.Inline_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#inline_expression}.
	 * @param ctx the parse tree
	 */
	void exitInline_expression(DbmlParser.Inline_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DbmlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DbmlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(DbmlParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(DbmlParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#index_setting_list}.
	 * @param ctx the parse tree
	 */
	void enterIndex_setting_list(DbmlParser.Index_setting_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#index_setting_list}.
	 * @param ctx the parse tree
	 */
	void exitIndex_setting_list(DbmlParser.Index_setting_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#index_setting}.
	 * @param ctx the parse tree
	 */
	void enterIndex_setting(DbmlParser.Index_settingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#index_setting}.
	 * @param ctx the parse tree
	 */
	void exitIndex_setting(DbmlParser.Index_settingContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#column_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_expression_list(DbmlParser.Column_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#column_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_expression_list(DbmlParser.Column_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#note}.
	 * @param ctx the parse tree
	 */
	void enterNote(DbmlParser.NoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#note}.
	 * @param ctx the parse tree
	 */
	void exitNote(DbmlParser.NoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(DbmlParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(DbmlParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(DbmlParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(DbmlParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#reference_long_form}.
	 * @param ctx the parse tree
	 */
	void enterReference_long_form(DbmlParser.Reference_long_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#reference_long_form}.
	 * @param ctx the parse tree
	 */
	void exitReference_long_form(DbmlParser.Reference_long_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#reference_short_form}.
	 * @param ctx the parse tree
	 */
	void enterReference_short_form(DbmlParser.Reference_short_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#reference_short_form}.
	 * @param ctx the parse tree
	 */
	void exitReference_short_form(DbmlParser.Reference_short_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#relation_settings}.
	 * @param ctx the parse tree
	 */
	void enterRelation_settings(DbmlParser.Relation_settingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#relation_settings}.
	 * @param ctx the parse tree
	 */
	void exitRelation_settings(DbmlParser.Relation_settingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#relation_setting_list}.
	 * @param ctx the parse tree
	 */
	void enterRelation_setting_list(DbmlParser.Relation_setting_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#relation_setting_list}.
	 * @param ctx the parse tree
	 */
	void exitRelation_setting_list(DbmlParser.Relation_setting_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#relation_setting}.
	 * @param ctx the parse tree
	 */
	void enterRelation_setting(DbmlParser.Relation_settingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#relation_setting}.
	 * @param ctx the parse tree
	 */
	void exitRelation_setting(DbmlParser.Relation_settingContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#enumeration}.
	 * @param ctx the parse tree
	 */
	void enterEnumeration(DbmlParser.EnumerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#enumeration}.
	 * @param ctx the parse tree
	 */
	void exitEnumeration(DbmlParser.EnumerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#enum_entry}.
	 * @param ctx the parse tree
	 */
	void enterEnum_entry(DbmlParser.Enum_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#enum_entry}.
	 * @param ctx the parse tree
	 */
	void exitEnum_entry(DbmlParser.Enum_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DbmlParser#column_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_list(DbmlParser.Column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DbmlParser#column_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_list(DbmlParser.Column_listContext ctx);
}