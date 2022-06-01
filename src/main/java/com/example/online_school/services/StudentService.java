package com.example.online_school.services;

import com.example.online_school.models.Exam;
import com.example.online_school.models.Student;
import com.example.online_school.repos.ExamRepo;
import com.example.online_school.repos.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class StudentService {

    public void addStudent(
            StudentRepo studentRepo,
            ExamRepo examRepo,
            String name,
            String surname,
            String patronymic,
            String login,
            String password,
            String phoneNumber,
            String email,
            String linkVK
    ) {
        Student student = new Student();

        student.setName(name);
        student.setSurname(surname);
        student.setPatronymic(patronymic);
        student.setLogin(login);
        student.setPassword(password);
        student.setPhoneNumber(phoneNumber);
        student.setEmail(email);
        student.setLinkVK(linkVK);
        student.setActive(1);
        studentRepo.save(student);


        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);
        Exam exam = new Exam();
        exam.setMonthNum(month);
        exam.setSubmitted(0);
        exam.setStudent(student);
        examRepo.save(exam);
    }
}
