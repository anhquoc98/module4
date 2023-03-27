package com.example.exercise1.controller;

import com.example.exercise1.model.service.CurrencyService;
import com.example.exercise1.model.service.ICurrencyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyController {
    ICurrencyService currencyService=new CurrencyService();
    @GetMapping("/currency")
    String index() {
        return "currency";
    }

    @PostMapping("/result")
    public String result(@RequestParam Double usd, Model model) {
        String result= String.valueOf(currencyService.changMoney(usd));
        model.addAttribute("result", result);
        return "result";
    }
}
