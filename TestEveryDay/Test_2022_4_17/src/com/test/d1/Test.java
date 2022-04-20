package com.test.d1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数");
        double x=sc.nextDouble();
        System.out.println("请输入运算符号");
        char ch=sc.next().charAt(0);
        System.out.println("请输入第二个数");
        double y=sc.nextDouble();
        System.out.println(add(x,ch,y));
    }
    public static double add(double x, char ch, double y){
        double number=0;
        switch(ch){
            case '+':number=x+y;
                break;
            case '-':number=x-y;
                break;
            case '*':number=x*y;
                break;
            case '/':number=x/y;
        }
        return number;
    }
}
