package com.example.denariappspringboot.controllers;

import com.example.denariappspringboot.models.User;
import com.example.denariappspringboot.repositories.UserRepository;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private final UserRepository userDao;

    public UserController(UserRepository userDao) {
        this.userDao = userDao;
//        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/")
    public String registrationForm(Model model) {
        model.addAttribute("user", new User());
        return "/index";
    }

    @PostMapping("/")
    public String saveUser(@ModelAttribute User user){
//        String hash = passwordEncoder.encode(user.getPassword());
//        user.setPassword(hash);
        userDao.save(user);
        return "redirect:/Successful";
    }

    @GetMapping("/Successful")
    public String showProfile() {
        return "successful";
    }

    @GetMapping("/privacy-policy")
    public String showPolicy() {
        return "Legal/Privacy_Policy";
    }

    @GetMapping("/terms-of-use")
    public String showTerms() {
        return "Legal/Terms_Conditions";
    }
}

