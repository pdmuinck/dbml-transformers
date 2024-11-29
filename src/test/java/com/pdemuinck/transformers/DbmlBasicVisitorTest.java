package com.pdemuinck.transformers;

import net.jqwik.api.Arbitrary;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Provide;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.entry;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
        List.of(new Dbml.Column("id", "integer", null, false, null))));

    // Then
    assertThat(out).isEqualTo(expected);
  }

  @Test
  public void parses_table_with_schema() {
    // When
    Dbml out = new DbmlBasicVisitor().visitDbml(parser("Table schema.users { id integer }").dbml());
    Dbml expected = new Dbml();
    expected.tables = List.of(new Dbml.Table("schema.users", null, null, "schema",
        List.of(new Dbml.Column("id", "integer", null, false, null))));

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

  @Test
  public void parses_indexes() {
    // Given
    String input = """
        Table bookings {
          id integer
          country varchar
          booking_date date
          created_at timestamp
        
          indexes {
            (id, country) [pk]
            created_at [name: 'created_at_index', note: 'Date']
            booking_date
            (country, booking_date) [unique]
            booking_date [type: hash]
            (`id*2`)
            (`id*3`,`getdate()`)
            (`id*3`,id)
          }
        }
        """;

    // When
    Dbml out = new DbmlBasicVisitor().visitDbml(parser(input).dbml());

    // Then
    assertThat(out.indexes.get(0).isPrimaryKey).isTrue();
    assertThat(out.tables.get(0).columns.get(0).isPrimaryKey).isTrue();
    assertThat(out.indexes.get(0).columns).containsOnly("id", "country");
    assertThat(out.indexes.get(1).name).isEqualTo("'created_at_index'");
    assertThat(out.indexes.get(1).columns).containsOnly("created_at");
    assertThat(out.indexes.get(2).columns).containsOnly("booking_date");
    assertThat(out.indexes.get(3).columns).containsOnly("country", "booking_date");
    assertThat(out.indexes.get(4).columns).containsOnly("booking_date");
    assertThat(out.indexes.get(4).type).isEqualTo("hash");
    assertThat(out.indexes.get(5).columns).containsOnly("id*2");
    assertThat(out.indexes.get(6).columns).containsOnly("id*3", "getdate()");
    assertThat(out.indexes.get(7).columns).containsOnly("id*3", "id");
  }

  @ParameterizedTest
  @CsvSource({
      "-, one-to-one",
      "<, one-to-many",
      ">, many-to-one"
  })
  public void relation_one_to_one_short_form(String symbol, String relation) {
    String input = String.format("""
        Table posts {
          id integer [primary key]
          user_id integer
        }
        
        Table users {
          id integer
        }
        
        Ref fk_name: posts.user_id %s users.id
        """, symbol);

    Dbml out = new DbmlBasicVisitor().visitDbml(parser(input).dbml());

    assertThat(out.references).containsExactly(new Dbml.Reference("fk_name", "posts", "user_id", "users", "id", relation));
  }

  @Test
  public void many_to_many_relation_short_form() {
    String input = """
        Table posts {
          id integer [primary key]
          user_id integer
        }
        
        Table users {
          id integer
        }
        
        Ref fk_name: posts.user_id <> users.id
        """;

    Dbml out = new DbmlBasicVisitor().visitDbml(parser(input).dbml());

    assertThat(out.references).containsExactly(
        new Dbml.Reference("fk_name", "posts_users", "posts_user_id", "posts", "user_id", "many-to-many"),
        new Dbml.Reference("fk_name", "posts_users", "users_id", "users", "id", "many-to-many"));
  }

  @ParameterizedTest
  @CsvSource({
      "-, one-to-one",
      "<, one-to-many",
      ">, many-to-one"
  })
  public void relation_one_to_one_long_form(String symbol, String relation) {
    String input = String.format("""
        Table posts {
          id integer [primary key]
          user_id integer
        }
        
        Table users {
          id integer
        }
        
        Ref fk_name {
          posts.user_id %s users.id
        }
        """, symbol);

    Dbml out = new DbmlBasicVisitor().visitDbml(parser(input).dbml());

    assertThat(out.references).containsExactly(new Dbml.Reference("fk_name", "posts", "user_id", "users", "id", relation));
  }

  @Test
  public void many_to_many_relation_long_form() {
    String input = """
        Table posts {
          id integer [primary key]
          user_id integer
        }
        
        Table users {
          id integer
        }
        
        Ref fk_name {
          posts.user_id <> users.id
        }
        """;

    Dbml out = new DbmlBasicVisitor().visitDbml(parser(input).dbml());

    assertThat(out.references).containsExactly(
        new Dbml.Reference("fk_name", "posts_users", "posts_user_id", "posts", "user_id", "many-to-many"),
        new Dbml.Reference("fk_name", "posts_users", "users_id", "users", "id", "many-to-many"));
  }

  @ParameterizedTest
  @CsvSource({
      "-, one-to-one",
      "<, one-to-many",
      ">, many-to-one"
  })
  public void relation_one_to_one_inline(String symbol, String relation) {
    String input = String.format("""
        Table posts {
          id integer [primary key]
          user_id integer [ref: %s users.id]
        }
        
        Table users {
          id integer
        }
        """, symbol);

    Dbml out = new DbmlBasicVisitor().visitDbml(parser(input).dbml());

    assertThat(out.references).containsExactly(new Dbml.Reference(null, "posts", "user_id", "users", "id", relation));
  }

  @Test
  public void many_to_many_relation_inline() {
    String input = """
        Table posts {
          id integer [primary key]
          user_id integer [ref: <> users.id]
        }
        
        Table users {
          id integer
        }
        """;

    Dbml out = new DbmlBasicVisitor().visitDbml(parser(input).dbml());

    assertThat(out.references).containsExactly(
        new Dbml.Reference(null, "posts_users", "posts_user_id", "posts", "user_id", "many-to-many"),
        new Dbml.Reference(null, "posts_users", "users_id", "users", "id", "many-to-many"));
  }

  @Test
  public void yells_at_column_without_type() {
    String input = """
        Table posts {
          id
        }
        """;

    assertThrows(RuntimeException.class, () -> new DbmlBasicVisitor().visitDbml(parser(input).dbml()));
  }




}
