package com.example.exercise2.controller;

import com.example.exercise2.service.ICalculateService;
import com.example.exercise2.service.impl.CalculateService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonalComputeController {

    private CalculateService service = new CalculateService();

    @GetMapping("/list")
    public String showView() {
        return "list";
    }

    @PostMapping("/create")
    public String showResult(@RequestParam(name = "number1", defaultValue = "0") Double number1,
                             @RequestParam(name = "number2", defaultValue = "0") Double number2,
                             @RequestParam String calculation, Model model) {
        double result = 0;
        ICalculateService service = new CalculateService();
        model.addAttribute("calculation", calculation);
        model.addAttribute("result", service.calculator(number1, number2, result, calculation));
        return "create";
    }
}
