package com.example.demo.controller;


import com.example.demo.model.CustomerModel;
import com.example.demo.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    ICustomerService iCustomerService;

    @GetMapping("")
    public String listCustomer(Model model, @RequestParam(defaultValue = "0") int page) {
        Sort sort = Sort.by("lastName");
        model.addAttribute("customer", iCustomerService.list(PageRequest.of(page, 2, sort)));
        return "list";
    }

    @GetMapping("/add")
    public String showInputCustomer(Model model) {
        model.addAttribute("customer",new CustomerModel());
        return "add";
    }

    @PostMapping("/add")
    public String inputCustomer(@ModelAttribute CustomerModel customerModel,
                                BindingResult bindingResult,
                                RedirectAttributes redirect, Model model) {
        iCustomerService.add(customerModel);
        redirect.addAttribute("msg", "thêm mới thành công");
        return "redirect:/list";
    }


}
