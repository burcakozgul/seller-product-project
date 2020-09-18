package com.example.sellerproductproject.repository;

import com.example.sellerproductproject.entity.Relation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RelationRepository extends JpaRepository<Relation, String> {

    @Query(value="SELECT productId from Relation where sellerId=:id")
    Optional<List<String>> findProductIdBySellerId(@Param("id") String id);

}
