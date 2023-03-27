package com.example.exercise_2.controller;

import com.example.exercise_2.model.service.ITranslateService;
import com.example.exercise_2.model.service.TranslateService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TranslateController {
    ITranslateService translateService = new TranslateService();
    @GetMapping("view")
    public String view(){
        return "view";
    }
    @PostMapping("language")
    public String result(@RequestParam(name = "translate") String translate, Model model){
        String result =translateService.list(translate);
        model.addAttribute("result",result);
        return "language";
    }
}
