package com.telusko.simpleWebApp.controller;

import com.telusko.simpleWebApp.Model.product;
import com.telusko.simpleWebApp.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProductController {

    @Autowired
    productService service;

    @GetMapping("/products")
    public List<product> getproduct(){
        return service.getproduct();
    }

    @GetMapping("/products/{Id}")
    public product getproductById( @PathVariable int Id){
        return service.getproductById(Id);
    }

    @PostMapping("/products")
    public void addproduct(@RequestBody product prod){
        System.out.println(prod);
        service.addproduct(prod);
    }

    @PutMapping("/products")
    public void updateproduct(@RequestBody product prod){
        System.out.println(prod);
        service.updateproduct(prod);
    }

    @DeleteMapping("/products/{id}")
    public void deleteproduct(@PathVariable int id){
        service.deleteproduct(id);
    }
}
