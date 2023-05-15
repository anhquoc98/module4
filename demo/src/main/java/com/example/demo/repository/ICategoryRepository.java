package com.example.demo.repository;

import com.example.demo.model.Category;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICategoryRepository extends PagingAndSortingRepository<Category,Integer> {
}
