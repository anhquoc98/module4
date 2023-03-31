package com.example.manager_product.controller;

import com.example.manager_product.model.Product;
import com.example.manager_product.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
public class ManagerProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("")
    public String showPage(@RequestParam (required = false) String name, Model model) {
        model.addAttribute("name",name);
        model.addAttribute("listProduct", productService.list(name));
        return "/list";
    }

    @GetMapping("/add")
    public String showAdd(Model model) {
        model.addAttribute("product",new Product());
        return "/add";
    }

    @PostMapping("/add/save")
    public String addProduct(@ModelAttribute Product product) {
        productService.add(product);
        return "redirect:/product";
    }
    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id,Model model){
        model.addAttribute("product",productService.seachById(id));
        return "/edit";
    }
    @PostMapping("/{id}/update")
    public String updateProduct(@ModelAttribute Product product) {
        productService.update(product.getId() - 1, product);
        return "redirect:/product";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam int deleteId) {
        productService.remove(deleteId -1);
        return "redirect:/product";
    }
    @GetMapping("/{id}/view")
    public String view(@PathVariable int id,Model model){
        model.addAttribute("product",productService.seachById(id));
        return "/view";
    }
}
