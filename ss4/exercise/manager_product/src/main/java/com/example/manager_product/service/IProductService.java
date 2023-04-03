package com.example.manager_product.service;

import com.example.manager_product.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> list(String name);

    Object add(Product product);

    Product seachById(int id);

    Product seachByName(String name);

    void update(int id, Product product);

    void remove(int id);
}
