package com.example.demo.repository;

import com.example.demo.model.BlogPost;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IBlogPost extends PagingAndSortingRepository<BlogPost,Integer> {
    Page<BlogPost> findByNameBlogContaining(String name, Pageable pageable);


}
