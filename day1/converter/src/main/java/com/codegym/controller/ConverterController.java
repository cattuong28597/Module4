package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConverterController {
    @GetMapping("/converter")
    public String converter(@RequestParam int usd, Model model) {
        int vnd = usd * 22000;
        model.addAttribute("vnd", vnd);
        return "currency/converter";
    }
}
