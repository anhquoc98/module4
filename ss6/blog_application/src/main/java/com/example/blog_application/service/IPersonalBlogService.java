package com.example.blog_application.service;

import com.example.blog_application.model.PersonalBlog;

import java.util.List;

public interface IPersonalBlogService {
    List<PersonalBlog> list();
    void add(PersonalBlog personalBlog);
    void update(int id,PersonalBlog personalBlog);
    void delete(Integer id);
    PersonalBlog seachById(int id);
}
