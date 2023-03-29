package com.example.form_binding.controller;

import com.example.form_binding.model.Gmail;
import com.example.form_binding.service.impl.GmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class GmailController {
    @Autowired
    private GmailService gmailService;

//    @GetMapping("list")
//    public String showPage(Model model) {
//        model.addAttribute("gmailService", gmailService.list());
//        return "list";
//    }

    @GetMapping("update")
    public String updateShowPage(Model model) {
        model.addAttribute("gmail", new Gmail());
        String[] languages = gmailService.lanuages();
        model.addAttribute("languages", languages);
        int[] size = gmailService.pageSize();
        model.addAttribute("size", size);
        return "update";
    }

    @GetMapping("list")
    public String updatePage(Model model, @RequestParam String language,
                             @RequestParam int pageSize,
                             @RequestParam boolean spamsFilter,
                             @RequestParam String signature) {
        Gmail gmail = new Gmail(language,pageSize,spamsFilter,signature);
        model.addAttribute("gmail", gmail);
        return "list";
    }
}
