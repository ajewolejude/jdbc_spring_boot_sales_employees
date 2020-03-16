//package com.example.jdbc_project.repository;
//
//import com.example.jdbc_project.model.Sale;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.annotation.Rollback;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import javax.transaction.Transactional;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@ContextConfiguration(locations = "classpath:application-context-test.xml")
//@RunWith(SpringJUnit4ClassRunner.class)
//class SalesRepositoryTest {
//
////    @Autowired
////    private SalesRepository salesRepository;
////
////    public SalesRepositoryTest(SalesRepository salesRepository) {
////        this.salesRepository = salesRepository;
////    }
////
////    @Test
////    public void testAddSale()
////    {
////
////        Sale sale = new Sale("Goodd",1,1f);
////        salesRepository.save(sale);
////
////        List<Sale> sales = salesRepository.findAll();
////
////        assertNotNull(sales);
////    }
//
//}