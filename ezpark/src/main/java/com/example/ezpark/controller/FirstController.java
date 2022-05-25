package com.example.ezpark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {
    @GetMapping("")
    public String mainpage(){

        return "mainpage";
    }

    @GetMapping("/admin")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "지원");
        return "greetings";
    }
}
