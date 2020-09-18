package com.example.sellerproductproject.controller;

import com.example.sellerproductproject.entity.Product;
import com.example.sellerproductproject.entity.Relation;
import com.example.sellerproductproject.exception.GeneralException;
import com.example.sellerproductproject.model.CreateRelationRequest;
import com.example.sellerproductproject.service.RelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/relation")
public class RelationController {

    @Autowired
    private RelationService relationService;

    @PostMapping()
    public ResponseEntity<Relation> createRelation(CreateRelationRequest createRelationRequest) throws GeneralException {
        relationService.createRelation(createRelationRequest);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/id")
    public List<Optional<Product>> getProductsBySellerId(@RequestParam(value = "id") String sellerId) throws GeneralException {
        return relationService.getProductsBySellerId(sellerId);
    }
}
