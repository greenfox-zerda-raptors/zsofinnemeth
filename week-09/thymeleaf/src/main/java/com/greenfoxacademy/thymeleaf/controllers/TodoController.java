package com.greenfoxacademy.thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by false on 2016. 12. 20..
 */
@Controller
@RequestMapping(value = "/todo")
public class TodoController {

    @RequestMapping(value = "/list")
   public String toDoMethod() {
    return "what to-do here";
    }

}
