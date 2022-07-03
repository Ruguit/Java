package com.yangyang.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class User {
    private double money;

    public User() {
    }

    public User(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    /***
     * 取钱的方法
     * @param price 要取的金额
     */
    public synchronized void UpdateMoney(Double price){
        System.out.println(Thread.currentThread() + "进来了");
        Lock lock=new ReentrantLock();
        lock.lock();
            if(price<=money){
                //取钱
                System.out.println(Thread.currentThread()+"来取钱"+price);
                money-=price;
                System.out.println("剩余余额"+money);
            }else {
                System.out.println(Thread.currentThread()+"抱歉！余额不足");
            }
        lock.unlock();
    }

}
