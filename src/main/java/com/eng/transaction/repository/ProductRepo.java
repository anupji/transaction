package com.eng.transaction.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepo {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void saveProduct(Product product){
        String sql = "INSERT INTO productnew VALUES (?, ?)";
        Object[] args = {product.getId(), product.getName()};
        jdbcTemplate.update(sql, args);
        System.out.println("Product saved: " + product.getName());
    }
}
