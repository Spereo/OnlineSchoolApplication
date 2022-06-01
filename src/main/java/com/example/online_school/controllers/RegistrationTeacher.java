package com.example.online_school.controllers;

import com.example.online_school.services.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationTeacher {
    @GetMapping("/teacher/registration")
    public String getTeacherRegistration(Model model) {
        return "teacher/registration";
    }

    @PostMapping("/teacher/registration")
    public String postTeacherRegistration(
            Model model,
            @RequestParam String action,
            @RequestParam String first_name,
            @RequestParam String last_name,
            @RequestParam String patronymic,
            @RequestParam String login,
            @RequestParam String password_input,
            @RequestParam String phone,
            @RequestParam String email,
            @RequestParam String vk,
            @RequestParam String subject,
            @RequestParam String direction,
            @RequestParam String description
    ) {
        TeacherService service = new TeacherService();
        service.addTeacher(
                first_name,
                last_name,
                patronymic,
                login,
                password_input,
                phone,
                email,
                vk,
                subject,
                direction,
                description,
                0,
                0,
                "");

        return "redirect:/";
    }
}
