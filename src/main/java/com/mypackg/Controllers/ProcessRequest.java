package com.mypackg.Controllers;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
public class ProcessRequest {

    @RequestMapping("/processRequest")
    public String GetGreat(HttpServletRequest request, Model model)
    {
        String name=request.getParameter("Exactname");

        model.addAttribute("Myname",name);

        return "processRequest";
    }
}
