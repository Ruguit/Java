package com.yangyang.d2_Insect;

public class Test {
    public static void main(String[] args) {
        Insect in=new CangYng();
        in.setLegs(6);
        System.out.println("苍翼的腿有"+in.getLegs()+"条");
        Flyable in1=new CangYng();
        in1.fly();
        in.reproduce();
    }
}
