// Generated from C:/Users/patry/Desktop/Projekty/antlr-sql-project/src/main/java/com/example/antlr_sql_project/SQLQueryParser.g4 by ANTLR 4.13.1
package com.example.antlr_sql_project;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLQueryParser}.
 */
public interface SQLQueryParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(SQLQueryParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(SQLQueryParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(SQLQueryParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(SQLQueryParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinClause(SQLQueryParser.JoinClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinClause(SQLQueryParser.JoinClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#columnList}.
	 * @param ctx the parse tree
	 */
	void enterColumnList(SQLQueryParser.ColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#columnList}.
	 * @param ctx the parse tree
	 */
	void exitColumnList(SQLQueryParser.ColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(SQLQueryParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(SQLQueryParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(SQLQueryParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(SQLQueryParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(SQLQueryParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(SQLQueryParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleCondition}
	 * labeled alternative in {@link SQLQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCondition(SQLQueryParser.SimpleConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleCondition}
	 * labeled alternative in {@link SQLQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCondition(SQLQueryParser.SimpleConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OnOperator}
	 * labeled alternative in {@link SQLQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterOnOperator(SQLQueryParser.OnOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OnOperator}
	 * labeled alternative in {@link SQLQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitOnOperator(SQLQueryParser.OnOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrCondition}
	 * labeled alternative in {@link SQLQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterOrCondition(SQLQueryParser.OrConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrCondition}
	 * labeled alternative in {@link SQLQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitOrCondition(SQLQueryParser.OrConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndCondition}
	 * labeled alternative in {@link SQLQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterAndCondition(SQLQueryParser.AndConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndCondition}
	 * labeled alternative in {@link SQLQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitAndCondition(SQLQueryParser.AndConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLQueryParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(SQLQueryParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLQueryParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(SQLQueryParser.ValueContext ctx);
}