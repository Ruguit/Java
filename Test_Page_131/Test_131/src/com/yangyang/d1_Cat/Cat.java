package com.yangyang.d1_Cat;

public class Cat {
    private int number;
    private String name;
    private int age;
    private double weight;
    private String color;

    public Cat(){}

    public Cat(int number,String name, int age, double weight, String color) {
        this.number=number;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 重写toString方法
     * @return 返回 猫的信息
     */
    @Override
    public String toString() {
        return "猫咪"+number+"号：名字：'" + name + '\n' +
                "年龄：" + age +'\n'+
                "重量：" + weight +'\n'+
                "颜色：'" + color ;
    }
}
