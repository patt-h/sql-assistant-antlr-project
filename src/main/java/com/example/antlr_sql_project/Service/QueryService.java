package com.example.antlr_sql_project.Service;

import com.example.antlr_sql_project.SQLQueryLexer;
import com.example.antlr_sql_project.SQLQueryParser;
import com.example.antlr_sql_project.SQLVisitor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.Tuple;
import jakarta.persistence.TupleElement;
import lombok.RequiredArgsConstructor;
import org.antlr.v4.runtime.*;

import org.springframework.stereotype.Service;

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

        SQLVisitor visitor = new SQLVisitor();
        String sql = visitor.visit(tree);
        System.out.println(sql);

        Query query = entityManager.createNativeQuery(sql, Tuple.class);
        List<Tuple> tuples = query.getResultList();
        List<Map<String, Object>> formattedResults = new ArrayList<>();

        for (Tuple tuple : tuples) {
            Map<String, Object> rowMap = new LinkedHashMap<>();
            for (TupleElement<?> element : tuple.getElements()) {
                rowMap.put(element.getAlias(), tuple.get(element));
            }
            formattedResults.add(rowMap);
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
