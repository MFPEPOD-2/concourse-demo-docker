package com.example.SpringBootDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String test1(){
        return "hello Spring Boot with docker";
    }

    @GetMapping("/bye")
    public String test2(){
        return "bye docker";
    }
}
