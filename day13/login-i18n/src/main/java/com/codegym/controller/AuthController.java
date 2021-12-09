package com.codegym.controller;

import com.codegym.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;
import java.util.ResourceBundle;

@Controller
public class AuthController {

//    @Autowired
//    private MessageSource messageSource;

    @GetMapping("/login")
    public ModelAndView showLogin(@RequestParam(required = false, defaultValue = "vi") String lang) {
        ModelAndView modelAndView = new ModelAndView("/login");
        modelAndView.addObject("user", new User());

//        String language = messageSource.getMessage("language", null, new Locale(lang));
//        modelAndView.addObject("language", language);

        ResourceBundle rb = ResourceBundle.getBundle("message", new Locale(lang));
        modelAndView.addObject("language", rb.getString("language"));

        return modelAndView;
    }

    @PostMapping("/doLogin")
    public ModelAndView doLogin(@ModelAttribute User user) {
        if(user.getUsername().equals("admin") && user.getPassword().equals("123456")){
            ModelAndView modelAndView = new ModelAndView("/success");
            modelAndView.addObject("user",user);
            return modelAndView;
        }
        return new ModelAndView("/error");
    }
}
