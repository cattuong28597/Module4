package com.codegym.cms.controller;

import com.codegym.cms.model.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("")
    public String view(){
        return "/index";
    }


    @PostMapping
    public ResponseEntity<String> saveCustomer() {
        String str = "/index";
        return new ResponseEntity<>(str, HttpStatus.CREATED);
    }
}
