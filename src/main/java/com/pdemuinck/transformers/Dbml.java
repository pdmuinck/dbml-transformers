package com.pdemuinck.transformers;

import java.util.*;

public class Dbml {

  public Project project;
  public List<Table> tables = new ArrayList<>();
  public List<Reference> references = new ArrayList<>();
  public List<Index> indexes = new ArrayList<>();

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Dbml dbml = (Dbml) o;
    return Objects.equals(project, dbml.project) && Objects.equals(tables, dbml.tables) && Objects.equals(references, dbml.references) && Objects.equals(indexes, dbml.indexes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, tables, references, indexes);
  }

  public static class Project {
    public String name;
    public String databaseType;
    public String note;

    public Project(){}

    public Project(String name, String databaseType, String note) {
      this.name = name;
      this.databaseType = databaseType;
      this.note = note;
    }

    @Override
    public boolean equals(Object o) {
      if (o == null || getClass() != o.getClass()) return false;
      Project project = (Project) o;
      return Objects.equals(name, project.name) && Objects.equals(databaseType, project.databaseType) && Objects.equals(note, project.note);
    }

    @Override
    public int hashCode() {
      return Objects.hash(name, databaseType, note);
    }
  }

  public static class Table{
    public String name;
    public String alias;
    public String note;
    public String schema;
    public List<Column> columns = new ArrayList<>();
    public Map<String, String> settings = new HashMap<>();

    public Table(){}

    public Table(String name, String alias, String note, String schema, List<Column> columns) {
      this.name = name;
      this.alias = alias;
      this.note = note;
      this.schema = schema;
      this.columns = columns;
    }

    @Override
    public String toString(){
      return String.join(" ", name, alias, schema);
    }

    @Override
    public boolean equals(Object o) {
      if (o == null || getClass() != o.getClass()) return false;
      Table table = (Table) o;
      return Objects.equals(name, table.name) && Objects.equals(alias, table.alias) && Objects.equals(note, table.note) && Objects.equals(schema, table.schema) && Objects.equals(columns, table.columns);
    }

    @Override
    public int hashCode() {
      return Objects.hash(name, alias, note, schema, columns);
    }
  }

  public static class Column {
    public String name;
    public String type;
    public String note;
    public String defaultValue;
    public boolean isPrimaryKey;
    public boolean isUnique;
    public boolean isNotNull;
    public boolean isAutoIncrement;
    public List<String> enumValues = new ArrayList<>();

    public Column(){}

    public Column(String name, String type, String note, boolean isPrimaryKey, String defaultValue) {
      this.name = name;
      this.type = type;
      this.note = note;
      this.isPrimaryKey = isPrimaryKey;
      this.defaultValue = defaultValue;
    }

    @Override
    public String toString(){
      return String.join(" ", name, type);
    }
    @Override
    public boolean equals(Object o) {
      if (o == null || getClass() != o.getClass()) return false;
      Column column = (Column) o;
      return Objects.equals(name, column.name) && Objects.equals(type, column.type) && Objects.equals(note, column.note)
          && Objects.equals(defaultValue, column.defaultValue) && isPrimaryKey == column.isPrimaryKey
          && isUnique == column.isUnique && isNotNull == column.isNotNull && isAutoIncrement == column.isAutoIncrement
          && Objects.equals(enumValues, column.enumValues);
    }

    @Override
    public int hashCode() {
      return Objects.hash(name, type, note);
    }
  }

  public static class Reference {
    public String name;
    public String table;
    public String column;
    public String referencedTable;
    public String referencedColumn;
    public String type;

    public Reference(String name, String table, String column, String referencedTable, String referencedColumn, String type) {
      this.name = name;
      this.table = table;
      this.column = column;
      this.referencedTable = referencedTable;
      this.referencedColumn = referencedColumn;
      this.type = type;
    }

    public Reference(){}

    @Override
    public boolean equals(Object o) {
      if (o == null || getClass() != o.getClass()) return false;
      Reference reference = (Reference) o;
      return Objects.equals(name, reference.name) && Objects.equals(table, reference.table) && Objects.equals(column, reference.column) && Objects.equals(referencedTable, reference.referencedTable) && Objects.equals(referencedColumn, reference.referencedColumn) && Objects.equals(type, reference.type);
    }

    @Override
    public int hashCode() {
      return Objects.hash(name, table, column, referencedTable, referencedColumn, type);
    }
  }

  public static class Index {
    public boolean isUnique;
    public boolean isPrimaryKey;
    public String name;
    public String table;
    public String type;
    public List<String> columns = new ArrayList<>();

    public Index(boolean isUnique, boolean isPrimaryKey, String name, String table, String type, List<String> columns) {
      this.isUnique = isUnique;
      this.isPrimaryKey = isPrimaryKey;
      this.name = name;
      this.table = table;
      this.type = type;
      this.columns = columns;
    }

    public Index(){}
  }

}

