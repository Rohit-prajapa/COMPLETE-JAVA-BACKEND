
package com.telusko.ecom_project.controller;

import com.telusko.ecom_project.model.product;
import com.telusko.ecom_project.service.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/api")
public class productController {

    @Autowired
    private productservice service;

    // Test API
    @GetMapping("/")
    public String greet() {
        return "Hello World";
    }

    // Get all products
    @GetMapping("/products")
    public List<product> getAllproduct() {
        return service.getAllproduct();
    }

    @GetMapping("/product/{id}")
    public product getproduct(@PathVariable int id){
        return service.getAllproductById(id);
    }

}
