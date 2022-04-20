package com.yangyang.d2_Insect;

public class CangYng extends Insect implements Flyable{

    @Override
    public void reproduce() {
        System.out.println("苍蝇的繁殖方式是产卵");
    }

    @Override
    public void fly() {
        System.out.println("灿苍蝇可以在空中飞行");
    }
}
