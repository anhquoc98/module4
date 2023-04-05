package com.example.form_register.service;

import com.example.form_register.dto.CustomerDtoAdd;
import com.example.form_register.model.CustomerModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface ICustomerService {
    List<CustomerModel> list();

    void add(CustomerDtoAdd customerModel);

}
