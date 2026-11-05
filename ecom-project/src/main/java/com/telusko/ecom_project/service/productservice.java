
package com.telusko.ecom_project.service;

import com.telusko.ecom_project.model.product;
import com.telusko.ecom_project.repo.productRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productservice {

    @Autowired
    private productRepo repo;

    // Get all products
    public List<product> getAllproduct() {
        return repo.findAll();
    }

    // Get product by ID
    public product getAllproductById(int id) {
        return repo.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Product not found with ID: " + id));
    }

    // Add new product
    public product addProduct(product product) {
        return repo.save(product);
    }

    // Update product
    public product updateProduct(product product) {
        return repo.save(product);
    }

    // Delete product
    public void deleteProduct(int id) {
        repo.deleteById(id);
    }
}
