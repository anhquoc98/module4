package com.example.blog_application.repository;

import com.example.blog_application.model.TypeBlog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITypeBlogRepository extends PagingAndSortingRepository<TypeBlog, Integer> {
    Page<TypeBlog> findByTypeContaining(String type, Pageable pageable);
}
