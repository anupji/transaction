package com.eng.transaction.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {
    @Autowired
    ProductRepo productRepo;

    public void saveProduct() {
        for (int i = 1; i <= 10; i++) {
            Product product = new Product();
            product.setId(i);
            product.setName("Test Product " + i);
            productRepo.saveProduct(product);
        }
    }
}
