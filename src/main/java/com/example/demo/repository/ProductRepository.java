package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    // Spring Data JPA auto-implements these based on method names!
    Optional<Product> findByName(String name);
    List<Product> findByPriceGreaterThan(BigDecimal price);
    List<Product> findByStockLessThan(Integer stock);
}