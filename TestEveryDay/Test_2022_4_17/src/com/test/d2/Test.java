package com.test.d2;

import java.util.ArrayList;

public class Test {
    public static double PRICE=40;
    public static void main(String[] args) {
        people p=new people("李明",20,PRICE);
        people p1=new people("钱丽",16,PRICE);
        people p2=new people("周刚",8,PRICE);
        people p3=new people("吴红",32,PRICE);
        System.out.println("姓名      年龄     票价");
        System.out.println("-----------------------");
        System.out.println(p.getName()+"   "+p.getAge()+"   "+p.getPrice());
        System.out.println(p1.getName()+"   "+p1.getAge()+"   "+p1.getPrice());
        System.out.println(p2.getName()+"   "+p2.getAge()+"   "+p2.getPrice());
        System.out.println(p3.getName()+"   "+p3.getAge()+"   "+p3.getPrice());

    }
}
class people{
    private String name;
    private int age;
    private double price;

    public people(){}
    public people(String name, int age, double price) {
        this.name = name;
        this.age = age;
        this.price = price;
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

    public double getPrice() {
        if(age<18){
            return price/2;
        }
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}