package com.yangyang.d6_abstract_TuXing2;

public class Test {
    public static void main(String[] args) {
        TuX t=new SanJiaoX(3.0,4.0,5.0);
        t.C();//周长是12.0
        TuX t1=new SanJiaoX(1.0,4.0,5.0);
        t1.C();//不能构成三角型
    }
}
