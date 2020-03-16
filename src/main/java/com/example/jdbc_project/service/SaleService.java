package com.example.jdbc_project.service;

import com.example.jdbc_project.model.Sale;
import com.example.jdbc_project.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SaleService {

    @Autowired
    private SalesRepository salesRepository;

    public List<Sale> getAll(){
        return salesRepository.findAll();

    }

    public Sale get(long id){
        return salesRepository.findById(id).get();
    }

    public void save(Sale sale){
        salesRepository.save(sale);
    }

    public void delete(long id){
        salesRepository.deleteById(id);
    }

    public List<Sale> findByAmount(float amount){
        return salesRepository.findByAmount(amount);
    }
}
