package com.yangyang.d8;

public class Test {
    public static void main(String[] args) {
        Number n=new Number(7,3);
        n.add();
        n.reduce();
        int num= Number.UNITS*(n.getAdds()-n.getReduces());
        System.out.println("景区还有"+num+"人");

    }
}
