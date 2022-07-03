package com.yangyang.test;


import java.util.Map;

public class TestDamo {
    public static void main(String[] args) {
        User user=new User(1000.0);//存一千元

        MyThread m1=new MyThread(user);
        MyThread m2=new MyThread(user);
        m1.start();
        m2.start();
    }
}
class MyThread extends Thread{
    private User user;

    public MyThread(User user) {
        this.user = user;
    }

    @Override
    public void run(){
        //调用取钱的方法
        user.UpdateMoney(1000.0);
    }
}
