package com.yangyang.d2_heart;

public class Test {
    public static void main(String[] args) {
        new people();//一定先执行无参构造方法
    }
}

class people{
    heart h=new heart();
    public people(){
        h.heartjump();
        System.out.println("heart跳动");
    }
    class heart{
        public void heartjump(){
            System.out.println("怦怦！");
        }
    }
}
