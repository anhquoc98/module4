package com.example.complete_the_shopping_cart.service;

import com.example.complete_the_shopping_cart.model.Cart;
import com.example.complete_the_shopping_cart.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {

    Iterable<Product> findAll();

    Optional<Product> findById(Long id);

}
