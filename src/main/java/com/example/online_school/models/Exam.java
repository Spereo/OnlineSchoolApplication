package com.example.online_school.models;

import javax.persistence.*;

@Entity
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int monthNum;

    private int isSubmitted;

    private double answer1;
    private double answer2;
    private double answer3;
    private double answer4;
    private double answer5;
    private double answer6;
    private double answer7;
    private double answer8;
    private double answer9;
    private double answer10;
    private double answer11;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "student_id")
    private Student student;

    public int getMonthNum() {
        return monthNum;
    }

    public void setMonthNum(int monthNum) {
        this.monthNum = monthNum;
    }

    public int isSubmitted() {
        return isSubmitted;
    }

    public void setSubmitted(int submitted) {
        isSubmitted = submitted;
    }

    public double getAnswer1() {
        return answer1;
    }

    public void setAnswer1(double answer1) {
        this.answer1 = answer1;
    }

    public double getAnswer2() {
        return answer2;
    }

    public void setAnswer2(double answer2) {
        this.answer2 = answer2;
    }

    public double getAnswer3() {
        return answer3;
    }

    public void setAnswer3(double answer3) {
        this.answer3 = answer3;
    }

    public double getAnswer4() {
        return answer4;
    }

    public void setAnswer4(double answer4) {
        this.answer4 = answer4;
    }

    public double getAnswer5() {
        return answer5;
    }

    public void setAnswer5(double answer5) {
        this.answer5 = answer5;
    }

    public double getAnswer6() {
        return answer6;
    }

    public void setAnswer6(double answer6) {
        this.answer6 = answer6;
    }

    public double getAnswer7() {
        return answer7;
    }

    public void setAnswer7(double answer7) {
        this.answer7 = answer7;
    }

    public double getAnswer8() {
        return answer8;
    }

    public void setAnswer8(double answer8) {
        this.answer8 = answer8;
    }

    public double getAnswer9() {
        return answer9;
    }

    public void setAnswer9(double answer9) {
        this.answer9 = answer9;
    }

    public double getAnswer10() {
        return answer10;
    }

    public void setAnswer10(double answer10) {
        this.answer10 = answer10;
    }

    public double getAnswer11() {
        return answer11;
    }

    public void setAnswer11(double answer11) {
        this.answer11 = answer11;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIsSubmitted() {
        return isSubmitted;
    }

    public void setIsSubmitted(int isSubmitted) {
        this.isSubmitted = isSubmitted;
    }
}
