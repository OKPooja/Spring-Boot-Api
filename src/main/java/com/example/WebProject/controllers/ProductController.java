package com.example.WebProject.controllers;

import com.example.WebProject.models.Product;
import com.example.WebProject.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProductList();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId) {
        return service.getProductById(prodId);
    }

    @PostMapping("/add_product")
    public void addProduct(@RequestBody Product prod) {
        service.addProduct(prod);
    }

    @PutMapping("/update_prod")
    public void updateProd(@RequestBody Product prod) {
        service.updateProd(prod);
    }

    @DeleteMapping("/delete_prod/{prodId}")
    public void deleteProd(@PathVariable int prodId) {
        service.deleteProd(prodId);
    }
}
