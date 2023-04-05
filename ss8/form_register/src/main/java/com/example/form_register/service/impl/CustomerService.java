package com.example.form_register.service.impl;

import com.example.form_register.dto.CustomerDtoAdd;
import com.example.form_register.model.CustomerModel;
import com.example.form_register.repository.ICustomerRepository;
import com.example.form_register.service.ICustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    ICustomerRepository iCustomerRepository;

    @Override
    public List<CustomerModel> list() {
        return (List<CustomerModel>) iCustomerRepository.findAll();
    }

    @Override
    public void add(CustomerDtoAdd customerDtoAdd) {
        CustomerModel customerModel = new CustomerModel();
        BeanUtils.copyProperties(customerDtoAdd, customerModel);
        iCustomerRepository.save(customerModel);
    }

}
