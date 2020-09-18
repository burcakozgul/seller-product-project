package com.example.sellerproductproject.controller;

import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.example.sellerproductproject.entity.Product;
import com.example.sellerproductproject.service.RelationService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@EnableWebMvc
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = RelationController.class) // tell Spring to load the application context
@AutoConfigureMockMvc
public class RelationControllerTest {

    @MockBean
    private RelationService relationService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getProductsBySellerIdTest() throws Exception {
        List<Optional<Product>> productList = new ArrayList<>();
        productList.add(Optional.of(new Product("1", "product", 123)));
        when(relationService.getProductsBySellerId("1")).thenReturn(productList);

        mockMvc.perform(get("/relation/id").param("id","1"))
                .andExpect(status().isOk());
    }
}
