package com.pdemuinck.transformers;

import java.util.List;
import java.util.stream.Collectors;

public class SQLTransformer {

  private Dbml.Table currentTable;

  public String transform(Dbml dbml) {
    StringBuilder sb = new StringBuilder();
    List<String> schemas = dbml.tables.stream().map(t -> t.schema).collect(Collectors.toSet()).stream().toList();
    schemas.forEach(s -> sb.append("CREATE SCHEMA " + s + ";\n"));
    dbml.tables.forEach(table -> {
      currentTable = table;
      sb.append("CREATE TABLE " + table.name + " (");
      sb.append(String.join(", ", table.columns.stream().map(this::parseColumn).toArray(String[]::new)));
      if (table.columns.stream().anyMatch(c -> c.isPrimaryKey)) {
        sb.append(", PRIMARY KEY (" + table.columns.stream().filter(c -> c.isPrimaryKey).map(c -> c.name).collect(Collectors.joining(", ")) + ")");
      }
      sb.append(");");
    });
    dbml.indexes.forEach(index -> {
      if (index.isUnique && !index.isPrimaryKey) {
        sb.append("CREATE UNIQUE INDEX " + index.name + " ON " + index.table + " (" + String.join(", ", index.columns) + ");\n");
      } else if (!index.isPrimaryKey) {
        sb.append("CREATE INDEX " + index.name + " ON " + index.table + " (" + String.join(", ", index.columns) + ");\n");
      }
    });
    return sb.toString();
  }

  private String parseColumn(Dbml.Column column) {
    if (column.type == null) {
      throw new RuntimeException(String.format("Column type cannot be null for column %s, in table %s", column.name, currentTable.name));
    }
    StringBuilder sb = new StringBuilder();
    sb.append("  " + column.name + " " + column.type);
    if (column.isNotNull) {
      sb.append(" NOT NULL");
    }
    if (column.isUnique) {
      sb.append(" UNIQUE");
    }
    if (column.defaultValue != null) {
      sb.append(" DEFAULT " + column.defaultValue);
    }
    return sb.toString();
  }
}
