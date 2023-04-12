package com.example.blog_application.controller;

import com.example.blog_application.model.CategoryBlog;
import com.example.blog_application.model.PersonalBlog;
import com.example.blog_application.service.ICategoryBlogService;
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

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("api/blog")
public class ManagerRestController {

    @Autowired
    private IPersonalBlogService personalBlogService;

    @Autowired
    private CategoryBlogService categoryBlogService;

    @GetMapping("")
    public Page<PersonalBlog> showlist(@RequestParam(defaultValue = "0") int page,
                                       @RequestParam(required = false, defaultValue = "") String name,Model model) {
        Sort sort = Sort.by("dateTime").descending();
        model.addAttribute("categoryBlog", categoryBlogService.list());
        return personalBlogService.seachByName(name, PageRequest.of(page, 3, sort));
    }

    @GetMapping("/category")
    public Page<CategoryBlog> showList(Model model, @RequestParam(defaultValue = "0") int page,
                                       @RequestParam(required = false, defaultValue = "") String name) {
        Sort sort = Sort.by("nameCategory").descending();
        return categoryBlogService.seachByName(name, PageRequest.of(page, 3, sort));
    }

    @GetMapping("/view-blog/{id}")
    public ResponseEntity<?> showViewBlog(@PathVariable int id) {

        return new ResponseEntity<>(personalBlogService.seachById(id), HttpStatus.OK);
    }

    @GetMapping("/view-category/{id}")
    public ResponseEntity<?> showViewCategory(@PathVariable int id) {
        return new ResponseEntity<>(categoryBlogService.seachById(id), HttpStatus.OK);
    }

}
