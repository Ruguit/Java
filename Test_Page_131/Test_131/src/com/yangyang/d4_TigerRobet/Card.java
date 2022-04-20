package com.yangyang.d4_TigerRobet;

import java.util.Random;

public class Card {
    private String card1;
    private String card2;
    private String card3;

    public Card() {
    }

    public Card(String card1, String card2, String card3) {
        this.card1 = card1;
        this.card2 = card2;
        this.card3 = card3;
    }

    public String getCard1() {
        return card1;
    }

    public void setCard1(String card1) {
        this.card1 = card1;
    }

    public String getCard2() {
        return card2;
    }

    public void setCard2(String card2) {
        this.card2 = card2;
    }

    public String getCard3() {
        return card3;
    }

    public void setCard3(String card3) {
        this.card3 = card3;
    }
}
class Box1 extends Card{
    public void c1(Card c){
        //判断是否是子类
        if( c instanceof Box1){
            Random d=new Random();
            //随机生成0 1 2
            int number=d.nextInt(3);
            switch(number){
                case 0:
                    System.out.println(getCard1());break;
                case 1:
                    System.out.println(getCard2());break;
                case 2:
                    System.out.println(getCard3());
            }
        }
    }
}
class Box2 extends Card{
    public void c2(Card c){
        //判断是否是子类
        if( c instanceof Box2){
            Random d=new Random();
            //随机生成0 1 2
            int number=d.nextInt(3);
            switch(number){
                case 0:
                    System.out.println(getCard1());break;
                case 1:
                    System.out.println(getCard2());break;
                case 2:
                    System.out.println(getCard3());
            }
        }
    }
}
class Box3 extends Card{
    public void c3(Card c){
        //判断是否是子类
        if( c instanceof Box3){
            Random d=new Random();
            //随机生成0 1 2
            int number=d.nextInt(3);
            switch(number){
                case 0:
                    System.out.println(getCard1());break;
                case 1:
                    System.out.println(getCard2());break;
                case 2:
                    System.out.println(getCard3());
            }
        }
    }
}