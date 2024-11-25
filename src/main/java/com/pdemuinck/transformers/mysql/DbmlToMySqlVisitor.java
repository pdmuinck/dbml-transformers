package com.pdemuinck.transformers.mysql;

import com.pdemuinck.transformers.antlr.DbmlParser;
import com.pdemuinck.transformers.antlr.DbmlParserBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;
import java.util.stream.Collectors;

public class DbmlToMySqlVisitor extends DbmlParserBaseVisitor<String> {

    private List<String> statements = new ArrayList<>();
    private List<String> schemas = new ArrayList<>();
    private List<String> refStatements = new ArrayList<>();
    private List<String> schemaStatements = new ArrayList<>();
    private Map<String, List<String>> enums = new HashMap<>();

    @Override
    public String visitDbml(DbmlParser.DbmlContext ctx) {
        if (ctx.enumeration() != null && !ctx.enumeration().isEmpty()) {
            ctx.enumeration().forEach(e -> e.accept(this));
        }
        if (ctx.reference() != null) {
            ctx.reference().forEach(reference -> refStatements.add(reference.accept(this)));
        }
        ctx.table().forEach(table -> table.accept(this));
        statements.addAll(refStatements);
        schemas.addAll(statements);
        return schemas.stream().map(s -> s + ";").collect(Collectors.joining("\n")) + "\n";
    }

    @Override
    public String visitTable(DbmlParser.TableContext ctx) {
        String schemaTableName = ctx.schema_table_name().accept(this);
        String primaryKey = "";
        List<String> createIndexStatements = new ArrayList<>();
        if (ctx.table_index() != null && !ctx.table_index().isEmpty()) {
            DbmlParser.Table_indexContext tableIndexContext = ctx.table_index().get(0);
            String[] indexes = tableIndexContext.accept(this).split("\n");
            int currentIdx = 0;
            for (String index : indexes) {
                if (index.contains("PRIMARY KEY")) {
                    primaryKey = index;
                    continue;
                }
                createIndexStatements.add(index.replaceAll("<tableName>", schemaTableName).replaceAll("<indexName>", String.format("`%s_index_%d`", schemaTableName.replaceAll("`", ""), currentIdx)));
                currentIdx++;
            }
        }
        List<String> columns = ctx.column().stream().map(c -> c.accept(this)).toList();
        statements.add(String.format("CREATE TABLE IF NOT EXISTS %s (%s)", schemaTableName,
                columns.stream().filter(c -> !c.startsWith("ALTER TABLE")).collect(Collectors.joining(", ")) + (primaryKey.isEmpty() ? "" : ", " + primaryKey)));
        refStatements = refStatements.stream().map(c -> c.replaceAll("<tableName>", schemaTableName)).collect(Collectors.toCollection(ArrayList::new));
        if (ctx.note() != null) {
            ctx.note().forEach(note -> statements.add(String.format("ALTER TABLE %s %s", schemaTableName, note.accept(this))));
        }
        createIndexStatements.forEach(statements::add);
        return null;
    }

    @Override
    public String visitSchema_table_name(DbmlParser.Schema_table_nameContext ctx) {
        if (ctx.schema() != null) {
            schemas.add(String.format("CREATE SCHEMA `%s`", ctx.schema().IDENTIFIER().getText()));
            return String.format("`%s`.`%s`", ctx.schema().IDENTIFIER().getText(), ctx.IDENTIFIER().getText());
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
        sb.append(")");
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
        String type = ctx.type().getText();
        if (enums.containsKey(ctx.type().getText())) {
            return String.format("`%s` ENUM (%s)", ctx.IDENTIFIER(0).getText(), enums.get(ctx.type().getText()).stream().map(e -> "'" + e + "'").collect(Collectors.joining(", ")));
        }
        if (ctx.column_settings() != null) {
            String settings = ctx.column_settings().accept(this);
            refStatements = refStatements.stream().map(r -> r.replaceAll("<column_name", ctx.IDENTIFIER().get(0).getText())).collect(Collectors.toCollection(ArrayList::new));
            if (settings.isEmpty()) {
                return String.format("`%s` %s", ctx.IDENTIFIER().get(0).getText(), ctx.type().accept(this));
            } else {
                return String.format("`%s` %s %s", ctx.IDENTIFIER().get(0).getText(), ctx.type().accept(this), settings);
            }
        } else {
            return String.format("`%s` %s", ctx.IDENTIFIER().get(0).getText(), ctx.type().accept(this));
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
        if (ctx.reference() != null && !ctx.reference().isEmpty()) {
            refStatements = ctx.reference().stream().map(r -> r.accept(this)).collect(Collectors.toCollection(ArrayList::new));
        }
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
            } else if (ctx.inline_expression() != null) {
                return "";
            }
        } else {
            return "";
        }
        return "";
    }

