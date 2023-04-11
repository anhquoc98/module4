package com.example.complete_the_shopping_cart.service.impl;

import com.example.complete_the_shopping_cart.model.Cart;
import com.example.complete_the_shopping_cart.model.Product;
import com.example.complete_the_shopping_cart.repository.IProductRepository;
import com.example.complete_the_shopping_cart.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public List<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return iProductRepository.findById(id);
    }
}
