grammar JokoScript;

options {
    language = Java;
}

@header {
package me.august.jokoscript.antlr.gen;
}

NUMBER: [0-9]+ ( '.' [0-9]+ )?;
IDENT: [a-zA-Z]+;
STR: '"' (' ' | [a-zA-Z0-9])+? '"';

L_PAREN: '(';
R_PAREN: ')';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';

WS: [ \t\r\n]+ -> skip;

joko_main: (joko_call | joko_function | joko_class)+;
joko_class: ('new Hasmap<class,' IDENT '>') (joko_call | joko_function)+ 'old Hasmap';
joko_function: ('new Hasmap<function,' IDENT '>') (joko_call)+ 'old Hasmap';
joko_call: 'Hasmap<' IDENT (',' expr)*? '>';

expr: shiftExpr;
shiftExpr: scaleExpr ((PLUS | MINUS) scaleExpr)*;
scaleExpr: component ((MULT | DIV) component)*;
component: NUMBER | IDENT | STR | L_PAREN expr R_PAREN | joko_call;