    @Override
    public String visitTable_index(DbmlParser.Table_indexContext ctx) {
        return ctx.index_entry().stream().map(index_entry -> index_entry.accept(this)).collect(Collectors.joining("\n"));
    }

    @Override
    public String visitIndex_entry(DbmlParser.Index_entryContext ctx) {
        if (ctx.composite_index() != null) {
            return ctx.composite_index().accept(this);
        } else if (ctx.single_column_index() != null) {
            return ctx.single_column_index().accept(this);
        } else {
            return ctx.getText();
        }
    }

    @Override
    public String visitComposite_index(DbmlParser.Composite_indexContext ctx) {
        String indexColumns = ctx.index_columns().accept(this);
        if (ctx.index_settings() != null) {
            String createIndexDdl = ctx.index_settings().accept(this);
            return createIndexDdl.replaceAll("<columnList>", indexColumns);
        } else {
            return String.format("CREATE INDEX <indexName> ON <tableName> (%s)", indexColumns);
        }
    }

    @Override
    public String visitSingle_column_index(DbmlParser.Single_column_indexContext ctx) {
        if (ctx.index_settings() != null) {
            String createIndexDdl = ctx.index_settings().accept(this);
            return createIndexDdl.replaceAll("<columnList>", "`" + ctx.IDENTIFIER().getText() + "`");
        } else {
            return String.format("CREATE INDEX <indexName> ON <tableName> (`%s`)", ctx.IDENTIFIER().getText());
        }
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
        if (ctx.PK() != null) {
            return "PRIMARY KEY (<columnList>)";
        } else if (ctx.NAME() != null) {
            return String.format("CREATE INDEX %s ON <tableName> (<columnList>)", ctx.STRING_LITERAL().getText().replaceAll("'", "`"));
        } else if (ctx.UNIQUE() != null) {
            return "CREATE UNIQUE INDEX <indexName> ON <tableName> (<columnList>)";
        } else if (ctx.getText().contains("type")) {
            return String.format("CREATE INDEX <indexName> ON <tableName> (<columnList>) USING %s", ctx.getText().split(":")[1].toUpperCase());
        } else {
            return "";
        }
    }

    @Override
    public String visitIndex_columns(DbmlParser.Index_columnsContext ctx) {
        if (ctx.inline_expression_list() != null) {
            return ctx.inline_expression_list().accept(this);
        } else if (ctx.column_expression_list() != null) {
            return ctx.column_expression_list().accept(this);
        } else {
            return ctx.getText();
        }
    }

    @Override
    public String visitColumn_expression_list(DbmlParser.Column_expression_listContext ctx) {
        return ctx.IDENTIFIER().stream().map(TerminalNode::getText).map(c -> "`" + c + "`").collect(Collectors.joining(", "));
    }

    @Override
    public String visitInline_expression_list(DbmlParser.Inline_expression_listContext ctx) {
        return ctx.inline_expression().stream().map(inline_expression -> inline_expression.accept(this)).collect(Collectors.joining(", "));
    }

    @Override
    public String visitInline_expression(DbmlParser.Inline_expressionContext ctx) {
        if (ctx.children.stream().map(c -> c.getText()).noneMatch(c -> c.equals("`"))) {
            return "`" + ctx.getText() + "`";
        }
        String[] split = ctx.getText().split(",");
        return Arrays.stream(split).map(String::trim).map(c -> "(" + c.replaceAll("`", "") + ")").collect(Collectors.joining(", "));
    }

