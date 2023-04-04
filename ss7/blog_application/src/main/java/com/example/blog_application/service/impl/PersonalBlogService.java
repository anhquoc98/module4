package com.example.blog_application.service.impl;

import com.example.blog_application.model.PersonalBlog;
import com.example.blog_application.repository.IPersonalBlogRepository;
import com.example.blog_application.service.IPersonalBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalBlogService implements IPersonalBlogService {
    @Autowired
    private IPersonalBlogRepository personalBlogRepository;

    @Override
    public Page<PersonalBlog> list(String name, PageRequest pageRequest) {
        return personalBlogRepository.findAll(pageRequest);
    }

    @Override
    public void add(PersonalBlog personalBlog) {
        personalBlogRepository.save(personalBlog);
    }

    @Override
    public void update(PersonalBlog personalBlog) {
        PersonalBlog personalBlogs = seachById(personalBlog.getId());
        personalBlogs.setName(personalBlog.getName());
        personalBlogs.setContent(personalBlog.getContent());
        personalBlogs.setTitle(personalBlog.getTitle());
        personalBlogs.setDateTime(personalBlog.getDateTime());
        personalBlogs.setTypeBlog(personalBlog.getTypeBlog());
        personalBlogRepository.save(personalBlogs);
    }

    @Override
    public void delete(Integer id) {
        personalBlogRepository.deleteById(id);

    }

    @Override
    public PersonalBlog seachById(int id) {
        return personalBlogRepository.findById(id).get();
    }

    @Override
    public Page<PersonalBlog> seachByName(String name, PageRequest pageRequest) {
        return personalBlogRepository.findByNameContaining(name, pageRequest);

    }


}
