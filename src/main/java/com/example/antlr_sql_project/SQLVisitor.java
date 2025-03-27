package com.example.antlr_sql_project;

import java.util.ArrayList;
import java.util.List;

public class SQLVisitor extends SQLQueryParserBaseVisitor<String> {
    private String mainTable;

    @Override
    public String visitTableName(SQLQueryParser.TableNameContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitQuery(SQLQueryParser.QueryContext ctx) {
        String tableName = ctx.tableName().getText();
        mainTable = tableName;
        String selectClause = visitSelectClause(ctx.selectClause());
        String joinClause = ctx.joinClause() != null ? visitJoinClause(ctx.joinClause()) : "";
        String whereClause = ctx.condition() != null ? " WHERE " + visitCondition(ctx.condition()) : "";

        if (ctx.joinClause() != null) {
            mainTable = ctx.joinClause().tableName().getText();
            String selectFromJoinClause = ", " + visitSelectFromJoin(ctx.joinClause());
            return String.format("SELECT %s%s FROM %s%s%s", selectClause, selectFromJoinClause, tableName, joinClause, whereClause).trim();
        }

        return String.format("SELECT %s FROM %s%s%s", selectClause, tableName, joinClause, whereClause).trim();
    }

    @Override
    public String visitSelectClause(SQLQueryParser.SelectClauseContext ctx) {
        if (ctx.WSZYSTKO() != null) {
            return "*";  // Zamiana * na wszystkie kolumny
        } else {
            return visitColumnList(ctx.columnList());
        }
    }

    @Override
    public String visitColumnList(SQLQueryParser.ColumnListContext ctx) {
        List<String> columns = new ArrayList<>();
        for (SQLQueryParser.ColumnContext columnContext : ctx.column()) {
            columns.add(mainTable + "." + columnContext.getText());
        }
        return String.join(", ", columns);
    }

    public String visitSelectFromJoin(SQLQueryParser.JoinClauseContext ctx) {
        return visitSelectClause(ctx.selectClause());
    }

    @Override
    public String visitJoinClause(SQLQueryParser.JoinClauseContext ctx) {
        String tableName = ctx.tableName().getText();
        String condition = visitCondition(ctx.condition());
        return " JOIN " + tableName + " ON " + condition;
    }

    @Override
    public String visitOnOperator(SQLQueryParser.OnOperatorContext ctx) {
        return ctx.tableName(0).getText() + "." + ctx.column(0).getText() + " " +
                ctx.OPERATOR().getText() + " " +
                ctx.tableName(1).getText() + "." + ctx.column(1).getText();
    }

    @Override
    public String visitFunction(SQLQueryParser.FunctionContext ctx) {
        String functionName = ctx.getChild(0).getText();
        String columnName = ctx.column().getText();
        return functionName + "(" + columnName + ")";
    }

    public String visitCondition(SQLQueryParser.ConditionContext ctx) {
        if (ctx instanceof SQLQueryParser.SimpleConditionContext) {
            return visitSimpleCondition((SQLQueryParser.SimpleConditionContext) ctx);
        } else if (ctx instanceof SQLQueryParser.AndConditionContext) {
            return visitAndCondition((SQLQueryParser.AndConditionContext) ctx);
        } else if (ctx instanceof SQLQueryParser.OrConditionContext) {
            return visitOrCondition((SQLQueryParser.OrConditionContext) ctx);
        } else if (ctx instanceof SQLQueryParser.OnOperatorContext) {
            return visitOnOperator((SQLQueryParser.OnOperatorContext) ctx);
        }
        return "";
    }

    @Override
    public String visitSimpleCondition(SQLQueryParser.SimpleConditionContext ctx) {
        return ctx.column().getText() + " " + ctx.OPERATOR().getText() + " " + ctx.value().getText();
    }

    @Override
    public String visitAndCondition(SQLQueryParser.AndConditionContext ctx) {
        return visitCondition(ctx.condition(0)) + " AND " + visitCondition(ctx.condition(1));
    }

    @Override
    public String visitOrCondition(SQLQueryParser.OrConditionContext ctx) {
        return visitCondition(ctx.condition(0)) + " OR " + visitCondition(ctx.condition(1));
    }

    @Override
    public String visitValue(SQLQueryParser.ValueContext ctx) {
        return ctx.getText();
    }
}
