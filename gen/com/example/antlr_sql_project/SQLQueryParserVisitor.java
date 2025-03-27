// Generated from C:/Users/patry/Desktop/Projekty/antlr-sql-project/src/main/java/com/example/antlr_sql_project/SQLQueryParser.g4 by ANTLR 4.13.1
package com.example.antlr_sql_project;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLQueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLQueryParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(SQLQueryParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(SQLQueryParser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#joinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinClause(SQLQueryParser.JoinClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#columnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnList(SQLQueryParser.ColumnListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(SQLQueryParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(SQLQueryParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(SQLQueryParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleCondition}
	 * labeled alternative in {@link SQLQueryParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCondition(SQLQueryParser.SimpleConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OnOperator}
	 * labeled alternative in {@link SQLQueryParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnOperator(SQLQueryParser.OnOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrCondition}
	 * labeled alternative in {@link SQLQueryParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrCondition(SQLQueryParser.OrConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndCondition}
	 * labeled alternative in {@link SQLQueryParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndCondition(SQLQueryParser.AndConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLQueryParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(SQLQueryParser.ValueContext ctx);
}