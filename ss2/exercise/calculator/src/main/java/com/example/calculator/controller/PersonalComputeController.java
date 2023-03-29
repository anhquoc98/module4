package com.example.calculator.controller;

import com.example.calculator.service.impl.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonalComputeController {


    @GetMapping("/list")
    public String showView() {
        return "list";
    }

    @Autowired
    private CalculateService service;

    @PostMapping("/create")
    public String showResult(@RequestParam(name = "numberFirst", defaultValue = "0") Double numberFirst,
                             @RequestParam(name = "numberSecond", defaultValue = "0") Double numberSecond,
                             @RequestParam String calculation, Model model) {


        model.addAttribute("calculation", calculation);
        model.addAttribute("result", service.calculator(numberFirst, numberSecond, calculation));
        return "create";
    }
}
