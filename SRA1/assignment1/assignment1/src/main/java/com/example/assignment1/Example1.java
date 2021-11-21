package com.example.assignment1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example1 {
    @GetMapping(path = "/assignment1")
    public String display(){
        return "Hello World";
    }
}
