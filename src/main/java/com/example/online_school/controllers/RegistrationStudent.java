package com.example.online_school.controllers;

import com.example.online_school.repos.ExamRepo;
import com.example.online_school.repos.StudentRepo;
import com.example.online_school.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationStudent {

    @Autowired
    StudentRepo studentRepo;

    @Autowired
    ExamRepo examRepo;

    @GetMapping("/student/registration")
    public String getStudentRegistration(Model model) {
        return "student/registration";
    }

    @PostMapping("/student/registration")
    public String postStudentRegistration(
            Model model,
            @RequestParam String action,
            @RequestParam String first_name,
            @RequestParam String last_name,
            @RequestParam String patronymic,
            @RequestParam String login,
            @RequestParam String password_input,
            @RequestParam String phone,
            @RequestParam String email,
            @RequestParam String vk
    ) {
        StudentService service = new StudentService();
        service.addStudent(
                studentRepo,
                examRepo,
                first_name,
                last_name,
                patronymic,
                login,
                password_input,
                phone,
                email,
                vk);

        return "redirect:/";
    }
}
