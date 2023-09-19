package com.example.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.models.ProductModel;
import com.example.springboot.repositories.ProductRepository;

@RestController
@RequestMapping(value = "/usuarios")
public class ProductController {
    
    @Autowired
    private ProductRepository repository;
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<ProductModel> consultaPorId(@PathVariable Long id){
        return ResponseEntity.ok(repository.findById(id).get());
    }
}