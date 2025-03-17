lexer grammar ColumnMapperLexer;

POKAZ: 'Pokaz';
Z: 'z';
GDZIE: 'gdzie';
I: 'i';
LUB: 'lub' ;
OPERATOR: '=' | '<' | '>' | '<=' | '>=' | '<>';
SUM: 'SUM';
AVG: 'AVG';
COUNT: 'COUNT';
MAX: 'MAX';
MIN: 'MIN';
LPAREN: '(';
RPAREN: ')';

WORD: 'cena'   { setText("price"); }
    | 'kategoria' { setText("category"); }
    | [a-zA-Z_][a-zA-Z_0-9]*;

NUMBER: [0-9]+;
STRING: '\'' [a-zA-Z0-9_ ]* '\'';

WS: [ \t\r\n]+ -> skip;
