package com.example.blog_application.service.impl;

import com.example.blog_application.model.PersonalBlog;
import com.example.blog_application.repository.IPersonalBlogRepository;
import com.example.blog_application.service.IPersonalBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalBlogService implements IPersonalBlogService {
    @Autowired
    private IPersonalBlogRepository personalBlogRepository;

    @Override
    public List<PersonalBlog> list() {
        return (List<PersonalBlog>) personalBlogRepository.findAll();
    }

    @Override
    public void add(PersonalBlog personalBlog) {
        personalBlogRepository.save(personalBlog);
    }

    @Override
    public void update(int id, PersonalBlog personalBlog) {

    }

    @Override
    public void delete(Integer id) {
        personalBlogRepository.deleteById(id);

    }

    @Override
    public PersonalBlog seachById(int id) {
        return personalBlogRepository.findById(id).get();
    }
}
