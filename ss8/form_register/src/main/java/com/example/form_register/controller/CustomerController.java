package com.example.form_register.controller;

import com.example.form_register.dto.CustomerDtoAdd;
import com.example.form_register.model.CustomerModel;
import com.example.form_register.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    ICustomerService iCustomerService;

    @GetMapping("")
    public String listCustomer(Model model) {

        model.addAttribute("customerModel", iCustomerService.list());
        return "list";
    }

    @GetMapping("add")
    public String showInputCustomer(Model model) {
        model.addAttribute("customerDtoAdd", new CustomerDtoAdd());
        return "add";
    }

    @PostMapping("add")
    public String inputCustomer(@Valid @ModelAttribute CustomerDtoAdd customerDtoAdd,
                                BindingResult bindingResult,
                                RedirectAttributes redirect, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("customerDtoAdd", customerDtoAdd);
            return "add";
        } else {
            iCustomerService.add(customerDtoAdd);
            redirect.addAttribute("msg", "thêm mới thành công");
            return "redirect:/customer";
        }
    }
}
