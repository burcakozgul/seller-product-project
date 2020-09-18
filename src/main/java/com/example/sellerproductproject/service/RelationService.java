package com.example.sellerproductproject.service;

import com.example.sellerproductproject.entity.Product;
import com.example.sellerproductproject.entity.Relation;
import com.example.sellerproductproject.exception.GeneralException;
import com.example.sellerproductproject.model.CreateRelationRequest;
import com.example.sellerproductproject.repository.ProductRepository;
import com.example.sellerproductproject.repository.RelationRepository;
import com.example.sellerproductproject.repository.SellerRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class RelationService {

    @Autowired
    private RelationRepository relationRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private SellerRepository sellerRepository;

    public void createRelation(CreateRelationRequest request) throws GeneralException {
        sellerRepository.findById(request.getSellerId()).orElseThrow(()->new GeneralException("Seller Id is not exist"));
        productRepository.findById(request.getProductId()).orElseThrow(()->new GeneralException("Product Id is not exist"));
        Relation relation= Relation.builder()
                    .productId(request.getProductId())
                    .sellerId(request.getSellerId())
                    .build();
            relationRepository.save(relation);
    }

    public List<Optional<Product>> getProductsBySellerId(String sellerId) throws GeneralException {
        List<Optional<Product>> productList=new ArrayList<>();
        List<String> products = relationRepository.findProductIdBySellerId(sellerId)
                .orElseThrow(()->new GeneralException("Seller Id is not exist"));
        for (String product:products){
            productList.add(productRepository.findById(product));
        }
        return productList;
    }
}


