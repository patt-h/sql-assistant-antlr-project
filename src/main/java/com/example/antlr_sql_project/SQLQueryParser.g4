parser grammar SQLQueryParser;

options { tokenVocab=SQLQueryLexer; }

query: POKAZ selectClause Z tableName (GDZIE condition)?;

selectClause: function LPAREN column RPAREN | column | WSZYSTKO;
function: SUM | AVG | COUNT | MAX | MIN;
column: WORD;
tableName: WORD;
condition:
    column OPERATOR value                          # SimpleCondition
    | condition I condition                        # AndCondition
    | condition LUB condition                      # OrCondition
    ;
value: NUMBER | STRING;
