package com.example.blog_application.service.impl;


import com.example.blog_application.model.CategoryBlog;
import com.example.blog_application.repository.ICategoryBlogRepository;
import com.example.blog_application.service.ICategoryBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoryBlogService implements ICategoryBlogService {
    @Autowired
    private ICategoryBlogRepository categoryBlogRepository;

    @Override
    public List<CategoryBlog> list() {
        return (List<CategoryBlog>) categoryBlogRepository.findAll();
    }

    @Override
    public Page<CategoryBlog> list(String name, PageRequest pageRequest) {
        return null;
    }

    @Override
    public void add(CategoryBlog categoryBlog) {
        categoryBlogRepository.save(categoryBlog);
    }


    @Override
    public void delete(Integer id) {
        categoryBlogRepository.deleteById(id);
    }

    public CategoryBlog seachById(Integer id) {
        return categoryBlogRepository.findById(id).get();
    }

    @Override
    public Page<CategoryBlog> seachByName(String name, PageRequest pageRequest) {
        return categoryBlogRepository.findByNameCategoryContaining(name, pageRequest);
    }
}
