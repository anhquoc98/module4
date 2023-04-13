package com.example.blog_application.controller;

import com.example.blog_application.model.CategoryBlog;
import com.example.blog_application.service.IPersonalBlogService;
import com.example.blog_application.service.impl.CategoryBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/category")
@CrossOrigin("*")
public class CategoryRestController {
    @Autowired
    private IPersonalBlogService personalBlogService;

    @Autowired
    private CategoryBlogService categoryBlogService;

    @GetMapping("")
    public Page<CategoryBlog> showList(Model model, @RequestParam(defaultValue = "0") int page,
                                       @RequestParam(required = false, defaultValue = "") String name) {
        Sort sort = Sort.by("nameCategory").descending();
        model.addAttribute("blog", personalBlogService.seachByName(name, PageRequest.of(page, 3, sort)));
        return categoryBlogService.seachByName(name, PageRequest.of(page, 3, sort));
    }


    @GetMapping("/view-category/{id}")
    public ResponseEntity<?> showViewCategory(@PathVariable int id) {
        return new ResponseEntity<>(categoryBlogService.seachById(id), HttpStatus.OK);
    }

}
