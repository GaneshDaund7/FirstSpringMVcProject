package com.mypackg.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Grettings {
    @RequestMapping("/")
    public String Great(Model model)
    {
       return "great";
    }
}
