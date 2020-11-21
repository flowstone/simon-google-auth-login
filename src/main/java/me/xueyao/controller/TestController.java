package me.xueyao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Simon.Xue
 * @date 11/22/20 1:08 AM
 **/
@Controller
public class TestController {

    @RequestMapping("/index")
    public String index(ModelMap map) {
        map.addAttribute("newWorld", "Welcome to new world");
        return "index";
    }

    @RequestMapping("/auth")
    public String auth(ModelAndView modelAndView) {
        return "auth";
    }
}
