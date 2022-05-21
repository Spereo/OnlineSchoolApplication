package com.example.online_school.controllers;

import com.example.online_school.models.Teacher;
import com.example.online_school.repos.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class TeacherList {
    @Autowired
    private TeacherRepo teacherRepo;

    @GetMapping("/teacher/list")
    public String teacher_list(Model model) {
        Iterable<Teacher> optionalTeacher = teacherRepo.findAll();
        List<Teacher> teacherList = new ArrayList<>();
        optionalTeacher.forEach(teacherList::add);
        model.addAttribute("teacherList", teacherList);
        return "teacher/list";
    }

    @GetMapping("/teacher/{id}")
    public String teacherDetails(@PathVariable(value = "id") Long id, Model model) {
        Optional<Teacher> opTeacher = teacherRepo.findById(id);
        Teacher teacher = opTeacher.orElseGet(Teacher::new);
        model.addAttribute("teacher", teacher);
        return "teacher/teacherDetails";
    }

}