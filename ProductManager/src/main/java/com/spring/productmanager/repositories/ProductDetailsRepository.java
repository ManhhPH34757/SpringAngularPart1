package com.spring.productmanager.repositories;

import com.spring.productmanager.entities.Product;
import com.spring.productmanager.entities.ProductDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDetailsRepository extends JpaRepository<ProductDetails, Long> {
    List<ProductDetails> findProductDetailsByIdProduct(Product idProduct);
}