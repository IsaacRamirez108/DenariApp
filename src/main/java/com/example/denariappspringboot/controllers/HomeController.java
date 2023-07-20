package com.example.denariappspringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/privacy-policy")
    public String showPolicy() {
        return "Legal/Privacy_Policy";
    }

    @GetMapping("/terms-of-use")
    public String showTerms() {
        return "Legal/Terms_Conditions";
    }
}
