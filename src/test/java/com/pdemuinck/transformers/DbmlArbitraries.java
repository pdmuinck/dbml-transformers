package com.pdemuinck.transformers;

import net.jqwik.api.Arbitraries;
import net.jqwik.api.Arbitrary;

public class DbmlArbitraries {

  public static Arbitrary<String> identifier() {
    return Arbitraries.strings().withCharRange('a', 'z').ofMinLength(1).ofMaxLength(20);
  }

  public static Arbitrary<String> number() {
    return Arbitraries.integers().between(0, 1000).map(Object::toString);
  }

  public static Arbitrary<String> type() {
    // Arbitrary for data types with or without numeric constraints
    return Arbitraries.of("integer", "varchar")
        .flatMap(baseType -> {
          if (baseType.equals("varchar")) {
            return number().map(n -> baseType + " (" + n + ")");
          } else {
            return Arbitraries.just(baseType);
          }
        });
  }

  public static Arbitrary<String> columnSettings() {
    return Arbitraries.of("pk", "unique", "not null", "default: 'value'")
        .list()
        .ofMinSize(1)
        .ofMaxSize(3)
        .map(settings -> "[" + String.join(", ", settings) + "]");
  }

  public static Arbitrary<String> column() {
    return identifier()
        .flatMap(id -> type()
            .flatMap(t -> columnSettings()
                .map(cs -> id + " " + t + " " + cs + ","))); // Include comma
  }

  public static Arbitrary<String> table() {
    return identifier()
        .flatMap(tableName -> column().list().ofMinSize(1).ofMaxSize(5)
            .map(columns -> "Table " + identifier() + "." + tableName + " {\n" + String.join("\n", columns) + "\n}")); }


  public static Arbitrary<String> fancyTable() {
    Arbitrary<String> schemaTableName = identifier() // Generate a table name
        .flatMap(tableName ->
            identifier().map(schema -> schema + "." + tableName)
        );

    return schemaTableName.flatMap(fullTableName ->
        column().list().ofMinSize(1).ofMaxSize(5) // Generate a list of columns
            .map(columns -> "Table " + fullTableName + " {\n" + String.join("\n", columns) + "\n}"));
  }

}
