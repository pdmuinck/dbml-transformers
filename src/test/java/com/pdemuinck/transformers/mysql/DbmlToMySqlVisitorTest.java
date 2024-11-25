package com.pdemuinck.transformers.mysql;

import com.pdemuinck.transformers.BaseDbmlTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class DbmlToMySqlVisitorTest extends BaseDbmlTest {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void parses_dbml_to_mysql(String input, String output) throws IOException {
        // When
        String out = new DbmlToMySqlVisitor().visitDbml(parser(this.getClass().getClassLoader().getResourceAsStream(input)).dbml());

        // Then
        assertThat(out).isEqualTo(new String(this.getClass().getClassLoader().getResourceAsStream(output).readAllBytes()));
    }

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of("dbml/tables.dbml", "mysql/tables.sql"),
                Arguments.of("dbml/table_with_note.dbml", "mysql/table_with_comment.sql"),
                Arguments.of("dbml/table_settings.dbml", "mysql/table_settings.sql"),
                Arguments.of("dbml/column_defaults.dbml", "mysql/column_defaults.sql"),
                Arguments.of("dbml/index_definition.dbml", "mysql/index_definition.sql"),
                Arguments.of("dbml/relation_short_form_many_to_many.dbml", "mysql/relation_short_form_many_to_many.sql"),
                Arguments.of("dbml/relation_short_form_one_to_many.dbml", "mysql/relation_short_form_one_to_many.sql"),
                Arguments.of("dbml/relation_short_form_many_to_one.dbml", "mysql/relation_short_form_many_to_one.sql"),
                Arguments.of("dbml/relation_short_form_one_to_one.dbml", "mysql/relation_short_form_one_to_one.sql"),
                Arguments.of("dbml/relation_inline_form_many_to_many.dbml", "mysql/relation_inline_form_many_to_many.sql"),
                Arguments.of("dbml/relation_inline_form_many_to_one.dbml", "mysql/relation_inline_form_many_to_one.sql"),
                Arguments.of("dbml/relation_inline_form_one_to_one.dbml", "mysql/relation_inline_form_one_to_one.sql"),
                Arguments.of("dbml/relation_inline_form_one_to_many.dbml", "mysql/relation_inline_form_one_to_many.sql"),
                Arguments.of("dbml/relation_long_form_many_to_many.dbml", "mysql/relation_long_form_many_to_many.sql"),
                Arguments.of("dbml/relation_long_form_many_to_one.dbml", "mysql/relation_long_form_many_to_one.sql"),
                Arguments.of("dbml/relation_long_form_one_to_one.dbml", "mysql/relation_long_form_one_to_one.sql"),
                Arguments.of("dbml/relation_long_form_one_to_many.dbml", "mysql/relation_long_form_one_to_many.sql"),
                Arguments.of("dbml/cross_schema_relation.dbml", "mysql/cross_schema_relation.sql"),
                Arguments.of("dbml/enum.dbml", "mysql/enum.sql"),
                Arguments.of("dbml/column_settings.dbml", "mysql/column_settings.sql")
        );
    }
}
