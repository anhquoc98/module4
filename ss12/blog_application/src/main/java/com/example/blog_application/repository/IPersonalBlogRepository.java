package com.example.blog_application.repository;

import com.example.blog_application.model.PersonalBlog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonalBlogRepository extends PagingAndSortingRepository<PersonalBlog, Integer> {
    Page<PersonalBlog> findByNameContaining(String name, Pageable pageRequest);
}
