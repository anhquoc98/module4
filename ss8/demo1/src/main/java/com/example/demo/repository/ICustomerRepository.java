package com.example.demo.repository;

import com.example.demo.model.CustomerModel;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<CustomerModel,Integer> {
}
