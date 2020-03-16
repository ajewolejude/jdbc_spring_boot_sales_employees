package com.example.jdbc_project.repository;

import com.example.jdbc_project.model.Sale;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesDAOTest {

    private SalesRepository salesRepository;

//    @BeforeEach
//    void setUp() throws Exception{
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setUrl("jdbc:mysql://localhost:3306/newdatabase?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
//        dataSource.setUsername("root");
//        dataSource.setPassword("Adedamola1.");
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//
//        salesRepository = new SalesRepository(new JdbcTemplate(dataSource));
//
//    }
//
//    @Test
//    void testList() {
//        List<Sale> saleList = salesRepository.list();
//        assertFalse(saleList.isEmpty());
//    }
//
//    @Test
//    void save() {
//        Sale sale = new Sale("Gun", 50, 198.55f);
//        salesRepository.save(sale);
//    }
//
//    @Test
//    void get() {
//        int id = 1;
//        Sale sale = salesRepository.get(id);
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
//        salesRepository.update(sale);
//    }
//
//    @Test
//    void delete() {
//        int id = 3;
//        salesRepository.delete(3);
//    }
}