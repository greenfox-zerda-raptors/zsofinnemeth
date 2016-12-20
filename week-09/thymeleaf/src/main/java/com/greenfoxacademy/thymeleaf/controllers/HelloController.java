package com.greenfoxacademy.thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;


/**
 * Created by false on 2016. 12. 20..
 */
@Controller
public class HelloController{

    @RequestMapping("/hello")
    public String greeting(Model model, @RequestParam(defaultValue = "Thymeleaf", required = false) String name) {
         model.addAttribute("name", name);
         model.addAttribute("date", new Date());
        return "greeting";
    }
}
