package com.telusko.simpleWebApp.service;

import com.telusko.simpleWebApp.Model.product;
import com.telusko.simpleWebApp.Repository.productRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class productService {
    @Autowired
    productRepo repo;
//    List<product> products = new ArrayList<>(
//            Arrays.asList(
//                    new product(101, "Iphone", 89000),
//                    new product(102, "Samsung", 40000)
//            )
//    );

    // Get all products
    public List<product> getproduct() {
        return repo.findAll();
    }

    // Get product by ID
    public product getproductById(int id) {
      return repo.findById(id).orElse(new product());
    }

    // Add product
    public void addproduct(product prod) {
       repo.save(prod);
    }

    // Update product
    public void updateproduct(product prod) {
      repo.save(prod);
    }

    public void deleteproduct(int id) {
      repo.deleteAllById(Collections.singleton(id));
    }
}
