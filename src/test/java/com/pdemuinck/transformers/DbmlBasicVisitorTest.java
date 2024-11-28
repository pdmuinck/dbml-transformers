package com.pdemuinck.transformers;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class DbmlBasicVisitorTest extends BaseDbmlTest {

  @Test
  public void parses_project(){
    // When
    Dbml out = new DbmlBasicVisitor().visitDbml(parser("Project myProject { database_type: 'MySQL' Note: 'my awesome project' }").dbml());
    Dbml expected = new Dbml();
    expected.project = new Dbml.Project("myProject", "MySQL", "my awesome project");

    // Then
    assertThat(out).isEqualTo(expected);
  }

  @Test
  public void parses_table() throws IOException {
    // When
    Dbml out = new DbmlBasicVisitor().visitDbml(parser("Table users { id integer }").dbml());
    Dbml expected = new Dbml();
    expected.tables = List.of(new Dbml.Table("users", null, null, null, List.of(new Dbml.Column("id", "integer", null, null))));

    // Then
    assertThat(out).isEqualTo(expected);
  }


}
