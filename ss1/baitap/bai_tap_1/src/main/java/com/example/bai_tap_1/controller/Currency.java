package com.example.bai_tap_1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Currency {
    @GetMapping("/currency")
    String index() {
        return "currency";
    }

    @PostMapping("/result")
    public String result(@RequestParam String usd, Model model) {
        Double result = Double.parseDouble(usd) * 24.000;
        model.addAttribute("result", result);
        return "result";
    }
}
