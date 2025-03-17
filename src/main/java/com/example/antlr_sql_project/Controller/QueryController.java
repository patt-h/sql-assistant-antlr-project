package com.example.antlr_sql_project.Controller;

import com.example.antlr_sql_project.Service.QueryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/query")
public class QueryController {
    private final QueryService queryService;

    public QueryController(QueryService queryService) {
        this.queryService = queryService;
    }

    @PostMapping
    public ResponseEntity<List<Map<String, Object>>> parseQuery(@RequestBody String userQuery) {
        try {
            List<Map<String, Object>> results = queryService.processQuery(userQuery);
            return ResponseEntity.ok(results);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(List.of(Map.of("error", "Błąd zapytania: " + e.getMessage())));
        }
    }
}
