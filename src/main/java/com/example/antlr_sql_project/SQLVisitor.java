package com.example.antlr_sql_project;

import java.util.ArrayList;
import java.util.List;

public class SQLVisitor extends SQLQueryParserBaseVisitor<String> {
    private String tableName;

    @Override
    public String visitQuery(SQLQueryParser.QueryContext ctx) {
        String mainTableName = ctx.tableName().getText();
        tableName = mainTableName;
        String selectClause = visit(ctx.selectClause());
        String joinClause = ctx.joinClause() != null ? visit(ctx.joinClause()) : "";
        String whereClause = ctx.condition() != null ? " WHERE " + visit(ctx.condition()) : "";

        if (ctx.joinClause() != null) {
            tableName = ctx.joinClause().tableName().getText();
            String selectFromJoinClause = ", " + visitSelectFromJoin(ctx.joinClause());
            return String.format("SELECT %s%s FROM %s%s%s", selectClause, selectFromJoinClause, mainTableName, joinClause, whereClause).trim();
        }

        return String.format("SELECT %s FROM %s%s", selectClause, mainTableName, whereClause).trim();
    }

    @Override
    public String visitTableName(SQLQueryParser.TableNameContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitSelectClause(SQLQueryParser.SelectClauseContext ctx) {
        if (ctx.WSZYSTKO() != null) {
            return tableName + ".*";
        } else {
            return visit(ctx.columnList());
        }
    }

    @Override
    public String visitColumnList(SQLQueryParser.ColumnListContext ctx) {
        List<String> columns = new ArrayList<>();
        for (SQLQueryParser.ColumnContext columnContext : ctx.column()) {
            columns.add(tableName + "." + columnContext.getText());
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
        return visit(ctx.condition(0)) + " AND " + visitCondition(ctx.condition(1));
    }

    @Override
    public String visitOrCondition(SQLQueryParser.OrConditionContext ctx) {
        return visit(ctx.condition(0)) + " OR " + visitCondition(ctx.condition(1));
    }

    @Override
    public String visitOnOperator(SQLQueryParser.OnOperatorContext ctx) {
        return ctx.tableName(0).getText() + "." + ctx.column(0).getText() + " " +
                ctx.OPERATOR().getText() + " " +
                ctx.tableName(1).getText() + "." + ctx.column(1).getText();
    }

    @Override
    public String visitValue(SQLQueryParser.ValueContext ctx) {
        return ctx.getText();
    }
}
