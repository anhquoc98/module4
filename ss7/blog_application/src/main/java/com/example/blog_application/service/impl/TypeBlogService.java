package com.example.blog_application.service.impl;


import com.example.blog_application.model.TypeBlog;
import com.example.blog_application.repository.ITypeBlogRepository;
import com.example.blog_application.service.ITypeBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TypeBlogService implements ITypeBlogService {
    @Autowired
    private ITypeBlogRepository blogRepository;

    @Override
    public List<TypeBlog> list() {
        return (List<TypeBlog>) blogRepository.findAll();
    }
}
