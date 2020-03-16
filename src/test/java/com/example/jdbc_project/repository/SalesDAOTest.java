package com.example.jdbc_project.repository;

import com.example.jdbc_project.model.Sale;
import com.example.jdbc_project.service.SalesService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesDAOTest {

    private SalesService salesService;

//
//    @BeforeEach
//    void setUp() throws Exception{
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setUrl("jdbc:mysql://localhost:3306/newdatabase?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
//        dataSource.setUsername("root");
//        dataSource.setPassword("Adedamola1.");
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//
//        salesService = new SalesService();
//
//    }
//
//    @Test
//    void testList() {
//        List<Sale> saleList = salesService.list();
//        assertFalse(saleList.isEmpty());
//    }
//
//    @Test
//    void save() {
//        Sale sale = new Sale("Gun", 50, 198.55f);
//        salesDAO.save(sale);
//    }
//
//    @Test
//    void get() {
//        int id = 1;
//        Sale sale = salesDAO.get(id);
//        assertNotNull(sale);
//    }
//
//    @Test
//    void update() {
//        Sale sale = new Sale();
//        sale.setId(1);
//        sale.setItem("Foods");
//        sale.setAmount(20f);
//        sale.setQuantity(14);
//        salesDAO.update(sale);
//    }
//
//    @Test
//    void delete() {
//        int id = 3;
//        salesDAO.delete(3);
//    }
}