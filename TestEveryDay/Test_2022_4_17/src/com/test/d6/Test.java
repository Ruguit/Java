package com.test.d6;

public class Test {
    public static void main(String[] args) {
        JuXing j=new JuXing(2.2,2);
        System.out.println(j.MianJi());
    }
}

class JuXing {
    private double chang;
    private double kuan;

    public JuXing(){}
    public JuXing(double chang, double kuan) {
        this.chang = chang;
        this.kuan = kuan;
    }

    public void setChang(double chang) {
        this.chang = chang;
    }

    public void setKuan(double kuan) {
        this.kuan = kuan;
    }
    public double MianJi(){
        return chang*kuan;
    }
}
