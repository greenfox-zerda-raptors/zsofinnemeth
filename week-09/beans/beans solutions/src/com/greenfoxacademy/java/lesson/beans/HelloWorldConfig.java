package com.greenfoxacademy.java.lesson.beans;
        import org.springframework.context.annotation.*;

@Configuration
public class HelloWorldConfig {

    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }

    @Bean
    public WithFries withFries(Boolean myBoolean) {return new WithFries(myBoolean);};

    @Bean
    public MyBoolean myBoolean() {return new myBoolean();}
//    @Bean
//    public String greet(String name) {return "Howdy " + name;}


}