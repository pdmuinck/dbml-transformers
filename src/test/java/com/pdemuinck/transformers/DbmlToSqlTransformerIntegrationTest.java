package com.pdemuinck.transformers;

import net.jqwik.api.Arbitrary;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Provide;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.containers.wait.strategy.Wait;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

@Testcontainers
public class DbmlToSqlTransformerIntegrationTest extends BaseDbmlTest{

  protected static final String MYSQL_IMAGE = "mysql:8.3.0";

  protected MySQLContainer<?> mySQL  = new MySQLContainer<>(MYSQL_IMAGE).withUsername("root").waitingFor(Wait.defaultWaitStrategy());

  @Provide
  Arbitrary<String> dbmlTables(){
    return DbmlArbitraries.fancyTable();
  }

  @Property
  void parses_table(@ForAll("dbmlTables") String table) throws SQLException {
    // When
    mySQL.start();
    mySQL.waitingFor(Wait.defaultWaitStrategy());
    Dbml out = new DbmlBasicVisitor().visitDbml(parser(table).dbml());
    SQLTransformer sqlTransformer = new SQLTransformer();
    String ddl = sqlTransformer.transform(out);
    mySQL.createConnection("").createStatement().executeUpdate(ddl);
  }
}
