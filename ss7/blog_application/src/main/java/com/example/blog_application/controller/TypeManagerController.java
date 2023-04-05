package com.example.blog_application.controller;


import com.example.blog_application.model.TypeBlog;
import com.example.blog_application.service.ITypeBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/type")

public class TypeManagerController {
    @Autowired
    ITypeBlogService typeBlogService;

    @GetMapping("")
    public String showList(Model model, @RequestParam(defaultValue = "0") int page,
                           @RequestParam(required = false, defaultValue = "") String name) {
        Sort sort = Sort.by("type").descending();
        model.addAttribute("typeBlog", typeBlogService.seachByName(name, PageRequest.of(page, 3, sort)));
        return "/typeViews/listType";
    }

    @GetMapping("/update/{id}")
    public String showUpdateType(@PathVariable int id, Model model) {
        model.addAttribute("typeBlog", typeBlogService.seachById(id));
        return "/typeViews/updateType";
    }


    @GetMapping("/create-type")
    public String createShow(Model model) {
        model.addAttribute("typeBlog", new TypeBlog());
        return "/typeViews/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute TypeBlog typeBlog,
                         BindingResult bindingResult,
                         RedirectAttributes redirect) {
        typeBlogService.add(typeBlog);
        redirect.addAttribute("msg", "thêm mới thành công");
        return "redirect:/type";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam(required = false) Integer deleteId) {
        typeBlogService.delete(deleteId);
        return "redirect:/type";
    }

}
