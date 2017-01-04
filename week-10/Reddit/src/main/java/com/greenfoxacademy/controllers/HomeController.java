package com.greenfoxacademy.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String helloIndex() {
        return "Hello World!";
    }
}
