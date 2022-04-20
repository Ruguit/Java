package com.yangyang.d8;

public class Number implements Changeable{
    private int adds;
    private int reduces;

    public Number(){}
    public Number(int adds, int reduces) {
        this.adds = adds;
        this.reduces = reduces;
    }

    public int getAdds() {
        return adds;
    }

    public void setAdds(int adds) {
        this.adds = adds;
    }

    public int getReduces() {
        return reduces;
    }

    public void setReduces(int reduces) {
        this.reduces = reduces;
    }

    @Override
    public void add() {
        System.out.println("景区进来了"+adds+"量车");
    }

    @Override
    public void reduce() {
        System.out.println("景区出去了"+reduces+"量车");
    }
}
