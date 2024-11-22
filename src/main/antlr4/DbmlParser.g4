parser grammar DbmlParser;

options { tokenVocab=DbmlLexer; }

@header {
package com.pdemuinck.transformers.antlr;
}

dbml          : (project | table | reference | enumeration | note)*;

project       : PROJECT IDENTIFIER LBRACE project_settings* RBRACE;
project_settings
              : IDENTIFIER COLON STRING_LITERAL
              | NOTE COLON STRING_LITERAL;

table         : TABLE schema_table_name (AS IDENTIFIER)? table_settings? LBRACE
                  (column | table_index | note | relation)+
                RBRACE;

schema_table_name
              : schema? IDENTIFIER; // Optional schema prefix

schema
              : IDENTIFIER DOT;

table_settings
              : LBRACKET table_setting_list RBRACKET;
table_setting_list
              : table_setting (COMMA table_setting)*;
table_setting : IDENTIFIER COLON (STRING_LITERAL | HEX_COLOR | IDENTIFIER)
              | IDENTIFIER;

column        : IDENTIFIER type column_settings? (COMMA | SEMICOLON)?;
type          : IDENTIFIER (LPAREN NUMBER RPAREN)?;

column_settings
              : LBRACKET column_setting_list RBRACKET;
column_setting_list
              : column_setting (COMMA column_setting)*;
column_setting
              : IDENTIFIER COLON (STRING_LITERAL | NUMBER | BACKTICK | IDENTIFIER)
              | IDENTIFIER
              | PRIMARY_KEY
              | PK
              | UNIQUE
              | NOT_NULL
              | note
              | DEFAULT COLON (STRING_LITERAL | NUMBER | IDENTIFIER);

table_index   : INDEXES LBRACE index_entry+ RBRACE;

index_entry
    : composite_index
    | single_column_index
    | inline_expression_list
    ;

composite_index
    : LPAREN index_columns RPAREN index_settings?
    ;

index_columns
    : IDENTIFIER (COMMA IDENTIFIER)*                // Comma-separated column names
    ;

single_column_index
    : IDENTIFIER index_settings?
    ;

index_settings
    : LBRACKET index_setting_list RBRACKET                          // e.g., [pk], [name: 'index_name']
    ;

// Define inline expressions as index entries
inline_expression_list
    : LPAREN inline_expression (COMMA inline_expression)* RPAREN  // Inline expressions, comma-separated
    ;

// Inline expressions, such as calculations or functions
inline_expression
    : BACKTICK .*? BACKTICK                                   // Backtick-enclosed expressions
    ;

// Setting list within brackets
index_setting_list
    : index_setting (COMMA index_setting)*                        // Comma-separated settings
    ;

// Individual setting, can be key-value or standalone keyword
index_setting
    : IDENTIFIER COLON STRING_LITERAL
    | IDENTIFIER COLON IDENTIFIER
    | note
    | IDENTIFIER
    | PK
    | UNIQUE
    | NAME COLON STRING_LITERAL
    ;

column_expression_list
              : IDENTIFIER (COMMA IDENTIFIER)*;

note          : NOTE COLON STRING_LITERAL
              | NOTE LBRACE (STRING_LITERAL | MULTI_LINE_STRING) RBRACE;

relation      : IDENTIFIER RELATION_OP IDENTIFIER
                  (column_settings)?;

reference     : REF (IDENTIFIER COLON)? schema_table_name DOT IDENTIFIER RELATION_OP schema_table_name DOT IDENTIFIER
                  relation_settings?;
relation_settings
              : LBRACKET relation_setting_list RBRACKET;
relation_setting_list
              : relation_setting (COMMA relation_setting)*;
relation_setting
              : DELETE COLON IDENTIFIER
              | UPDATE COLON IDENTIFIER;

enumeration   : ENUM schema_table_name LBRACE enum_entry* RBRACE;
enum_entry    : IDENTIFIER (LBRACKET column_setting_list RBRACKET)?;

column_list   : IDENTIFIER (COMMA IDENTIFIER)*;
