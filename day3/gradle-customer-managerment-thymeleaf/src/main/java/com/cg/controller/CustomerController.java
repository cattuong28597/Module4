package com.cg.controller;

import com.cg.model.Customer;
import com.cg.service.CustomerService;
import com.cg.service.ICustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    private final ICustomerService customerService = new CustomerService();


    @GetMapping
    public String index(Model model) {

        List<Customer> customerList = customerService.findAll();
        model.addAttribute("customers", customerList);
        return "/index";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {

        List<Customer> customerList = customerService.findAll();
        model.addAttribute("customers", customerList);
        return "/customer/create";
    }
}
