package com.example.demo.service;

import com.example.demo.model.CustomerModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface ICustomerService {
    Page<CustomerModel> list(PageRequest pageRequest);
    void add(CustomerModel customerModel);
}
