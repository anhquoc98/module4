package com.example.blog_application.service;

import com.example.blog_application.model.PersonalBlog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface IPersonalBlogService {
    Page<PersonalBlog> list(String name, PageRequest pageRequest);

    void add(PersonalBlog personalBlog);

    void update(PersonalBlog personalBlog);

    void delete(Integer id);

    PersonalBlog seachById(int id);

    Page<PersonalBlog> seachByName(String name, PageRequest pageRequest);
}
