package com.learning.springboot.demo.mycoolapp.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

//    inject properties using @value

    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

//    Adding a endpoint team info

    @GetMapping("/teaminfo")
    public String teamInfo(){
        return "Coach : " + coachName + " team : " + teamName;
    }
//    Expose "/" endpoint that return Hello World
    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }
//     Exposing new endpoint
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run Hard 5 K";
    }

    @GetMapping("/fortune")
    public String getFortune(){
        return "Today is your lucky day";
    }

}
