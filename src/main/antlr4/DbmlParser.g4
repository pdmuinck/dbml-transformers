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
table_setting : IDENTIFIER COLON (STRING_LITERAL | NUMBER)
              | IDENTIFIER;

column        : IDENTIFIER type column_settings? (COMMA | SEMICOLON)?
              | IDENTIFIER IDENTIFIER
              ;
type          : IDENTIFIER (LPAREN NUMBER RPAREN)?;

column_settings
              : LBRACKET column_setting_list RBRACKET
              ;
column_setting_list
              : (column_setting | reference) (COMMA column_setting | reference)*;
column_setting
              : IDENTIFIER COLON (inline_expression | STRING_LITERAL | NUMBER | IDENTIFIER)
              | IDENTIFIER
              | PRIMARY_KEY
              | PK
              | UNIQUE
              | NOT_NULL
              | note
              | DEFAULT COLON (inline_expression | STRING_LITERAL | NUMBER | IDENTIFIER);

table_index   : INDEXES LBRACE index_entry+ RBRACE;

index_entry
    : composite_index
    | single_column_index
    ;

composite_index
    : LPAREN index_columns RPAREN index_settings?
    ;

index_columns
    : column_expression_list // List of identifiers or numbers
    | inline_expression_list // List of backtick-enclosed expressions
    ;

single_column_index
    : IDENTIFIER index_settings?
    ;

index_settings
    : LBRACKET index_setting_list RBRACKET                          // e.g., [pk], [name: 'index_name']
    ;

inline_expression_list
    : inline_expression (COMMA inline_expression)*
    ;

// Inline expressions, such as calculations or functions
inline_expression
    : BACKTICK expression BACKTICK                                   // Backtick-enclosed expressions
    | IDENTIFIER
    ;


// Support valid mathematical or function-like expressions
expression
    : (IDENTIFIER | function_call) (OPERATOR (IDENTIFIER | NUMBER))*  // Support for operators like `id*2`
    ;

// Functions like `getdate()`
function_call
    : IDENTIFIER LPAREN (IDENTIFIER (COMMA IDENTIFIER)*)? RPAREN
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

reference
              : reference_short_form
              | REF COLON RELATION_OP (IDENTIFIER DOT)? IDENTIFIER DOT IDENTIFIER
              | reference_long_form
              ;

reference_long_form:
                REF IDENTIFIER LBRACE
                  IDENTIFIER DOT IDENTIFIER RELATION_OP IDENTIFIER DOT IDENTIFIER
                RBRACE;

reference_short_form
              : REF IDENTIFIER COLON IDENTIFIER DOT IDENTIFIER RELATION_OP IDENTIFIER DOT IDENTIFIER
              ;

relation_settings
              : LBRACKET relation_setting_list RBRACKET;
relation_setting_list
              : relation_setting (COMMA relation_setting)*;
relation_setting
              : DELETE COLON IDENTIFIER
              | UPDATE COLON IDENTIFIER;

enumeration   : ENUM IDENTIFIER LBRACE enum_entry* RBRACE;
enum_entry    : IDENTIFIER (LBRACKET column_setting_list RBRACKET)?;

column_list   : IDENTIFIER (COMMA IDENTIFIER)*;
