package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/calc/sum/{x}/{y}")
    public String sendHello(@PathVariable int x ,@PathVariable int y){
        return "x+y= "+ (x+y);
    }
}
