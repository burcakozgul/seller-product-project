package com.example.sellerproductproject.controller;

import com.example.sellerproductproject.entity.Seller;
import com.example.sellerproductproject.model.CreateSellerRequest;
import com.example.sellerproductproject.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seller")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @PostMapping()
    public ResponseEntity<Seller> createSeller(CreateSellerRequest createSellerRequest){
        sellerService.createSeller(createSellerRequest);
        return ResponseEntity.ok().build();
    }

}