    @Override
    public String visitReference(DbmlParser.ReferenceContext ctx) {
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
                    return String.format("ALTER TABLE <tableName> ADD FOREIGN KEY (`<column_name`) REFERENCES `%s`.`%s` (`%s`)",
                            ctx.IDENTIFIER(0).getText(), ctx.IDENTIFIER(1).getText(), ctx.IDENTIFIER(2).getText());
                } else if ("<".equals(relation)) {
                    return String.format("ALTER TABLE <tableName> ADD FOREIGN KEY (`<column_name`) REFERENCES `%s`.`%s` (`%s`)",
                            ctx.IDENTIFIER(0).getText(), ctx.IDENTIFIER(1).getText(), ctx.IDENTIFIER(2).getText());
                }
            } else {
                if (">".equals(relation)) {
                    return String.format("ALTER TABLE <tableName> ADD FOREIGN KEY (`<column_name`) REFERENCES `%s` (`%s`)",
                            ctx.IDENTIFIER(0).getText(), ctx.IDENTIFIER(1).getText());
                } else if ("<".equals(relation)) {
                    return String.format("ALTER TABLE `%s` ADD FOREIGN KEY (`%s`) REFERENCES <tableName> (`<column_name`)",
                            ctx.IDENTIFIER(0).getText(), ctx.IDENTIFIER(1).getText());
                } else if ("-".equals(relation)) {
                    return String.format("ALTER TABLE <tableName> ADD FOREIGN KEY (`<column_name`) REFERENCES `%s` (`%s`)",
                            ctx.IDENTIFIER(0).getText(), ctx.IDENTIFIER(1).getText());
                }
            }
            return relation;
        }
    }

    @Override
    public String visitReference_long_form(DbmlParser.Reference_long_formContext ctx) {
        String relation = ctx.RELATION_OP().getText();
        if (">".equals(relation)) {
            return String.format("ALTER TABLE `%s` ADD CONSTRAINT `%s` FOREIGN KEY (`%s`) REFERENCES `%s` (`%s`)",
                    ctx.IDENTIFIER(1).getText(), ctx.IDENTIFIER(0).getText(), ctx.IDENTIFIER(2).getText(),
                    ctx.IDENTIFIER(3).getText(), ctx.IDENTIFIER(4).getText());
        } else if ("<".equals(relation)) {
            return String.format("ALTER TABLE `%s` ADD CONSTRAINT `%s` FOREIGN KEY (`<column_name`) REFERENCES `%s` (`%s`)",
                    ctx.IDENTIFIER(3).getText(), ctx.IDENTIFIER(0).getText(), ctx.IDENTIFIER(1).getText(), ctx.IDENTIFIER(2).getText());
        } else if ("-".equals(relation)) {
            return String.format("ALTER TABLE `%s` ADD CONSTRAINT `%s` FOREIGN KEY (`<column_name`) REFERENCES `%s` (`%s`)",
                    ctx.IDENTIFIER(3).getText(), ctx.IDENTIFIER(0).getText(), ctx.IDENTIFIER(1).getText(), ctx.IDENTIFIER(2).getText());
        }
        return relation;
    }

    @Override
    public String visitReference_short_form(DbmlParser.Reference_short_formContext ctx) {
        String relation = ctx.RELATION_OP().getText();
        if (">".equals(relation)) {
            List<TerminalNode> identifier = ctx.IDENTIFIER();
            return String.format("ALTER TABLE `%s` ADD CONSTRAINT `%s` FOREIGN KEY (`%s`) REFERENCES `%s` (`%s`)",
                    ctx.IDENTIFIER(1).getText(), ctx.IDENTIFIER(0).getText(), ctx.IDENTIFIER(2).getText(), ctx.IDENTIFIER(3).getText(), ctx.IDENTIFIER(4).getText());
        } else if ("<".equals(relation)) {
            return String.format("ALTER TABLE `%s` ADD CONSTRAINT `%s` FOREIGN KEY (`<column_name`) REFERENCES `%s` (`%s`)",
                    ctx.IDENTIFIER(3).getText(), ctx.IDENTIFIER(0).getText(), ctx.IDENTIFIER(1).getText(), ctx.IDENTIFIER(2).getText());
        } else if ("-".equals(relation)) {
            return String.format("ALTER TABLE `%s` ADD CONSTRAINT `%s` FOREIGN KEY (`<column_name`) REFERENCES `%s` (`%s`)",
                    ctx.IDENTIFIER(3).getText(), ctx.IDENTIFIER(0).getText(), ctx.IDENTIFIER(1).getText(), ctx.IDENTIFIER(2).getText());
        } else if("<>".equals(relation)) {
            List<TerminalNode> identifier = ctx.IDENTIFIER();
            statements.add(String.format("CREATE TABLE IF NOT EXISTS `%s_%s` (`%s_%s`, `%s`)", ctx.IDENTIFIER(1).getText(), ctx.IDENTIFIER(3),
                    ctx.IDENTIFIER(1), ctx.IDENTIFIER(2), ctx.IDENTIFIER(4).getText()));
            return String.format("ALTER TABLE `%s` ADD CONSTRAINT `%s` FOREIGN KEY (`%s`) REFERENCES `%s` (`%s`)",
                    ctx.IDENTIFIER(1).getText(), ctx.IDENTIFIER(0).getText(), ctx.IDENTIFIER(2).getText(), ctx.IDENTIFIER(3).getText(), ctx.IDENTIFIER(4).getText());
        }
        return relation;
    }

    @Override
    public String visitEnumeration(DbmlParser.EnumerationContext ctx) {
        List<String> values = new ArrayList<>();
        ctx.enum_entry().forEach(e -> values.add(e.accept(this)));
        enums.put(ctx.IDENTIFIER().getText(), values);
        return null;
    }

    @Override
    public String visitEnum_entry(DbmlParser.Enum_entryContext ctx) {
        return ctx.IDENTIFIER().getText();
    }
}

