package com.example.antlr_sql_project.Service;

import com.example.antlr_sql_project.SQLQueryLexer;
import com.example.antlr_sql_project.SQLQueryParser;
import com.example.antlr_sql_project.SQLVisitor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.antlr.v4.runtime.*;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class QueryService {

    private final EntityManager entityManager;

    public List<Map<String, Object>> processQuery(String userQuery) {
        CharStream input = CharStreams.fromString(userQuery);
        SQLQueryLexer sqlLexer = new SQLQueryLexer(input);
        CommonTokenStream sqlTokens = new CommonTokenStream(sqlLexer);
        SQLQueryParser parser = new SQLQueryParser(sqlTokens);
        SQLQueryParser.QueryContext tree = parser.query();

        // Generowanie finalnego SQL
        SQLVisitor visitor = new SQLVisitor();
        String sql = visitor.visit(tree);
        String tableName = visitor.visitTableName(tree.tableName());
        List<String> columnNames = getColumnNames(tableName);

        System.out.println(sql);

        Query query = entityManager.createNativeQuery(sql);
        List<?> resultList = query.getResultList();
        List<Map<String, Object>> formattedResults = new ArrayList<>();

        for (Object result : resultList) {
            if (result instanceof Object[] rowArray) {
                Map<String, Object> rowMap = new LinkedHashMap<>();
                for (int i = 0; i < rowArray.length; i++) {
                    String columnName = columnNames.size() > i ? columnNames.get(i) : "column" + (i + 1);
                    rowMap.put(columnName, rowArray[i]);
                }
                formattedResults.add(rowMap);
            } else if (result instanceof String str) {
                // Jeśli wynik jest pojedynczym Stringiem, zwróć go w mapie
                formattedResults.add(Map.of("result", str));
            } else if (result instanceof BigDecimal bigDecimal) {
                formattedResults.add(Map.of("result", bigDecimal.doubleValue()));
            } else {
                formattedResults.add(Map.of("result", result));
            }
        }

        return formattedResults;
    }

    @SuppressWarnings("unchecked")
    public List<String> getColumnNames(String tableName) {
        return (List<String>) entityManager.createNativeQuery(
                "SELECT column_name FROM information_schema.columns WHERE table_name = :table"
        ).setParameter("table", tableName).getResultList();
    }

}
