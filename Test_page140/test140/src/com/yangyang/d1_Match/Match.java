package com.yangyang.d1_Match;

public class Match {
    public static void main(String[] args) {
        new Match()/*匿名使用的是Fire类， 作为对象使用*/{
            public void fire(){
                System.out.println("一根火柴点燃了");
            }
        };
    }
}
