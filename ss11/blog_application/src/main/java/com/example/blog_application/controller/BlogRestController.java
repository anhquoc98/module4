package com.example.blog_application.controller;

import com.example.blog_application.model.PersonalBlog;
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
@RequestMapping("api/blog")
@CrossOrigin("*")
public class BlogRestController {
    @Autowired
    private IPersonalBlogService personalBlogService;

    @Autowired
    private CategoryBlogService categoryBlogService;

    @GetMapping("")
    public Page<PersonalBlog> showlist(@RequestParam(defaultValue = "0") int page,
                                       @RequestParam(required = false, defaultValue = "") String name, Model model) {
        Sort sort = Sort.by("dateTime").descending();
        model.addAttribute("categoryBlog", categoryBlogService.list());
        return personalBlogService.seachByName(name, PageRequest.of(page, 3, sort));
    }
    @GetMapping("/view-blog/{id}")
    public ResponseEntity<?> showViewBlog(@PathVariable int id) {
        return new ResponseEntity<>(personalBlogService.seachById(id), HttpStatus.OK);
    }

}
