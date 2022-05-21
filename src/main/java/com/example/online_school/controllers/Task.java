package com.example.online_school.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Task {

    @GetMapping("/task/list")
    public String home(Model model) {
        return "task/list";
    }

}
