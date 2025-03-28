lexer grammar SQLQueryLexer;

POKAZ: 'Pokaz';
WSZYSTKO: 'wszystko';
Z: 'z';
GDZIE: 'gdzie';
I: 'i';
LUB: 'lub';
LPAREN: '(';
RPAREN: ')';
OPERATOR: '=' | '<' | '>' | '<=' | '>=' | '<>';
SUM: 'SUM';
AVG: 'AVG';
COUNT: 'COUNT';
MAX: 'MAX';
MIN: 'MIN';
COMMA: ',';
DOT: '.';
DODAJ: 'dodaj';
ON: 'warunek';

WORD: [a-zA-Z_][a-zA-Z_0-9]*;
NUMBER: [0-9]+;
STRING: '\'' [a-zA-Z0-9_ ]* '\'';

WS: [ \t\r\n]+ -> skip;
