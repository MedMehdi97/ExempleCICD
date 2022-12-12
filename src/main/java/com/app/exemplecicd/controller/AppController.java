package com.app.exemplecicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("hello")
    String helloWorld(){
        return "Hello World !";
    }
}
