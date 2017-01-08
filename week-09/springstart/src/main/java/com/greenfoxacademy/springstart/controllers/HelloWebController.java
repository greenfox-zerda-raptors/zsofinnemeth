package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

    AtomicLong nextID = new AtomicLong(999);

    @RequestMapping("/web/greeting")
    public String greeting(Model model) {
        model.addAttribute("name", " World");
        model.addAttribute("counter", nextID.getAndIncrement());
        return "greeting";
    }
}