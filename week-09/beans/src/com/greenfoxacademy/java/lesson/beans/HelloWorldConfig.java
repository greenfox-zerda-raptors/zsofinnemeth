package com.greenfoxacademy.java.lesson.beans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
public class HelloWorldConfig {

    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }

    @Bean
    @Scope("prototype")
    public WithFries withFries(boolean flSalted) {
        return new WithFries(flSalted);
    }
}