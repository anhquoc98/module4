package com.example.form_binding.controller;

import com.example.form_binding.model.Gmail;
import com.example.form_binding.service.impl.GmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/gmail")
public class GmailController {
    @Autowired
    private GmailService gmailService;

    @GetMapping("")
    public String updateShowPage(Model model) {
        model.addAttribute("gmail", gmailService.gmail());
        model.addAttribute("lanuagesList", gmailService.getlanuagesList());
        model.addAttribute("pageSizeList", gmailService.getpageSizeList());
        return "update";
    }

    @PostMapping("")
    public String updatePage(Model model, @ModelAttribute Gmail gmail) {
        gmailService.update(gmail);
        model.addAttribute("gmail", gmail);
        return "list";
    }
}
