package com.example.manager_product.service.impl;

import com.example.manager_product.model.Product;
import com.example.manager_product.repository.impl.ProductRepository;
import com.example.manager_product.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    private ProductRepository productRepository = new ProductRepository();

    @Override
    public List<Product> list(String name) {
        return productRepository.list(name);
    }

    @Override
    public Object add(Product product) {
        return productRepository.add(product);
    }

    @Override
    public Product seachById(int id) {
        return productRepository.seachById(id);
    }

    @Override
    public Product seachByName(String name) {
        return null;
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
