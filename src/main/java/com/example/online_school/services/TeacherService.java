package com.example.online_school.services;

import com.example.online_school.models.Teacher;
import com.example.online_school.repos.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class TeacherService {
    @Autowired
    TeacherRepo teacherRepo;

    public void addTeacher(
            String name,
            String surname,
            String patronymic,
            String login,
            String password,
            String phoneNumber,
            String email,
            String linkVK,
            String subject,
            String direction,
            String description,
            int classesHeld,
            int numberOf100,
            String photoLink
    ) {
        Teacher teacher = new Teacher();

        teacher.setName(name);
        teacher.setSurname(surname);
        teacher.setPatronymic(patronymic);
        teacher.setLogin(login);
        teacher.setPassword(password);
        teacher.setPhoneNumber(phoneNumber);
        teacher.setEmail(email);
        teacher.setLinkVK(linkVK);
        teacher.setActive(0);
        teacher.setSubject(subject);
        teacher.setDirection(direction);
        teacher.setDescription(description);
        teacher.setClassesHeld(classesHeld);
        teacher.setNumberOf100(numberOf100);
        teacher.setPhotoLink(photoLink);
        teacherRepo.save(teacher);
    }
}
