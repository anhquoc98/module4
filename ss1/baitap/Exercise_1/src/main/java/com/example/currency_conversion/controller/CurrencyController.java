package com.example.currency_conversion.controller;

import com.example.currency_conversion.service.impl.CurrencyService;
import com.example.currency_conversion.service.ICurrencyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyController {
    private ICurrencyService currencyService = new CurrencyService();

    @GetMapping("/currency")
    public String index() {
        return "currency";
    }

    @PostMapping("/result")
    public String result(@RequestParam Double usd, Model model) {
        String result = String.valueOf(currencyService.changMoney(usd));
        model.addAttribute("result", result);
        return "result";
    }
}
