package com.pdemuinck.transformers.project;

import com.pdemuinck.transformers.antlr.DbmlParser;
import com.pdemuinck.transformers.antlr.DbmlParserBaseVisitor;

public class DbmlProjectVisitor extends DbmlParserBaseVisitor<DbmlProject> {

  private DbmlProject dbmlProject;

  @Override
  public DbmlProject visitProject(DbmlParser.ProjectContext ctx) {
    dbmlProject = new DbmlProject();
    dbmlProject.name = ctx.IDENTIFIER().getText();
    ctx.project_settings().forEach(this::visitProject_settings);
    return dbmlProject;
  }

  @Override
  public DbmlProject visitProject_settings(DbmlParser.Project_settingsContext ctx) {
    if (ctx.STRING_LITERAL() != null) {
      String literal = ctx.STRING_LITERAL().getText().replaceAll("'", "").replaceAll("\"", "");
      if (ctx.NOTE() != null) {
        dbmlProject.note = literal;
      } else if ("database_type".equals(ctx.IDENTIFIER().getText())) {
        dbmlProject.databaseType = literal;
      }
    }
    return null;
  }
}
