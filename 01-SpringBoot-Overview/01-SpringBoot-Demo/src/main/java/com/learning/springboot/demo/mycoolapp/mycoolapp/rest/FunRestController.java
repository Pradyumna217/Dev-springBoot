package com.learning.springboot.demo.mycoolapp.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
//    Expose "/" endpoint that return Hello World
    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

}
