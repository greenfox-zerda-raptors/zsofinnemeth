package com.greenfoxacademy.java.lesson.beans;

import org.springframework.context.annotation.Bean;
        import org.springframework.stereotype.Component;

@Component
public class WithFries {


    Boolean flSalted = true;

    public WithFries(Boolean flSalted) {
        System.out.println("With Fries constructor that takes parameter");
        this.flSalted = flSalted;
    }

//    public WithFries() {
//    }

    public WithFries(String t){
        System.out.println("With Fries constructor that takes a string parameter");

    }

    @Override
    public String toString() {
        return (flSalted? "Salted" : "Unassaulted");
    }

    public void toggleFlSalted() {
        this.flSalted = ! this.flSalted;
    }
}
