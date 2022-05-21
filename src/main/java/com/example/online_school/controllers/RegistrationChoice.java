package com.example.online_school.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationChoice {
    @PostMapping("/registration")
    public String chooseReg(Model model, @RequestParam String action) {
        if(action.equals("student")) {
            return "redirect:/student/registration";
        } else {
            return "redirect:/teacher/registration";
        }
    }
}
