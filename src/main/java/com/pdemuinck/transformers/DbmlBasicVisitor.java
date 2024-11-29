package com.pdemuinck.transformers;

import com.pdemuinck.transformers.antlr.DbmlParser;
import com.pdemuinck.transformers.antlr.DbmlParserBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DbmlBasicVisitor extends DbmlParserBaseVisitor<Dbml> {

  private Dbml dbml = new Dbml();
  private int tableIdx = 0;
  private int columnIdx = 0;
  private int indexIdx = 0;
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

    if (ctx.reference() != null && !ctx.reference().isEmpty()) {
      ctx.reference().forEach(this::visitReference);
    }
    return dbml;
  }

  @Override
  public Dbml visitTable(DbmlParser.TableContext ctx) {
    columnIdx = 0;
    Dbml.Table table = new Dbml.Table();
    table.name = ctx.schema_table_name().getText();
    dbml.tables.add(table);
    ctx.column().forEach(c -> c.accept(this));
    if (ctx.note() != null && !ctx.note().isEmpty()) {
      ctx.note().forEach(this::visitNote);
    }
    if (ctx.table_settings() != null) {
      ctx.table_settings().accept(this);
    }
    if (ctx.table_index() != null) {
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
    if (enums.containsKey(ctx.IDENTIFIER().getText())) {
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
    if (ctx.PK() != null || ctx.PRIMARY_KEY() != null) {
      dbml.tables.get(tableIdx).columns.get(columnIdx).isPrimaryKey = true;
    } else if (ctx.UNIQUE() != null) {
      dbml.tables.get(tableIdx).columns.get(columnIdx).isUnique = true;
    } else if (ctx.NOT_NULL() != null) {
      dbml.tables.get(tableIdx).columns.get(columnIdx).isNotNull = true;
    } else if (ctx.note() != null) {
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
    if (ctx.parent instanceof DbmlParser.TableContext) {
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
    if (ctx.table_setting_list() != null) {
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
    if (ctx.enum_entry() != null) {
      List<String> values = ctx.enum_entry().stream().filter(e -> e.IDENTIFIER() != null).map(e -> e.IDENTIFIER().getText()).toList();
      enums.put(ctx.IDENTIFIER().getText(), values);
    }
    return dbml;
  }

  @Override
  public Dbml visitTable_index(DbmlParser.Table_indexContext ctx) {
    if (ctx.index_entry() != null) {
      ctx.index_entry().forEach(i -> i.accept(this));
    }
    return dbml;
  }

  @Override
  public Dbml visitIndex_entry(DbmlParser.Index_entryContext ctx) {
    if (ctx.single_column_index() != null) {
      ctx.single_column_index().accept(this);
    } else if (ctx.composite_index() != null) {
      ctx.composite_index().accept(this);
    }
    return dbml;
  }

  @Override
  public Dbml visitComposite_index(DbmlParser.Composite_indexContext ctx) {
    Dbml.Index index = new Dbml.Index();
    index.table = dbml.tables.get(tableIdx).name;
    if (ctx.index_columns() != null && ctx.index_columns().column_expression_list() != null) {
      List<TerminalNode> identifier = ctx.index_columns().column_expression_list().IDENTIFIER();
      index.columns = identifier.stream().map(TerminalNode::getText).toList();
    }
    if (ctx.index_columns() != null && ctx.index_columns().inline_expression_list() != null) {
      index.columns = ctx.index_columns().inline_expression_list().inline_expression().stream().map(c -> c.getText().replaceAll("`", "")).toList();
    }
    dbml.indexes.add(index);
    if (ctx.index_settings() != null) {
      ctx.index_settings().accept(this);
    }
    indexIdx++;
    return dbml;
  }

  @Override
  public Dbml visitSingle_column_index(DbmlParser.Single_column_indexContext ctx) {
    Dbml.Index index = new Dbml.Index();
    index.table = dbml.tables.get(tableIdx).name;
    index.columns = List.of(ctx.IDENTIFIER().getText());
    dbml.indexes.add(index);
    if (ctx.index_settings() != null) {
      ctx.index_settings().accept(this);
    }
    indexIdx++;
    return dbml;
  }

  @Override
  public Dbml visitIndex_settings(DbmlParser.Index_settingsContext ctx) {
    return ctx.index_setting_list().accept(this);
  }

  @Override
  public Dbml visitIndex_setting_list(DbmlParser.Index_setting_listContext ctx) {
    ctx.index_setting().forEach(i -> i.accept(this));
    return dbml;
  }

  @Override
  public Dbml visitIndex_setting(DbmlParser.Index_settingContext ctx) {
    if (ctx.PK() != null) {
      dbml.indexes.get(indexIdx).isPrimaryKey = true;
    } else if (ctx.NAME() != null) {
      dbml.indexes.get(indexIdx).name = ctx.STRING_LITERAL().getText();
    } else if (ctx.UNIQUE() != null) {
      dbml.indexes.get(indexIdx).isUnique = true;
    } else if (ctx.note() != null) {
    } else if (ctx.getText().contains("type")) {
      dbml.indexes.get(indexIdx).type = ctx.IDENTIFIER(1).getText();
    } else {
    }
    return dbml;
  }

  public Dbml visitReference(DbmlParser.ReferenceContext ctx) {
    if (ctx.reference_long_form() != null) {
      return ctx.reference_long_form().accept(this);
    } else if (ctx.reference_short_form() != null) {
      return ctx.reference_short_form().accept(this);
    } else {
      // inline
      List<TerminalNode> identifier = ctx.IDENTIFIER();
      String relation = ctx.RELATION_OP().getText();
      if (identifier.size() == 3) {
        if (">".equals(relation)) {
          String.format("ALTER TABLE <tableName> ADD FOREIGN KEY (`<column_name`) REFERENCES `%s`.`%s` (`%s`)",
              ctx.IDENTIFIER(0).getText(), ctx.IDENTIFIER(1).getText(), ctx.IDENTIFIER(2).getText());
        } else if ("<".equals(relation)) {
          String.format("ALTER TABLE <tableName> ADD FOREIGN KEY (`<column_name`) REFERENCES `%s`.`%s` (`%s`)",
              ctx.IDENTIFIER(0).getText(), ctx.IDENTIFIER(1).getText(), ctx.IDENTIFIER(2).getText());
        } else if ("-".equals(relation)) {
          String.format("ALTER TABLE <tableName> ADD FOREIGN KEY (`<column_name`) REFERENCES `%s`.`%s` (`%s`)",
              ctx.IDENTIFIER(0).getText(), ctx.IDENTIFIER(1).getText(), ctx.IDENTIFIER(2).getText());
        }
      } else {
        if (">".equals(relation)) {
          String.format("ALTER TABLE <tableName> ADD FOREIGN KEY (`<column_name`) REFERENCES `%s` (`%s`)",
              ctx.IDENTIFIER(0).getText(), ctx.IDENTIFIER(1).getText());
        } else if ("<".equals(relation)) {
          String.format("ALTER TABLE `%s` ADD FOREIGN KEY (`%s`) REFERENCES <tableName> (`<column_name`)",
              ctx.IDENTIFIER(0).getText(), ctx.IDENTIFIER(1).getText());
        } else if ("-".equals(relation)) {
          String.format("ALTER TABLE <tableName> ADD FOREIGN KEY (`<column_name`) REFERENCES `%s` (`%s`)",
              ctx.IDENTIFIER(0).getText(), ctx.IDENTIFIER(1).getText());
        }
      }
      return dbml;
    }
  }


  @Override
  public Dbml visitReference_short_form(DbmlParser.Reference_short_formContext ctx) {
    Dbml.Reference reference = new Dbml.Reference();
    String relation = ctx.RELATION_OP().getText();
    if (">".equals(relation)) {
      reference.table = ctx.IDENTIFIER(1).getText();
      reference.column = ctx.IDENTIFIER(2).getText();
      reference.referencedTable = ctx.IDENTIFIER(3).getText();
      reference.referencedColumn = ctx.IDENTIFIER(4).getText();
      reference.name = ctx.IDENTIFIER(0).getText();
      reference.type = "many-to-one";
    } else if ("<".equals(relation)) {
      reference.table = ctx.IDENTIFIER(3).getText();
      reference.column = dbml.tables.get(tableIdx).columns.get(columnIdx).name;
      reference.referencedTable = ctx.IDENTIFIER(1).getText();
      reference.referencedColumn = ctx.IDENTIFIER(2).getText();
      reference.name = ctx.IDENTIFIER(0).getText();
      reference.type = "one-to-many";
    } else if ("-".equals(relation)) {
      List<TerminalNode> identifier = ctx.IDENTIFIER();
      reference.table = ctx.IDENTIFIER(1).getText();
      reference.column = ctx.IDENTIFIER(2).getText();
      reference.referencedTable = ctx.IDENTIFIER(3).getText();
      reference.referencedColumn = ctx.IDENTIFIER(4).getText();
      reference.name = ctx.IDENTIFIER(0).getText();
      reference.type = "one-to-one";
    } else if ("<>".equals(relation)) {
      reference.table = ctx.IDENTIFIER(1).getText() + "_" + ctx.IDENTIFIER(3);
      reference.column = dbml.tables.get(tableIdx).columns.get(columnIdx).name;
      reference.referencedTable = ctx.IDENTIFIER(3).getText();
      reference.referencedColumn = ctx.IDENTIFIER(4).getText();
      reference.name = ctx.IDENTIFIER(0).getText();
      reference.type = "many-to-many";
    }
    dbml.references.add(reference);
    return dbml;
  }
}
