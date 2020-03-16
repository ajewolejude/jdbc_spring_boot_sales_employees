package com.example.jdbc_project.repository;

import com.example.jdbc_project.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}