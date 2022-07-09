package com.mypackg.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ByeController {

    @RequestMapping("/bye")
    public String Bye()
    {
        return "bye";
    }
}
