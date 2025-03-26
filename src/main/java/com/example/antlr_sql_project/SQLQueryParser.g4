parser grammar SQLQueryParser;

options { tokenVocab=SQLQueryLexer; }

query: POKAZ selectClause Z tableName (GDZIE condition)?;

selectClause: function | columnList | WSZYSTKO;
columnList: column (COMMA column)*;
function: (SUM | AVG | COUNT | MAX | MIN) LPAREN column RPAREN;
column: WORD;
tableName: WORD;
condition:
    column OPERATOR value                          # SimpleCondition
    | condition I condition                        # AndCondition
    | condition LUB condition                      # OrCondition
    ;
value: NUMBER | STRING;
