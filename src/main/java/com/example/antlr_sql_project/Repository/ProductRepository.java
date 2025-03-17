package com.example.antlr_sql_project.Repository;

import com.example.antlr_sql_project.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
