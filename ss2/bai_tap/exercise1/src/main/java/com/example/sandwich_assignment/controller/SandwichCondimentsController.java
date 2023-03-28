package com.example.sandwich_assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichCondimentsController {
    @GetMapping("/home")
    public String list() {
        return "list";
    }

    @PostMapping("/save")
    public String save(@RequestParam(value = "condiment", required = false) String[] condiment, Model model) {
        if (condiment == null) {
            return "list";
        }
        model.addAttribute("condiment", condiment);
        return "create";
    }
}
