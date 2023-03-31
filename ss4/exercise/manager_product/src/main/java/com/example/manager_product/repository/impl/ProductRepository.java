package com.example.manager_product.repository.impl;

import com.example.manager_product.model.Product;
import com.example.manager_product.repository.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {

    static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Iphone7", "50", "blue", "Apple"));
        productList.add(new Product(2, "Iphone8", "70", "white", "Apple"));
        productList.add(new Product(3, "Iphone10", "90", "rose", "Apple"));
        productList.add(new Product(4, "Iphone11", "110", "black", "Apple"));
        productList.add(new Product(5, "Iphone12", "150", "green", "Apple"));
    }

    @Override
    public List<Product> list(String name) {
        if (name == null) {
            return productList;
        }
        List<Product> products = new ArrayList<>();
        for (Product product : productList) {
            if (product.getNameProduct().contains(name)) {
                products.add(product);
            }
        }
        return products;
    }

    @Override
    public Object add(Product product) {
        return productList.add(product);
    }

    @Override
    public Product seachById(int id) {
        return productList.get(id - 1);
    }

    @Override
    public Product seachByName(String name) {
        return null;
    }

    @Override
    public void update(int id, Product product) {
        productList.set(id, product);
    }

    @Override
    public void remove(int id) {
        productList.remove(id);
    }
}
