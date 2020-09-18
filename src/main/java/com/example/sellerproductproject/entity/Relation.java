package com.example.sellerproductproject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "relation")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Relation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Id;

    @Column(name = "seller_id")
    private String sellerId;

    @Column(name = "product_id")
    private String productId;
}
