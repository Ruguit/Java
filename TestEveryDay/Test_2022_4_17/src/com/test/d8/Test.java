package com.test.d8;

public class Test {
    public static void main(String[] args) {
        damo da=damo.getInstance();
    }
}

class damo{
    private static damo d;//私有damo
    private damo(){}//私有构造器
    public static damo getInstance(){
        if(d==null){
            d=new damo();
        }
        return d;
    }
}
