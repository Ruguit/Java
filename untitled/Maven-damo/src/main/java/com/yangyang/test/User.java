package com.yangyang.test;

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
     * 存钱的方法
     * @param money
     */
    public synchronized void updateMoney(Double money){
        try {
            System.out.println(Thread.currentThread()+"进来了");
            Thread.sleep(2000);
            if(this.money==0){
                this.money+=money;
                System.out.println(Thread.currentThread()+"存钱"+money);
                this.notifyAll();
                this.wait();
            }else{
                this.notifyAll();
                this.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /***
     * 取钱的方法的方法
     * @param v
     */
    public synchronized void deleteMoney(double v) {
        try {
            System.out.println(Thread.currentThread()+"进来了");
            Thread.sleep(2000);
            if(this.money>=v){
                this.money-=v;
                System.out.println(Thread.currentThread()+"取钱"+v);
                this.notifyAll();
                this.wait();
            }else{
                this.notifyAll();
                this.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
