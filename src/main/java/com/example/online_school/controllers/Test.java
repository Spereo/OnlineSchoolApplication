package com.example.online_school.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test {

    @GetMapping("/test/list")
    public String test_list(Model model) {
        return "test/list";
    }

    @GetMapping("/test/032202")
    public String test_032202(Model model) {
        return "test/032202";
    }

}
