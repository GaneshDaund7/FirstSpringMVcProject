package com.mypackg.Controllers;

import com.mypackg.Dto.UserInfoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LCController {

    @RequestMapping("lcHome")
    public String showLcHomePage()
    {
        return "lcHome";
    }

    @RequestMapping("processLcHome")
    public String processLcHome(UserInfoDTO userInfoDTO, Model model)
    {
        System.out.println("Username:"+userInfoDTO.getYourname());
        System.out.println("CrushName:"+userInfoDTO.getCrushName());
        model.addAttribute("userinfo",userInfoDTO);

        return "process-LcHome";
    }
}
