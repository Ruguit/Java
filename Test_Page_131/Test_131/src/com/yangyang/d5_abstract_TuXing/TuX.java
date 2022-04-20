package com.yangyang.d5_abstract_TuXing;

import com.yangyang.d4_TigerRobet.Card;

public  abstract class TuX {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TuX(String color) {
        this.color = color;
    }

    public TuX() {

    }

    public abstract void MianJi();
}
class ChangFangXin extends TuX{
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public ChangFangXin(){
        super();
    }
    public ChangFangXin(String color,int x,int y) {
        super(color);
        this.x=x;
        this.y=y;
    }

    @Override
    public void MianJi() {
        System.out.println( "长是"+x+"宽是"+y+"的"+getColor()+"长方形的面积是："+(getX()*getY()));
    }
}