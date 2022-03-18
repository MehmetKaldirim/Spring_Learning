package com.cydeo.controller;


import com.cydeo.bootstrap.DataGenerator;

import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/register")
    public String register(Model model){

        model.addAttribute("students", DataGenerator.createStudent());

        return "/student/register";
    }

    @RequestMapping("/welcome")
    public String info(){
        return "/student/welcome";
    }



}