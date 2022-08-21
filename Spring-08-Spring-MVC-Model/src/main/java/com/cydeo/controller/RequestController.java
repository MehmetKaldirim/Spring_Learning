package com.cydeo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/ask")
public class RequestController {

    @RequestMapping("/welcome")
    public String bordo(@RequestParam String firstName){
        System.out.println(firstName);
        return "/student/ask";
    }

    @RequestMapping("/dinner")
    public String mavi(@RequestParam(required = false, defaultValue = "Bordo") String firstName){
        System.out.println(firstName);
        return "/student/ask";
    }
}
