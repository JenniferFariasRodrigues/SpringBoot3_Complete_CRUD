package com.example.springboot.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.dtos.ProductRecordDto;
import com.example.springboot.models.ProductModel;
import com.example.springboot.repositories.ProductRepository;

import jakarta.validation.Valid;
@RestController
// @RequestMapping(value = "/products")
public class ProductController {
    
    @Autowired
    // private ProductRepository repository;
    ProductRepository productRepository;

    @PostMapping("/products")
	public ResponseEntity<ProductModel> saveProduct(@RequestBody @Valid ProductRecordDto productRecordDto) {
		var productModel = new ProductModel();
		BeanUtils.copyProperties(productRecordDto, productModel);
		return ResponseEntity.status(HttpStatus.CREATED).body(productRepository.save(productModel));
	}


    
    
    // @GetMapping(value = "/{id}")
    // public ResponseEntity<ProductModel> consultaPorId(@PathVariable Long id){
        // public ResponseEntity<ProductModel> consultaPorId(@PathVariable UUID id){
        // return ResponseEntity.ok(repository.findById(id).get());
        // public ResponseEntity<ProductModel> consultaPorId(@PathVariable UUID id){
        // return ResponseEntity.ok(productRepository.findById(id).get());
    }
