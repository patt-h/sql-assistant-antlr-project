package com.example.antlr_sql_project;

public class SQLVisitor extends SQLQueryParserBaseVisitor<String> {
    private String tableName; // Przechowywanie nazwy tabeli

    @Override
    public String visitTableName(SQLQueryParser.TableNameContext ctx) {
        return ctx.getText();
    }

    public String getTableName() {
        return tableName;
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
        return ctx.getText();
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
