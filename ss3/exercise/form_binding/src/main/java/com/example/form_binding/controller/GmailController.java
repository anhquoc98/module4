package com.example.form_binding.controller;

import com.example.form_binding.service.impl.GmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GmailController {
    @Autowired
    private GmailService gmailService;
    @GetMapping("list")
    public String showPage(Model model) {
        model.addAttribute("gmailService",gmailService.list());
        return "list";
    }
}
