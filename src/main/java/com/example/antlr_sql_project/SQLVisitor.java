package com.example.antlr_sql_project;

import org.stringtemplate.v4.ST;

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

        ST template;

        if (ctx.joinClause() != null) {
            tableName = ctx.joinClause().tableName().getText();
            String selectFromJoinClause = ", " + visitSelectFromJoin(ctx.joinClause());

            template = new ST("SELECT <columns><selectFromJoin> FROM <mainTable><joins><whereClause>");
            template.add("columns", selectClause);
            template.add("selectFromJoin", selectFromJoinClause);
        } else {
            template = new ST("SELECT <columns> FROM <mainTable><whereClause>");
            template.add("columns", selectClause);
        }

        template.add("mainTable", mainTableName);
        template.add("joins", joinClause);
        template.add("whereClause", whereClause);

        return template.render();
    }

    @Override
    public String visitTableName(SQLQueryParser.TableNameContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitSelectClause(SQLQueryParser.SelectClauseContext ctx) {
        if (ctx.WSZYSTKO() != null) {
            return tableName + ".*";
        } else if (ctx.function() != null) {
            return visit(ctx.function());
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
        return visit(ctx.selectClause());
    }

    @Override
    public String visitJoinClause(SQLQueryParser.JoinClauseContext ctx) {
        String tableName = ctx.tableName().getText();
        String condition = visit(ctx.condition());

        ST joinTemplate = new ST(" JOIN <tableName> ON <condition>");
        joinTemplate.add("tableName", tableName);
        joinTemplate.add("condition", condition);

        return joinTemplate.render();
    }

    @Override
    public String visitFunction(SQLQueryParser.FunctionContext ctx) {
        String functionName = ctx.getChild(0).getText(); // SUM, AVG, COUNT, MAX, MIN
        String columnName = ctx.column().getText();      // np. price

        ST functionTemplate = new ST("<function>(<column>)");
        functionTemplate.add("function", functionName);
        functionTemplate.add("column", tableName + "." + columnName);

        return functionTemplate.render();
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
        ST simpleConditionTemplate = new ST("<column> <operator> <value>");
        simpleConditionTemplate.add("column", ctx.column().getText());
        simpleConditionTemplate.add("operator", ctx.OPERATOR().getText());
        simpleConditionTemplate.add("value", ctx.value().getText());
        return simpleConditionTemplate.render();
    }

    @Override
    public String visitAndCondition(SQLQueryParser.AndConditionContext ctx) {
        ST andConditionTemplate = new ST("(<left>) AND (<right>)");
        andConditionTemplate.add("left", visit(ctx.condition(0)));
        andConditionTemplate.add("right", visit(ctx.condition(1)));
        return andConditionTemplate.render();
    }

    @Override
    public String visitOrCondition(SQLQueryParser.OrConditionContext ctx) {
        ST orConditionTemplate = new ST("(<left>) OR (<right>)");
        orConditionTemplate.add("left", visit(ctx.condition(0)));
        orConditionTemplate.add("right", visit(ctx.condition(1)));
        return orConditionTemplate.render();
    }

    @Override
    public String visitOnOperator(SQLQueryParser.OnOperatorContext ctx) {
        ST onOperatorTemplate = new ST("<table1>.<column1> <operator> <table2>.<column2>");
        onOperatorTemplate.add("table1", ctx.tableName(0).getText());
        onOperatorTemplate.add("column1", ctx.column(0).getText());
        onOperatorTemplate.add("operator", ctx.OPERATOR().getText());
        onOperatorTemplate.add("table2", ctx.tableName(1).getText());
        onOperatorTemplate.add("column2", ctx.column(1).getText());
        return onOperatorTemplate.render();
    }

    @Override
    public String visitValue(SQLQueryParser.ValueContext ctx) {
        return ctx.getText();
    }
}
