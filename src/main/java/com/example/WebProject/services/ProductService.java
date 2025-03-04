package com.example.WebProject.services;

import com.example.WebProject.models.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> productList = Arrays.asList(new Product(101, "Mobile", 10000), new Product(102, "Laptop", 50000));

    public ProductService() {
    }

    public List<Product> getProductList() {
        return productList;
    }
}
