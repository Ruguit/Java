package com.yangyang.d1_Cat;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Cat>cats=new ArrayList<>();
        System.out.println("你想要为几只猫录入信息？");
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            System.out.println("第"+i+"只猫");
            System.out.println("名字");
            String name=sc.next();
            System.out.println("年龄");
            int age=sc.nextInt();
            System.out.println("重量");
            double weight=sc.nextDouble();
            System.out.println("颜色");
            String color=sc.next();
            //将每只猫的信息放入集合中
            cats.add(new Cat(i,name,age,weight,color));
        }
        System.out.println("信息录入完毕");
        for(int i=0;i<n;i++){
            //将猫的信息调出
            Cat c=cats.get(i);
            System.out.println(c);
            System.out.println();
        }
    }
}

