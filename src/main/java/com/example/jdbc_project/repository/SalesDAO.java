package com.example.jdbc_project.repository;

import com.example.jdbc_project.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface SalesDAO extends JpaRepository<Sale, Long> {

}
