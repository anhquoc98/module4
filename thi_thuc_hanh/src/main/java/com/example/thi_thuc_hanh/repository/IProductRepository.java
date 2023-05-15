package com.example.thi_thuc_hanh.repository;

import com.example.thi_thuc_hanh.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends PagingAndSortingRepository<Product,Integer> {
}
