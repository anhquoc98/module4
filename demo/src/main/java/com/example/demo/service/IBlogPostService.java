package com.example.demo.service;

import com.example.demo.model.BlogPost;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBlogPostService {
    Page<BlogPost> findByAll(String name, Pageable pageable);

    BlogPost findById(Integer id);

    void delete(Integer id);

    void save(BlogPost blogPost);


}
