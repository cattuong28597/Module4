package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {
    @GetMapping("/welcome")
    public String hello(@RequestParam String hi, Model model) {
        model.addAttribute("hello", hi);
        return "currency/welcome";
    }

    @PostMapping("/welcome")
    public String hi(@RequestParam String hi, Model model) {
        model.addAttribute("hello", hi);
        return "currency/welcome";
    }
}
