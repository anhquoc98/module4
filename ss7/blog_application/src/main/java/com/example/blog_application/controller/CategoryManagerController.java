package com.example.blog_application.controller;


import com.example.blog_application.model.CategoryBlog;
import com.example.blog_application.service.ICategoryBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/category")

public class CategoryManagerController {
    @Autowired
    private ICategoryBlogService iCategoryBlogService;

    @GetMapping("")
    public String showList(Model model, @RequestParam(defaultValue = "0") int page,
                           @RequestParam(required = false, defaultValue = "") String name) {
        Sort sort = Sort.by("nameCategory").descending();
        model.addAttribute("category", iCategoryBlogService.seachByName(name, PageRequest.of(page, 3, sort)));
        return "/categoryViews/listCategory";
    }

    @GetMapping("/update/{id}")
    public String showUpdateType(@PathVariable int id, Model model) {
        model.addAttribute("category", iCategoryBlogService.seachById(id));
        return "/categoryViews/updateCategory";
    }


    @GetMapping("/create-category")
    public String createShow(Model model) {
        model.addAttribute("category", new CategoryBlog());
        return "/categoryViews/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute CategoryBlog categoryBlog,
                         BindingResult bindingResult,
                         RedirectAttributes redirect) {
        iCategoryBlogService.add(categoryBlog);
        redirect.addAttribute("msg", "thêm mới thành công");
        return "redirect:/category";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam(required = false) Integer deleteId) {
        iCategoryBlogService.delete(deleteId);
        return "redirect:/category";
    }

}
