package com.example.online_school.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String surname;
    private String patronymic;

    private String login;
    private String password;
    private int active;

    private String phoneNumber;
    private String email;
    private String linkVK;

    private String subject;
    private String direction;

    @Column(length = 1000)
    private String description;

    private int classesHeld;
    private int numberOf100;

    private String photoLink;

    @ManyToMany(fetch = FetchType.EAGER)
    Set<Student> studentSet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int isActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLinkVK() {
        return linkVK;
    }

    public void setLinkVK(String linkVK) {
        this.linkVK = linkVK;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getClassesHeld() {
        return classesHeld;
    }

    public void setClassesHeld(int classesHeld) {
        this.classesHeld = classesHeld;
    }

    public int getNumberOf100() {
        return numberOf100;
    }

    public void setNumberOf100(int numberOf100) {
        this.numberOf100 = numberOf100;
    }

    public String getPhotoLink() {
        return photoLink;
    }

    public void setPhotoLink(String photoLink) {
        this.photoLink = photoLink;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getActive() {
        return active;
    }
}
