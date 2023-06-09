package com.example.complete_the_shopping_cart.controller;

import com.example.complete_the_shopping_cart.model.Cart;
import com.example.complete_the_shopping_cart.model.Product;
import com.example.complete_the_shopping_cart.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @ModelAttribute("cart")
    public Cart setupCart() {
        return new Cart();
    }

    @GetMapping("/shop")
    public ModelAndView showShop() {
        ModelAndView modelAndView = new ModelAndView("/shop");
        modelAndView.addObject("products", iProductService.findAll());
        return modelAndView;
    }

    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable Long id, @ModelAttribute Cart cart,
                            @RequestParam("action") String action) {
        Optional<Product> productOptional = iProductService.findById(id);
        if (!productOptional.isPresent()) {
            return "/error.404";
        }
        if (action.equals("show")) {
            cart.addProduct(productOptional.get());
            return "redirect:/shopping-cart";
        }
        cart.addProduct(productOptional.get());
        return "redirect:/shop";
    }

    @GetMapping("/decrease/{id}")
    public String decreaseToCart(@PathVariable Long id,@ModelAttribute Cart cart){
        Optional<Product> productOptional = iProductService.findById(id);
        if(!productOptional.isPresent()){
            return "/error.404";
        } else {
            cart.decreaseProduct(productOptional.get());
            return "redirect:/shopping-cart";
        }
    }

    @GetMapping("/detail/{id}")
    public String showView(@PathVariable Long id, Model model) {
        model.addAttribute("products", iProductService.findById(id));
        return "/detail";
    }

}
