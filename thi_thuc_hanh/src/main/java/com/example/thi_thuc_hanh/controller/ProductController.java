package com.example.thi_thuc_hanh.controller;

import com.example.thi_thuc_hanh.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    IProductService productService;
    @GetMapping("")
    public String list(Model model){
        model.addAttribute("product",productService.list());
        return "list";
    }
}
