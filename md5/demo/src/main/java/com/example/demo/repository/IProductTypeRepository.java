package com.example.demo.repository;

import com.example.demo.model.TypeProduct;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductTypeRepository extends PagingAndSortingRepository<TypeProduct,Integer> {
}
