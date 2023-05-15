package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface IProductService {

    Page<Product> findByAll(String name, PageRequest pageRequest);

    void create(Product product);

    void delete(int id);
    void seachById(int id);

}
