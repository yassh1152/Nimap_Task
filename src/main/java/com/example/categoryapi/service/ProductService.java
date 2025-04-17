package com.example.categoryapi.service;

import com.example.categoryapi.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Product saveProduct(Product product);
    Page<Product> getAllProducts(Pageable pageable);
}
