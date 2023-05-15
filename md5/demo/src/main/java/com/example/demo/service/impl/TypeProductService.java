package com.example.demo.service.impl;

import com.example.demo.model.TypeProduct;
import com.example.demo.repository.IProductTypeRepository;
import com.example.demo.service.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeProductService implements IProductTypeService {

    @Autowired
    private IProductTypeRepository productTypeRepository;
    @Override
    public List<TypeProduct> findByAll() {
        return (List<TypeProduct>) productTypeRepository.findAll();
    }
}
