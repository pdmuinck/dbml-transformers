package com.pdemuinck.transformers;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Dbml {

  public Project project;
  public List<Table> tables = new ArrayList<>();
  public List<Reference> references = new ArrayList<>();
  public List<Constraint> constraints = new ArrayList<>();

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Dbml dbml = (Dbml) o;
    return Objects.equals(project, dbml.project) && Objects.equals(tables, dbml.tables) && Objects.equals(references, dbml.references) && Objects.equals(constraints, dbml.constraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, tables, references, constraints);
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
    public String settings;

    public Column(){}

    public Column(String name, String type, String note, String settings) {
      this.name = name;
      this.type = type;
      this.note = note;
      this.settings = settings;
    }

    @Override
    public String toString(){
      return String.join(" ", name, type, settings);
    }

    @Override
    public boolean equals(Object o) {
      if (o == null || getClass() != o.getClass()) return false;
      Column column = (Column) o;
      return Objects.equals(name, column.name) && Objects.equals(type, column.type) && Objects.equals(note, column.note) && Objects.equals(settings, column.settings);
    }

    @Override
    public int hashCode() {
      return Objects.hash(name, type, note, settings);
    }
  }

  public class Reference {

  }

  public class Constraint {

  }

}

