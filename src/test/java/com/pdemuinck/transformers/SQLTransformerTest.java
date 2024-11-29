package com.pdemuinck.transformers;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SQLTransformerTest {

  @Test
  public void test_transform(){
    Dbml dbml = new Dbml();
    dbml.tables.add(new Dbml.Table("users", null, null, "my_schema", List.of(new Dbml.Column("id", "integer", null, true, null))));
    dbml.indexes.add(new Dbml.Index(true, true, null, "users", null, List.of("id")));
    SQLTransformer sqlTransformer = new SQLTransformer();
    String transform = sqlTransformer.transform(dbml);
    assertThat(transform).contains("CREATE SCHEMA my_schema;", "CREATE TABLE users (\n  id integer PRIMARY KEY\n);\n");
  }

  @Test
  public void adds_primary_key_definition_at_end_of_column_definition_when_more_than_1_column_forms_primary_key(){
    Dbml dbml = new Dbml();
    dbml.tables.add(new Dbml.Table("users", null, null, null,
        List.of(new Dbml.Column("id", "integer", null, true, null),
            new Dbml.Column("name", "varchar", null, true, null))));
    dbml.indexes.add(new Dbml.Index(true, true, null, "users", null, List.of("id", "name")));
    SQLTransformer sqlTransformer = new SQLTransformer();
    String transform = sqlTransformer.transform(dbml);
    assertThat(transform).contains("CREATE TABLE users (\n  id integer,\n  name varchar,\n  PRIMARY KEY (id, name)\n);\n");
  }

  @Test
  public void sets_default_value_for_column(){
    Dbml dbml = new Dbml();
    dbml.tables.add(new Dbml.Table("users", null, null, null,
        List.of(new Dbml.Column("id", "integer", null, true, "10"))));
    SQLTransformer sqlTransformer = new SQLTransformer();
    String transform = sqlTransformer.transform(dbml);
    assertThat(transform).contains("CREATE TABLE users (\n  id integer DEFAULT 10 PRIMARY KEY\n);\n");
  }

  @Property
  boolean absoluteValueOfAllNumbersIsPositive(@ForAll int anInteger) {
    return Math.abs(anInteger) >= 0;
  }

}
