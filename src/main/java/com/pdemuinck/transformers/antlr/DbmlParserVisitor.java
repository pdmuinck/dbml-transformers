// Generated from DbmlParser.g4 by ANTLR 4.8

package com.pdemuinck.transformers.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DbmlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DbmlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DbmlParser#dbml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbml(DbmlParser.DbmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#project}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProject(DbmlParser.ProjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#project_settings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProject_settings(DbmlParser.Project_settingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(DbmlParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#schema_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_table_name(DbmlParser.Schema_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema(DbmlParser.SchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#table_settings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_settings(DbmlParser.Table_settingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#table_setting_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_setting_list(DbmlParser.Table_setting_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#table_setting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_setting(DbmlParser.Table_settingContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(DbmlParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(DbmlParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#column_settings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_settings(DbmlParser.Column_settingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#column_setting_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_setting_list(DbmlParser.Column_setting_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#column_setting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_setting(DbmlParser.Column_settingContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#table_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_index(DbmlParser.Table_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#index_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_entry(DbmlParser.Index_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#composite_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposite_index(DbmlParser.Composite_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#index_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_columns(DbmlParser.Index_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#single_column_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_column_index(DbmlParser.Single_column_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#index_settings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_settings(DbmlParser.Index_settingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#inline_expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInline_expression_list(DbmlParser.Inline_expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#inline_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInline_expression(DbmlParser.Inline_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#index_setting_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_setting_list(DbmlParser.Index_setting_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#index_setting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_setting(DbmlParser.Index_settingContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#column_expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_expression_list(DbmlParser.Column_expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#note}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNote(DbmlParser.NoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(DbmlParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(DbmlParser.ReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#relation_settings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_settings(DbmlParser.Relation_settingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#relation_setting_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_setting_list(DbmlParser.Relation_setting_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#relation_setting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_setting(DbmlParser.Relation_settingContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#enumeration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeration(DbmlParser.EnumerationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#enum_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_entry(DbmlParser.Enum_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DbmlParser#column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_list(DbmlParser.Column_listContext ctx);
}