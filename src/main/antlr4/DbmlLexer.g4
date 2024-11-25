lexer grammar DbmlLexer;

@header {
package com.pdemuinck.transformers.antlr;
}

TABLE         : 'Table';
REF           : [Rr][e][f];
ENUM          : [Ee][n][u][m];
INDEXES       : 'indexes';
PROJECT       : 'Project';
NOTE          : 'Note' | 'note';
AS            : 'as';
DEFAULT       : 'default';
DELETE        : 'delete';
UPDATE        : 'update';
PRIMARY_KEY   : 'primary key';
UNIQUE        : 'unique';
NOT_NULL      : 'not null';
PK            : 'pk';
NAME          : 'name';
LBRACE        : '{';
RBRACE        : '}';
LPAREN        : '(';
RPAREN        : ')';
LBRACKET      : '[';
RBRACKET      : ']';
COLON         : ':';
COMMA         : ',';
SEMICOLON     : ';';
DOT           : '.';
ASSIGN        : '=';
RELATION_OP   : '>' | '<' | '-' | '<>';
BACKTICK      : '`';
STRING_LITERAL: '\'' (~['\\] | '\\' .)* '\'';
MULTI_LINE_STRING
              : '"""' .*? '"""' -> more, channel(HIDDEN);
IDENTIFIER    : [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER        : [0-9]+;
WS            : [ \t\r\n]+ -> skip;
COMMENT       : '//' ~[\r\n]* -> skip;

OPERATOR
    : '*' | '/' | '+' | '-'             // Arithmetic operators
    ;
