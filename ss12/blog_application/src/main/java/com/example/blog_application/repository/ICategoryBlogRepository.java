package com.example.blog_application.repository;

import com.example.blog_application.model.CategoryBlog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryBlogRepository extends PagingAndSortingRepository<CategoryBlog, Integer> {
    Page<CategoryBlog> findByNameCategoryContaining(String nameCategory, Pageable pageable);
}
