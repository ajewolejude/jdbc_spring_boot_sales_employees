package com.example.jdbc_project.repository;

import com.example.jdbc_project.model.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SalesDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public SalesDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Sale> list(){

        String sql="SELECT * FROM SALES";
        List<Sale> saleList = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Sale.class));
        return saleList;
    }

    public void save(Sale sale) {
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("sales").usingColumns("item","quantity","amount");

        BeanPropertySqlParameterSource parameterSource = new BeanPropertySqlParameterSource(sale);
        insertActor.execute(parameterSource);

    }

    public Sale get(int id){
        String sql = "SELECT * FROM SALES WHERE id = ?";
        Object[] args = {id};
        Sale sale = jdbcTemplate.queryForObject(sql, args, BeanPropertyRowMapper.newInstance(Sale.class));

        return sale;
    }

    public void update(Sale sale){

        String sql = "UPDATE SALES set item=:item, amount=:amount, quantity=:quantity where id=:id ";
        BeanPropertySqlParameterSource parameterSource = new BeanPropertySqlParameterSource(sale);
        NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(jdbcTemplate);
        namedParameterJdbcTemplate.update(sql, parameterSource);

    }

    public void delete(int id){
        String sql = "DELETE FROM SALES WHERE ID = ?";
        jdbcTemplate.update(sql,id);

    }
}
