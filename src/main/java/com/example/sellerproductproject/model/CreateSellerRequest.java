package com.example.sellerproductproject.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateSellerRequest {
    private String name;
    private String city;
    private String address;
    private String phoneNumber;
}
