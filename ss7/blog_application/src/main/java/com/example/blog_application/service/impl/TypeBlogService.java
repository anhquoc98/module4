package com.example.blog_application.service.impl;


import com.example.blog_application.model.TypeBlog;
import com.example.blog_application.repository.ITypeBlogRepository;
import com.example.blog_application.service.ITypeBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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

    @Override
    public Page<TypeBlog> list(String name, PageRequest pageRequest) {
        return null;
    }

    @Override
    public void add(TypeBlog typeBlog) {
        blogRepository.save(typeBlog);
    }

    @Override
    public void update(TypeBlog typeBlog) {

    }

    @Override
    public void delete(Integer id) {
        blogRepository.deleteById(id);
    }

    public TypeBlog seachById(Integer id) {
       return blogRepository.findById(id).get();
    }

    @Override
    public Page<TypeBlog> seachByName(String name, PageRequest pageRequest) {
        return blogRepository.findByTypeContaining(name,pageRequest);
    }
}
