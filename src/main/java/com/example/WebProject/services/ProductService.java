package com.example.WebProject.services;

import com.example.WebProject.models.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> productList = Arrays.asList(new Product(101, "Mobile", 10000), new Product(102, "Laptop", 50000));

    public ProductService() {}

    public List<Product> getProductList() {
        return productList;
    }

    public Product getProductById(int prodId) {
        for (Product prod : productList) {
            if(prod.getProdId() == prodId) {
                System.out.print("Product id is here: ");
                System.out.println(prod.getProdId());
                return prod;
            }
        }
        return null;
    }
}
