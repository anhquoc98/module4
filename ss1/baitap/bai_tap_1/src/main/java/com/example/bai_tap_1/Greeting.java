package com.example.bai_tap_1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Greeting {
    @GetMapping("/greeting")
    public String greeting() {
        return "index";
    }


}
