package com.telusko.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControler {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to telusko";
    }

    @RequestMapping("/about")
    public String about(){
        return "we don't tech we Educate !!!";
    }
}
