package com.example.blog_application.repository;

import com.example.blog_application.model.TypeBlog;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITypeBlogRepository extends PagingAndSortingRepository<TypeBlog,Integer> {
}
