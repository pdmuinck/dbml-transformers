package com.pdemuinck.transformers;

import com.pdemuinck.transformers.antlr.DbmlParser;
import com.pdemuinck.transformers.antlr.DbmlParserBaseVisitor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DbmlBasicVisitor extends DbmlParserBaseVisitor<Dbml> {

  private Dbml dbml = new Dbml();
  private int tableIdx = 0;
  private int columnIdx = 0;
  private Map<String, List<String>> enums = new HashMap<>();

  @Override
  public Dbml visitProject(DbmlParser.ProjectContext ctx) {
    dbml.project = new Dbml.Project();
    dbml.project.name = ctx.IDENTIFIER().getText();
    ctx.project_settings().forEach(this::visitProject_settings);
    return dbml;
  }

  @Override
  public Dbml visitProject_settings(DbmlParser.Project_settingsContext ctx) {
    if (ctx.STRING_LITERAL() != null) {
      String literal = ctx.STRING_LITERAL().getText().replaceAll("'", "").replaceAll("\"", "");
      if (ctx.NOTE() != null) {
        dbml.project.note = literal;
      } else if ("database_type".equals(ctx.IDENTIFIER().getText())) {
        dbml.project.databaseType = literal;
      }
    }
    return dbml;
  }

  @Override
  public Dbml visitDbml(DbmlParser.DbmlContext ctx) {
    if (ctx.project() != null && !ctx.project().isEmpty()) {
      ctx.project().forEach(p -> p.accept(this));
    }
    if (ctx.enumeration() != null && !ctx.enumeration().isEmpty()) {
      ctx.enumeration().forEach(e -> e.accept(this));
    }
    ctx.table().stream().forEach(this::visitTable);
    return dbml;
  }

  @Override
  public Dbml visitTable(DbmlParser.TableContext ctx) {
    Dbml.Table table = new Dbml.Table();
    table.name = ctx.schema_table_name().getText();
    dbml.tables.add(table);
    ctx.column().forEach(c -> c.accept(this));
    if(ctx.note() != null && !ctx.note().isEmpty()){
      ctx.note().forEach(this::visitNote);
    }
    if(ctx.table_settings() != null){
      ctx.table_settings().accept(this);
    }
    if(ctx.table_index() != null){
      ctx.table_index().forEach(this::visitTable_index);
    }
    tableIdx++;
    return dbml;
  }

  @Override
  public Dbml visitColumn(DbmlParser.ColumnContext ctx) {
    Dbml.Column column = new Dbml.Column();
    column.name = ctx.IDENTIFIER().get(0).getText();
    dbml.tables.get(tableIdx).columns.add(column);
    ctx.type().accept(this);
    if (ctx.column_settings() != null) {
      ctx.column_settings().accept(this);
    }
    columnIdx++;
    return dbml;
  }

  @Override
  public Dbml visitType(DbmlParser.TypeContext ctx) {
    if(enums.containsKey(ctx.IDENTIFIER().getText())){
      dbml.tables.get(tableIdx).columns.get(columnIdx).type = ctx.IDENTIFIER().getText();
      dbml.tables.get(tableIdx).columns.get(columnIdx).enumValues = enums.get(ctx.IDENTIFIER().getText());
    }
    if (ctx.NUMBER() != null) {
      dbml.tables.get(tableIdx).columns.get(columnIdx).type = ctx.IDENTIFIER().getText() + "(" + ctx.NUMBER().getText() + ")";
    } else if ("varchar".equals(ctx.IDENTIFIER().getText())) {
      dbml.tables.get(tableIdx).columns.get(columnIdx).type = ctx.IDENTIFIER().getText() + "(255)";
    } else {
      dbml.tables.get(tableIdx).columns.get(columnIdx).type = ctx.IDENTIFIER().getText();
    }
    return dbml;
  }

  @Override
  public Dbml visitColumn_settings(DbmlParser.Column_settingsContext ctx) {
    return ctx.column_setting_list().accept(this);
  }

  @Override
  public Dbml visitColumn_setting_list(DbmlParser.Column_setting_listContext ctx) {
    ctx.column_setting().forEach(this::visitColumn_setting);
    return dbml;
  }

  @Override
  public Dbml visitColumn_setting(DbmlParser.Column_settingContext ctx) {
    if(ctx.PK() != null || ctx.PRIMARY_KEY() != null){
      dbml.tables.get(tableIdx).columns.get(columnIdx).isPrimaryKey = true;
    } else if(ctx.UNIQUE() != null){
      dbml.tables.get(tableIdx).columns.get(columnIdx).isUnique = true;
    } else if(ctx.NOT_NULL() != null) {
      dbml.tables.get(tableIdx).columns.get(columnIdx).isNotNull = true;
    } else if(ctx.note() != null){
      ctx.note().accept(this);
    } else if (ctx.DEFAULT() != null) {
      if (ctx.STRING_LITERAL() != null) {
        dbml.tables.get(tableIdx).columns.get(columnIdx).defaultValue = ctx.STRING_LITERAL().getText();
      } else if (ctx.NUMBER() != null) {
        dbml.tables.get(tableIdx).columns.get(columnIdx).defaultValue = ctx.NUMBER().getText();
      } else if (ctx.IDENTIFIER() != null) {
        dbml.tables.get(tableIdx).columns.get(columnIdx).defaultValue = ctx.children.get(2).getText()
            .replaceFirst("`", "(").replace("`", ")");
      }
    }
    return dbml;
  }

  @Override
  public Dbml visitNote(DbmlParser.NoteContext ctx) {
    if(ctx.parent instanceof DbmlParser.TableContext){
      if (ctx.MULTI_LINE_STRING() != null) {
        dbml.tables.get(tableIdx).note = ctx.MULTI_LINE_STRING().getText().replaceAll("COMMENT =", "COMMENT");
      } else {
        dbml.tables.get(tableIdx).note = ctx.STRING_LITERAL().getText().replaceAll("COMMENT =", "COMMENT");
      }
    } else {
      if (ctx.MULTI_LINE_STRING() != null) {
        dbml.tables.get(tableIdx).columns.get(columnIdx).note = ctx.MULTI_LINE_STRING().getText().replaceAll("COMMENT =", "COMMENT");
      } else {
        dbml.tables.get(tableIdx).columns.get(columnIdx).note = ctx.STRING_LITERAL().getText().replaceAll("COMMENT =", "COMMENT");
      }
    }
    return dbml;
  }

  @Override
  public Dbml visitTable_settings(DbmlParser.Table_settingsContext ctx) {
    if(ctx.table_setting_list() != null){
      ctx.table_setting_list().accept(this);
    }
    return dbml;
  }

  @Override
  public Dbml visitTable_setting_list(DbmlParser.Table_setting_listContext ctx) {
    ctx.table_setting().forEach(this::visitTable_setting);
    return dbml;
  }

  @Override
  public Dbml visitTable_setting(DbmlParser.Table_settingContext ctx) {
    dbml.tables.get(tableIdx).settings.putIfAbsent(ctx.IDENTIFIER().getText(), ctx.STRING_LITERAL().getText());
    return dbml;
  }

  @Override
  public Dbml visitEnumeration(DbmlParser.EnumerationContext ctx) {
    if(ctx.enum_entry() != null){
      List<String> values = ctx.enum_entry().stream().filter(e -> e.IDENTIFIER() != null).map(e -> e.IDENTIFIER().getText()).toList();
      enums.put(ctx.IDENTIFIER().getText(), values);
    }
    return dbml;
  }

  @Override
  public Dbml visitTable_index(DbmlParser.Table_indexContext ctx) {
    if(ctx.index_entry() != null){
      ctx.index_entry().forEach(i -> i.accept(this));
    }
    return dbml;
  }

  @Override
  public Dbml visitIndex_entry(DbmlParser.Index_entryContext ctx) {
    if(ctx.single_column_index() != null){
      ctx.single_column_index().accept(this);
    }
    return dbml;
  }

  @Override
  public Dbml visitSingle_column_index(DbmlParser.Single_column_indexContext ctx) {
    if(ctx.IDENTIFIER() != null){
      dbml.indexes.add(new Dbml.Index(ctx.IDENTIFIER().getText(), dbml.tables.get(tableIdx).name, ctx.ASC() != null));
    }
    return dbml;
  }
}
