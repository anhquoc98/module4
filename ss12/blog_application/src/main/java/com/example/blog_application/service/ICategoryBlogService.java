package com.example.blog_application.service;


import com.example.blog_application.model.CategoryBlog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface ICategoryBlogService {
    List<CategoryBlog> list();

    Page<CategoryBlog> list(String name, PageRequest pageRequest);

    void add(CategoryBlog categoryBlog);

    void delete(Integer id);

    CategoryBlog seachById(int id);

    Page<CategoryBlog> seachByName(String name, PageRequest pageRequest);
}
