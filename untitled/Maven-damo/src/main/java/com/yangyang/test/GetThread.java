package com.yangyang.test;
//取钱
public class GetThread extends Thread{
    private User user;

    public GetThread(User user,String name) {
        super(name);
        this.user = user;
    }
    @Override
    public void run(){
        while (true) {
            user.deleteMoney(1000.0);
        }
    }
}
