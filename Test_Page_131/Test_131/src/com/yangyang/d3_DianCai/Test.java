package com.yangyang.d3_DianCai;

public class Test {
    public static void main(String[] args) {
        people t=new Teacher();
        Teacher t1=(Teacher) t;
        t1.teacher();

        people s=new Student();
        Student s1=(Student) s;
        s1.student();

        people d=new Docter();
        Docter d1=(Docter) d;
        d1.docter();
    }
}
