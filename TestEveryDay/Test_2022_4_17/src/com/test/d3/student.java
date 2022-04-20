package com.test.d3;

public class student {
    private String name;
    private double wen;
    private double shu;
    private double english;

    public double pingjunshu(){
        return (wen+shu+english)/3;
    }

    public student(){}
    public student(String name, double wen, double shu, double english) {
        this.name = name;
        this.wen = wen;
        this.shu = shu;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWen() {
        return wen;
    }

    public void setWen(double wen) {
        this.wen = wen;
    }

    public double getShu() {
        return shu;
    }

    public void setShu(double shu) {
        this.shu = shu;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }
}
