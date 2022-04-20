package com.test.d3;

public class Test {
    public static void main(String[] args) {
        student s=new student("张三",91.5,98.0,89.0);
        student s1=new student("李四",96.0,98.5,93.0);
        student s2=new student("王五",97.0,100.0,98.5);
        student s3=new student("钱六",77.0,83.0,81.0);

        System.out.println(s.getName()+" "+s.getWen()+" "+s.getShu()+" "+s.getEnglish()+" "+s.pingjunshu());
    }
}
