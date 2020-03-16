package com.example.jdbc_project.service;

import com.example.jdbc_project.model.Sale;
import com.example.jdbc_project.repository.SalesDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class SalesService {

    private SalesDAO salesDAO;

    public SalesService(SalesDAO salesDAO) {
        this.salesDAO = salesDAO;
    }

    public List<Sale> list(){
         return salesDAO.findAll();
    }

    public void save(Sale sale) {

        salesDAO.save(sale);

    }

    public Optional<Sale> get(long id){

        return salesDAO.findById(id);
    }

    public void update(Sale sale){

    }

    public void delete(Long id){

        salesDAO.deleteById(id);

    }

}
