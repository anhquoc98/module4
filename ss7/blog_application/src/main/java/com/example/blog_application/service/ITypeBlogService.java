package com.example.blog_application.service;


import com.example.blog_application.model.PersonalBlog;
import com.example.blog_application.model.TypeBlog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface ITypeBlogService {
    List<TypeBlog> list();
    Page<TypeBlog> list(String name, PageRequest pageRequest);

    void add(TypeBlog typeBlog);

    void update(TypeBlog typeBlog);

    void delete(Integer id);

    TypeBlog seachById(Integer id);

    Page<TypeBlog> seachByName(String name, PageRequest pageRequest);
}
