package com.example.demo.service.impl;

import com.example.demo.model.BlogPost;
import com.example.demo.repository.IBlogPost;
import com.example.demo.repository.ICategoryRepository;
import com.example.demo.service.IBlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BlogPostRepository implements IBlogPostService {
    @Autowired
    private IBlogPost iCategoryRepository;

    @Override
    public Page<BlogPost> findByAll(String name, Pageable pageable) {
        return iCategoryRepository.findByNameBlogContaining(name, pageable);
    }

    @Override
    public BlogPost findById(Integer id) {
        return iCategoryRepository.findById(id).get();
    }

    @Override
    public void delete(Integer id) {
        iCategoryRepository.deleteById(id);
    }

    @Override
    public void save(BlogPost blogPost) {
        iCategoryRepository.save(blogPost);
    }
}
