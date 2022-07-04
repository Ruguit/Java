package com.yangyang.test;
//存钱
public class SetThread extends Thread {
    private User user;

    public SetThread(User user,String name) {
        super(name);
        this.user = user;
    }
    @Override
    public void run(){
        while (true) {
            user.updateMoney(10000.0);
        }
    }
}
