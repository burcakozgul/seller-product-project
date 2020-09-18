package com.example.sellerproductproject.service;

import com.example.sellerproductproject.entity.Seller;
import com.example.sellerproductproject.model.CreateSellerRequest;
import com.example.sellerproductproject.repository.SellerRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class SellerService {

    @Autowired
    SellerRepository sellerRepository;


    public void createSeller(CreateSellerRequest request) {

        Seller seller=Seller.builder()
                .name(request.getName())
                .address(request.getAddress())
                .city(request.getCity())
                .phoneNumber(request.getPhoneNumber())
                .build();

        sellerRepository.save(seller);
    }


}

