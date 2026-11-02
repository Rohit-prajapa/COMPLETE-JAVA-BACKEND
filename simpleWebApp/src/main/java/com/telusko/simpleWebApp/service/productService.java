package com.telusko.simpleWebApp.service;

import com.telusko.simpleWebApp.Model.product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class productService {

    List<product> products = new ArrayList<>(
            Arrays.asList(
                    new product(101, "Iphone", 89000),
                    new product(102, "Samsung", 40000)
            )
    );

    // Get all products
    public List<product> getproduct() {
        return products;
    }

    // Get product by ID
    public product getproductById(int id) {
        return products.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // Add product
    public void addproduct(product prod) {
        products.add(prod);
    }

    // Update product
    public void updateproduct(product prod) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == prod.getId()) {
                products.set(i, prod);
                return;
            }
        }
    }

    public void deleteproduct(int id) {
        products.removeIf(p -> p.getId() == id);
    }
}
