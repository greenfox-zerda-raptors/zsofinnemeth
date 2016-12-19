package com.greenfoxacademy.springstart.controllers;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by false on 2016. 12. 19..
 */
@RestController
public class HelloRESTController {

    AtomicLong nextID = new AtomicLong(1);

    @RequestMapping
    public String greeting(@RequestParam String name) {
        Greeting greet = new Greeting(1, "World");
        long counter = nextID.getAndIncrement();
        return "id: " + counter + ", content: Hello, " + name + "!";
    }
}
