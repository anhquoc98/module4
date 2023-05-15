package com.example.thi_thuc_hanh.service.impl;

import com.example.thi_thuc_hanh.model.Product;
import com.example.thi_thuc_hanh.repository.IProductRepository;
import com.example.thi_thuc_hanh.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;
    @Override
    public List<Product> list() {
        return (List<Product>) productRepository.findAll();
    }
}
