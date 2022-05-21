package com.example.online_school.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HomeTask {
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
