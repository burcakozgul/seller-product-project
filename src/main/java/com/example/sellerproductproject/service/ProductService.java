package com.example.sellerproductproject.service;

import com.example.sellerproductproject.entity.Product;
import com.example.sellerproductproject.model.CreateProductRequest;
import com.example.sellerproductproject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void createProduct(CreateProductRequest request){
        Product product=Product.builder()
                .name(request.getName())
                .price(request.getPrice())
                .build();
        productRepository.save(product);
    }
}
