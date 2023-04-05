package com.example.demo.service.impl;

import com.example.demo.model.CustomerModel;
import com.example.demo.repository.ICustomerRepository;
import com.example.demo.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    ICustomerRepository iCustomerRepository;

    @Override
    public Page<CustomerModel> list(PageRequest pageRequest) {
        return iCustomerRepository.findAll(pageRequest);
    }

    @Override
    public void add(CustomerModel customerModel) {
        iCustomerRepository.save(customerModel);
    }
}
