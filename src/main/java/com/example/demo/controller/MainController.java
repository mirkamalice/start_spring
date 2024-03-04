package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/calc/sum/{x}/{y}")
    public String sum(@PathVariable int x ,@PathVariable int y){
        return "x+y= "+ (x+y);
    }
    @GetMapping("/calc/sub/{x}/{y}")
    public String sub(@PathVariable int x ,@PathVariable int y){
        return "x-y= "+ (x-y);
    }
    @GetMapping("/calc/mul/{x}/{y}")
    public String mult(@PathVariable int x ,@PathVariable int y){
        return "x*y= "+ (x*y);
    }
    @GetMapping("/calc/div/{x}/{y}")
    public String div(@PathVariable int x ,@PathVariable int y){
        return "x/y= "+ (x/y);
    }
}
