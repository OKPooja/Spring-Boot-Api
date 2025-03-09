package com.example.WebProject.services;

import com.example.WebProject.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> productList = new ArrayList<>(Arrays.asList(new Product(101, "Mobile", 10000), new Product(102, "Laptop", 50000)));

    public ProductService() {}

    public List<Product> getProductList() {
        return productList;
    }

    public Product getProductById(int prodId) {
        for (Product prod : productList) {
            if(prod.getProdId() == prodId) return prod;
        }
        return null;
    }

    public void addProduct(Product prod) {
        productList.add(prod);
    }

    public void updateProd(Product prod) {
        int index = 0;
        for(int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getProdId() == prod.getProdId()) index = i;
        }
        productList.set(index, prod);
    }

    public void deleteProd(int prodId) {
        int index = 0;
        for(int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getProdId() == prodId) index = i;
        }
        productList.remove(index);
    }
}
