package com.example.sellerproductproject.controller;

import com.example.sellerproductproject.entity.Product;
import com.example.sellerproductproject.model.CreateProductRequest;
import com.example.sellerproductproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping()
    public ResponseEntity<Product> createProduct(CreateProductRequest createProductRequest){
        productService.createProduct(createProductRequest);
        return ResponseEntity.ok().build();
    }

}
