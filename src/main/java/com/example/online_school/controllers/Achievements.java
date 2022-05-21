package com.example.online_school.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Achievements {

    @GetMapping("/achievements")
    public String home(Model model) {
        return "achievements";
    }

}