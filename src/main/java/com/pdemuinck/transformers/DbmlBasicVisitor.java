package com.pdemuinck.transformers;

import com.pdemuinck.transformers.antlr.DbmlParser;
import com.pdemuinck.transformers.antlr.DbmlParserBaseVisitor;
import com.pdemuinck.transformers.project.DbmlProject;

public class DbmlBasicVisitor extends DbmlParserBaseVisitor<Dbml> {

  private Dbml dbml = new Dbml();
  private int tableIdx = 0;
  private int columnIdx = 0;

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
    if(ctx.project() != null && !ctx.project().isEmpty()){
      ctx.project().forEach(p -> p.accept(this));
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
    tableIdx++;
    return dbml;
  }

  @Override
  public Dbml visitColumn(DbmlParser.ColumnContext ctx) {
    Dbml.Column column = new Dbml.Column();
    column.name = ctx.IDENTIFIER().get(0).getText();
    dbml.tables.get(tableIdx).columns.add(column);
    ctx.type().accept(this);
    columnIdx++;
    return dbml;
  }

  @Override
  public Dbml visitType(DbmlParser.TypeContext ctx) {
    if (ctx.NUMBER() != null) {
      dbml.tables.get(tableIdx).columns.get(columnIdx).type = ctx.IDENTIFIER().getText() + "(" + ctx.NUMBER().getText() + ")";
    } else if ("varchar".equals(ctx.IDENTIFIER().getText())) {
      dbml.tables.get(tableIdx).columns.get(columnIdx).type = ctx.IDENTIFIER().getText() + "(255)";
    } else {
      dbml.tables.get(tableIdx).columns.get(columnIdx).type = ctx.IDENTIFIER().getText();
    }
    return dbml;
  }
}
