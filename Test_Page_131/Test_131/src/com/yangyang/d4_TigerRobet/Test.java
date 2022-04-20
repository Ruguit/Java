package com.yangyang.d4_TigerRobet;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Card c1=new Box1();
        c1.setCard1("红");
        c1.setCard2("黄");
        c1.setCard3("蓝");
        Box1 d1=(Box1)c1;
        d1.c1(c1);

        Card c2=new Box2();
        c2.setCard1("红");
        c2.setCard2("黄");
        c2.setCard3("蓝");
        Box2 d2=(Box2)c2;
        d2.c2(c2);

        Card c3=new Box3();
        c3.setCard1("红");
        c3.setCard2("黄");
        c3.setCard3("蓝");
        Box3 d3=(Box3)c3;
        d3.c3(c3);
    }
}
