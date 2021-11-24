package codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("")
public class HomeController {

//    private final ICustomerService customerService = new CustomerService();

    @GetMapping("/")
    public String index(Model model) {
//        List<Customer> customerList = customerService.findAll();
//        model.addAttribute("customers", customerList);
        return "/index";
    }

    @GetMapping("/home")
    public String getHome(Model model) {

        String a = "HELLO WORLD";
        System.out.println(a);

//        List<Customer> customerList = customerService.findAll();
//        model.addAttribute("customers", customerList);
        return "/index";
    }
}
