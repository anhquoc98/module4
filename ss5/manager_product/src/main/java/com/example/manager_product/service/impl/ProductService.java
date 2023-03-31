package com.example.manager_product.service.impl;

import com.example.manager_product.model.Product;
import com.example.manager_product.repository.impl.ProductRepository;
import com.example.manager_product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> list() {
        return productRepository.list();
    }

    @Override
    public void add(Product product) {
        productRepository.add(product);
    }

    @Override
    public Product seachById(int id) {
        return productRepository.seachById(id);
    }

    @Override
    public List<Product> seachByName(String name) {
        return productRepository.seachByName(name);
    }

    @Override
    public void update(int id, Product product) {
        productRepository.update(id, product);

    }

    @Override
    public void remove(int id) {
        productRepository.remove(id);
    }

}
