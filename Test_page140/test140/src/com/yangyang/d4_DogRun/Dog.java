package com.yangyang.d4_DogRun;

public class Dog {
    public static void main(String[] args) {
       Moveable m=new Moveable() {
           @Override
           public void run() {
               System.out.println("Dog在跑");
           }
       };
       m.run();
    }
}
