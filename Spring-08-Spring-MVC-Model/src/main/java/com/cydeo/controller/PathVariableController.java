package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/bakba")
public class PathVariableController {

    @RequestMapping("/byebye/{firstName}")
    public String bordo(@PathVariable String firstName){
        System.out.println(firstName);
        return "/student/ask";
    }


}
