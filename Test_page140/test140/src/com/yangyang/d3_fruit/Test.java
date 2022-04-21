package com.yangyang.d3_fruit;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       People p=new People();
       p.Eat(new Fruit() {
           @Override
           public String setFruitName() {
               Scanner sc=new Scanner (System.in);
               String fruit=sc.next();
               return fruit;
           }
       });

    }
}
