package com.example.demo.controller;

import com.example.demo.model.BlogPost;
import com.example.demo.service.IBlogPostService;
import com.example.demo.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/blog")
public class BlogPostController {
    @Autowired
    private IBlogPostService blogPostService;
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("")
    public String list(Model model, @RequestParam(defaultValue = "0") Integer page,
                       @RequestParam(required = false,defaultValue = "")String name){
        Sort sort=Sort.by("title").descending();
        model.addAttribute("blog",blogPostService.findByAll(name, PageRequest.of(page,3,sort)));
        return "list";
    }

    @GetMapping("/create")
    public String add(Model model){
        model.addAttribute("blog",new BlogPost());
        model.addAttribute("category",categoryService.findByAll());
        return "create";
    }
    @PostMapping("/create")
    public String addBlog(@ModelAttribute BlogPost blog, RedirectAttributes redirectAttributes, BindingResult bindingResult,
                          Model model){
        blogPostService.save(blog);
        redirectAttributes.addFlashAttribute("msg","thêm mới thành công");
        return "redirect:/blog";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam(required = false) Integer id){
        blogPostService.delete(id);
        return "redirect:/blog";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable Integer id,Model model){
        model.addAttribute("blog",blogPostService.findById(id));
        model.addAttribute("category",categoryService.findByAll());
        return "update";
    }
    @PostMapping("/update")
    public String up(@ModelAttribute BlogPost blog, RedirectAttributes redirectAttributes, BindingResult bindingResult,
                          Model model){
        blogPostService.save(blog);
        redirectAttributes.addFlashAttribute("msg","thêm mới ");
        return "redirect:/blog";
    }
}
