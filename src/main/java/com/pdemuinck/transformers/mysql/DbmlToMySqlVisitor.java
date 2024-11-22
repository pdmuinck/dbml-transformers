package com.pdemuinck.transformers.mysql;

import com.pdemuinck.transformers.antlr.DbmlParser;
import com.pdemuinck.transformers.antlr.DbmlParserBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DbmlToMySqlVisitor extends DbmlParserBaseVisitor<String> {

    private List<String> statements = new ArrayList<String>();

    @Override
    public String visitDbml(DbmlParser.DbmlContext ctx) {
        ctx.table().forEach(table -> table.accept(this));
        return String.join("\n", statements) + "\n";
    }

    @Override
    public String visitTable(DbmlParser.TableContext ctx) {
        String schemaTableName = ctx.schema_table_name().accept(this);
        statements.add(String.format("CREATE TABLE IF NOT EXISTS %s (%s);", schemaTableName,
                ctx.column().stream().map(c -> c.accept(this)).collect(Collectors.joining(", "))));
        if (ctx.note() != null) {
            ctx.note().forEach(note -> statements.add(String.format("ALTER TABLE %s %s;", schemaTableName, note.accept(this))));
        }
        if (ctx.table_index() != null) {
            ctx.table_index().stream().map(index -> index.accept(this).replaceAll("<tableName>", schemaTableName)).forEach(statements::add);
        }
        return null;
    }

    @Override
    public String visitSchema_table_name(DbmlParser.Schema_table_nameContext ctx) {
        if (ctx.schema() != null) {
            return String.format("`%s`.`%s`", ctx.schema().getText(), ctx.IDENTIFIER().getText());
        } else {
            return String.format("`%s`", ctx.IDENTIFIER().getText());
        }
    }

    @Override
    public String visitSchema(DbmlParser.SchemaContext ctx) {
        statements.add(String.format("CREATE SCHEMA IF NOT EXIST %s", ctx.IDENTIFIER().getText()));
        return null;
    }

    @Override
    public String visitTable_settings(DbmlParser.Table_settingsContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(ctx.table_setting_list().accept(this));
        sb.append(");");
        return sb.toString();
    }

    @Override
    public String visitTable_setting_list(DbmlParser.Table_setting_listContext ctx) {
        StringBuilder sb = new StringBuilder();
        ctx.table_setting().forEach(table_setting -> {
            sb.append(table_setting.accept(this));
            sb.append(", ");
        });
        return sb.toString();
    }

    @Override
    public String visitTable_setting(DbmlParser.Table_settingContext ctx) {
        return "";
    }

    @Override
    public String visitColumn(DbmlParser.ColumnContext ctx) {
        if (ctx.column_settings() != null) {
            String settings = ctx.column_settings().accept(this);
            return String.format("`%s` %s %s", ctx.IDENTIFIER().getText(), ctx.type().accept(this), settings);
        } else {
            return String.format("`%s` %s", ctx.IDENTIFIER().getText(), ctx.type().accept(this));
        }
    }

    @Override
    public String visitType(DbmlParser.TypeContext ctx) {
        if (ctx.NUMBER() != null) {
            return ctx.IDENTIFIER().getText() + "(" + ctx.NUMBER().getText() + ")";
        } else if ("varchar".equals(ctx.IDENTIFIER().getText())) {
            return ctx.IDENTIFIER().getText() + "(255)";
        } else {
            return ctx.IDENTIFIER().getText();
        }
    }

    @Override
    public String visitNote(DbmlParser.NoteContext ctx) {
        if (ctx.MULTI_LINE_STRING() != null) {
            return String.format("COMMENT = %s", ctx.MULTI_LINE_STRING().getText());
        } else {
            return String.format("COMMENT = %s", ctx.STRING_LITERAL().getText());
        }
    }

    @Override
    public String visitColumn_settings(DbmlParser.Column_settingsContext ctx) {
        return ctx.column_setting_list().accept(this);
    }

    @Override
    public String visitColumn_setting_list(DbmlParser.Column_setting_listContext ctx) {
        return ctx.column_setting().stream().map(column_setting ->
                column_setting.accept(this)
        ).collect(Collectors.joining(" "));
    }

    @Override
    public String visitColumn_setting(DbmlParser.Column_settingContext ctx) {
        if (ctx.PK() != null || ctx.PRIMARY_KEY() != null) {
            return "PRIMARY KEY";
        } else if (ctx.UNIQUE() != null) {
            return "UNIQUE";
        } else if (ctx.NOT_NULL() != null) {
            return "NOT NULL";
        } else if (ctx.note() != null) {
            return ctx.note().accept(this).replaceAll("COMMENT =", "COMMENT");
        } else if (ctx.DEFAULT() != null) {
            if (ctx.STRING_LITERAL() != null) {
                return "DEFAULT " + ctx.STRING_LITERAL().getText();
            } else if (ctx.NUMBER() != null) {
                return "DEFAULT " + ctx.NUMBER().getText();
            } else if (ctx.IDENTIFIER() != null) {
                return "DEFAULT " + ctx.children.get(2).getText().replaceFirst("`", "(").replace("`", ")");
            } else {
                return "";
            }
        } else {
            return "";
        }
    }

    @Override
    public String visitTable_index(DbmlParser.Table_indexContext ctx) {
        String table = ctx.parent.getText();
        return ctx.index_entry().stream().map(index_entry -> index_entry.accept(this)).collect(Collectors.joining("\n"));
    }

    @Override
    public String visitIndex_entry(DbmlParser.Index_entryContext ctx) {
        if (ctx.composite_index() != null) {
            return ctx.composite_index().accept(this);
        } else if (ctx.single_column_index() != null) {
            return ctx.single_column_index().accept(this);
        } else if (ctx.inline_expression_list() != null) {
            return ctx.inline_expression_list().accept(this);
        }
        return "";
    }

    @Override
    public String visitComposite_index(DbmlParser.Composite_indexContext ctx) {
        if (ctx.index_settings() != null) {
            String createIndexDdl = ctx.index_settings().accept(this);
            String indexColumns = ctx.index_columns().accept(this);
            return createIndexDdl.replaceAll("<columnList>", indexColumns);
        }
        return "";
    }

    @Override
    public String visitSingle_column_index(DbmlParser.Single_column_indexContext ctx) {
        if (ctx.index_settings() != null) {
            String createIndexDdl = ctx.index_settings().accept(this);
            return createIndexDdl.replaceAll("<columnList>", "`" + ctx.IDENTIFIER().getText() + "`");
        }
        return "";
    }

    @Override
    public String visitIndex_settings(DbmlParser.Index_settingsContext ctx) {
        return ctx.index_setting_list().accept(this);
    }

    @Override
    public String visitIndex_setting_list(DbmlParser.Index_setting_listContext ctx) {
        return ctx.index_setting().stream().map(index_setting -> index_setting.accept(this)).collect(Collectors.joining(""));
    }

    @Override
    public String visitIndex_setting(DbmlParser.Index_settingContext ctx) {
        if(ctx.PK() != null){
            return "ALTER TABLE <tableName> ADD PRIMARY KEY (<columnList>);";
        } else if (ctx.NAME() != null) {
            return String.format("CREATE INDEX %s on <tableName> (<columnList>);", ctx.STRING_LITERAL().getText().replaceAll("'", "`"));
        } else if (ctx.UNIQUE() != null) {
            return "CREATE UNIQUE INDEX <indexName> <tableName> (<columnList>);";
        } else if(ctx.getText().contains("type")){
            return String.format("CREATE INDEX <indexName> on <tableName> (<columnList>) USING %s;", ctx.getText().split(":")[1].toUpperCase());
        }
        return "";
    }

    @Override
    public String visitIndex_columns(DbmlParser.Index_columnsContext ctx) {
        return ctx.IDENTIFIER().stream().map(TerminalNode::getText).map(c -> "`" + c + "`").collect(Collectors.joining(", "));
    }
}

