parser grammar SQLQueryParser;

options { tokenVocab=SQLQueryLexer; }

query: POKAZ selectClause Z tableName (joinClause)? (GDZIE condition)?;

selectClause: function | columnList | WSZYSTKO;
joinClause: DODAJ selectClause Z tableName ON condition;
columnList: column (COMMA column)*;
function: (SUM | AVG | COUNT | MAX | MIN) LPAREN column RPAREN;
column: WORD | WORD DOT WORD | function;
tableName: WORD;
condition:
    column OPERATOR value                                   # SimpleCondition
    | condition I condition                                 # AndCondition
    | condition LUB condition                               # OrCondition
    | tableName DOT column OPERATOR tableName DOT column    # OnOperator
    ;
value: NUMBER | STRING;
