package com.example.form_register.repository;

import com.example.form_register.model.CustomerModel;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<CustomerModel, Integer> {
}
