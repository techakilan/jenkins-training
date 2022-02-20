package com.westerlytutors.hello.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String welcome() {
        return "Welcome to Westerly";
    }
    @RequestMapping("/hello")
    public String hello() {
        return "Hello Westerly";
    }
}