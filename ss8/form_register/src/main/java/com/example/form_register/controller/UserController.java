package com.example.form_register.controller;

import com.example.form_register.dto.UsersDtoAdd;
import com.example.form_register.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.validation.Valid;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUsersService iUsersService;

    @GetMapping("")
    public String listUsers(Model model) {

        model.addAttribute("usersModel", iUsersService.list());
        return "list";
    }

    @GetMapping("add")
    public String showInputUsers(Model model) {
        model.addAttribute("usersDtoAdd", new UsersDtoAdd());
        return "add";
    }

    @PostMapping("add")
    public String inputCustomer(@Valid @ModelAttribute UsersDtoAdd usersDtoAdd,
                                BindingResult bindingResult,
                                RedirectAttributes redirect, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("usersDtoAdd", usersDtoAdd);
            return "add";
        } else {
            iUsersService.add(usersDtoAdd);
            redirect.addAttribute("msg", "thêm mới thành công");
            return "redirect:/users";
        }
    }
}
