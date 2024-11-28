package com.pdemuinck.transformers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.entry;

class DbmlBasicVisitorTest extends BaseDbmlTest {

  @Test
  public void parses_project() {
    // When
    Dbml out = new DbmlBasicVisitor().visitDbml(parser("Project myProject { database_type: 'MySQL' Note: 'my awesome project' }").dbml());
    Dbml expected = new Dbml();
    expected.project = new Dbml.Project("myProject", "MySQL", "my awesome project");

    // Then
    assertThat(out).isEqualTo(expected);
  }

  @Test
  public void parses_table() {
    // When
    Dbml out = new DbmlBasicVisitor().visitDbml(parser("Table users { id integer }").dbml());
    Dbml expected = new Dbml();
    expected.tables = List.of(new Dbml.Table("users", null, null, null,
        List.of(new Dbml.Column("id", "integer", null))));

    // Then
    assertThat(out).isEqualTo(expected);
  }

  @Test
  public void parses_column_defaults() {
    String input = """
        Table users {
          source varchar(255) [default: 'direct']
          created_at timestamp [default: `now()`]
          rating integer [default: 10]
        }
        """;
    Dbml out = new DbmlBasicVisitor().visitDbml(parser(input).dbml());

    // Then
    assertThat(out.tables.get(0).columns.stream().map(c -> c.defaultValue)).containsOnly("'direct'", "(now())", "10");
  }

  @Test
  public void parses_column_settings() {
    String input = """
        Table buildings {
          id integer [ pk, unique, default: 123, note: 'Number' ]
        }
        """;
    Dbml out = new DbmlBasicVisitor().visitDbml(parser(input).dbml());

    // Then
    assertThat(out.tables.get(0).columns.get(0).isPrimaryKey).isTrue();
    assertThat(out.tables.get(0).columns.get(0).isUnique).isTrue();
    assertThat(out.tables.get(0).columns.get(0).defaultValue).isEqualTo("123");
    assertThat(out.tables.get(0).columns.get(0).note).isEqualTo("'Number'");
  }

  @Test
  public void parses_table_with_note() {
    String input = """
        Table users {
          note: 'This is a table for users'
          id integer
        }
        """;
    Dbml out = new DbmlBasicVisitor().visitDbml(parser(input).dbml());

    // Then
    assertThat(out.tables.get(0).note).isEqualTo("'This is a table for users'");
  }

  @Test
  public void parses_table_with_setting() {
    String input = """
        Table users[dbt_materialization: 'incremental'] {
          id integer [not null]
        }
        """;
    Dbml out = new DbmlBasicVisitor().visitDbml(parser(input).dbml());

    // Then
    assertThat(out.tables.get(0).settings).contains(entry("dbt_materialization", "'incremental'"));
  }

  @Test
  public void parses_column_with_enum() {
    String input = """
        enum job_status {
          created [note: 'Waiting to be processed']
          running
          done
          failure
        }
        
        Table jobs {
          id integer
          status job_status
        }
        """;

    Dbml out = new DbmlBasicVisitor().visitDbml(parser(input).dbml());

    // Then
    assertThat(out.tables.get(0).columns.get(1).enumValues).containsExactly("created", "running", "done", "failure");
  }
}
