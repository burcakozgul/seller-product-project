package com.example.sellerproductproject.service;

import com.example.sellerproductproject.entity.Product;
import com.example.sellerproductproject.exception.GeneralException;
import com.example.sellerproductproject.repository.ProductRepository;
import com.example.sellerproductproject.repository.RelationRepository;
import com.example.sellerproductproject.repository.SellerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = RelationService.class)
public class RelationServiceTest {

    @Autowired
    private RelationService relationService;

    @MockBean
    private RelationRepository relationRepository;

    @MockBean
    private ProductRepository productRepository;

    @MockBean
    private SellerRepository sellerRepository;

    @Test
    public void getProductsBySellerIdTest() throws GeneralException {
        String productId = "123";
        Product product = new Product("123", "name", 23);
        List<String> productList = new ArrayList<>();
        productList.add(productId);
        when(relationRepository.findProductIdBySellerId("1")).thenReturn(Optional.of(productList));

        when(productRepository.findById("123")).thenReturn(Optional.of(product));
        Assertions.assertEquals(relationService.getProductsBySellerId("1").get(0).get().getName(), product.getName());
    }

}
