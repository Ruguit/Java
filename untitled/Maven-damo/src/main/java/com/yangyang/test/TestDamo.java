package com.yangyang.test;



public class TestDamo {
    
    public static void main(String[] args) {
        User user=new User(1000);
        new GetThread(user,"小明1").start();
        new GetThread(user,"小明2").start();

        new SetThread(user,"小红1").start();
        new SetThread(user,"小红2").start();
        new SetThread(user,"小红3").start();
    }
}