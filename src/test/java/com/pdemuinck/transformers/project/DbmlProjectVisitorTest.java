package com.pdemuinck.transformers.project;

import com.pdemuinck.transformers.BaseDbmlTest;
import com.pdemuinck.transformers.antlr.DbmlLexer;
import com.pdemuinck.transformers.antlr.DbmlParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class DbmlProjectVisitorTest extends BaseDbmlTest {

    @ParameterizedTest
    @ValueSource(strings = {
            "Project project_name { database_type: 'mysql', Note: 'this is awesome' }",
            "Project project_name { database_type: \"mysql\", Note: 'this is awesome' }",
    })
    public void parses_dbml_project() {
        // Given
        DbmlParser parser = parser("Project project_name { database_type: 'mysql', Note: 'this is awesome' }");

        // When
        DbmlProject dbmlProject = new DbmlProjectVisitor().visitDbml(parser.dbml());

        // Then
        assertThat(dbmlProject.databaseType).isEqualTo("mysql");
        assertThat(dbmlProject.note).isEqualTo("this is awesome");
        assertThat(dbmlProject.name).isEqualTo("project_name");
    }
}
