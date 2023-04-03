package com.example.blog_application.controller;

import com.example.blog_application.model.PersonalBlog;
import com.example.blog_application.service.IPersonalBlogService;

import com.example.blog_application.service.impl.TypeBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/blog")
public class BlogManagerController {
    @Autowired
    private IPersonalBlogService personalBlogService;

    @Autowired
    private TypeBlogService typeBlogService;

    @GetMapping("")
    public String showList(Model model) {
        model.addAttribute("blog", personalBlogService.list());
        return "list";
    }

    @GetMapping("/create")
    public String createShow(Model model) {
        model.addAttribute("personalBlog", new PersonalBlog());
        model.addAttribute("typeBlog", typeBlogService.list());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute PersonalBlog personalBlog,
                         BindingResult bindingResult,
                         RedirectAttributes redirect) {
        personalBlogService.add(personalBlog);
        redirect.addAttribute("msg", "thêm mới thành công");
        return "redirect:/blog";
    }

    @GetMapping("delete/")
    public String delete(@RequestParam(required = false) Integer deleteId) {
        personalBlogService.delete(deleteId);
        return  "redirect:/blog";
    }

}
