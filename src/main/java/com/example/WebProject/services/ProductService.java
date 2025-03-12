package com.example.WebProject.services;

import com.example.WebProject.models.Product;
import com.example.WebProject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepo;

//    List<Product> productList = new ArrayList<>(Arrays.asList(new Product(101, "Mobile", 10000), new Product(102, "Laptop", 50000)));

    public ProductService() {}

    public List<Product> getProductList() {
        return productRepo.findAll();
    }

    public Product getProductById(int prodId) {
        return productRepo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod) {
        productRepo.save(prod);
    }

    public void updateProd(Product prod) {
        productRepo.save(prod);
    }

    public void deleteProd(int prodId) {
        productRepo.deleteById(prodId);
    }
}
