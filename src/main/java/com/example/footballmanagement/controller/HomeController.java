package com.example.footballmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "")
public class HomeController {
    @GetMapping
    public String getHomePage() {
        System.out.println("@DUKE + This is home page");
        return "home/index";
    }
}
