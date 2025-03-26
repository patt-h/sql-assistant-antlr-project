package com.example.antlr_sql_project;

public class SQLVisitor extends SQLQueryParserBaseVisitor<String> {

    @Override
    public String visitTableName(SQLQueryParser.TableNameContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitQuery(SQLQueryParser.QueryContext ctx) {
        String selectClause = visitSelectClause(ctx.selectClause());
        String tableName = ctx.tableName().getText();
        String whereClause = ctx.condition() != null ? " WHERE " + visitCondition(ctx.condition()) : "";

        return String.format("SELECT %s FROM %s%s", selectClause, tableName, whereClause).trim();
    }

    @Override
    public String visitSelectClause(SQLQueryParser.SelectClauseContext ctx) {
        if (ctx.function() != null) {
            return visit(ctx.function());
        } else if (ctx.columnList() != null) {
            StringBuilder columns = new StringBuilder();
            for (SQLQueryParser.ColumnContext columnCtx : ctx.columnList().column()) {
                columns.append(columnCtx.getText()).append(", ");
            }
            return columns.length() > 0 ? columns.substring(0, columns.length() - 2) : ""; // Usuwa ostatni przecinek
        } else if (ctx.WSZYSTKO() != null) {
            return "*";
        }
        return "";
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
