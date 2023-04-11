package com.example.complete_the_shopping_cart.repository;

import com.example.complete_the_shopping_cart.model.Cart;
import com.example.complete_the_shopping_cart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface IProductRepository extends JpaRepository<Product,Long> {
    Optional<Product> findById(Long integer);
}
