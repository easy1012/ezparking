package com.example.ezpark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EnrollController {

    @GetMapping("/enrollpage")
    public String enrollform(){
        return "enrollpage";
    }
}
