package com.yangyang.d6_abstract_TuXing2;

public abstract class TuX {
    /*得到周长的抽象类
    * */
    abstract void C();
}
class SanJiaoX extends TuX{
    private Double x;
    private Double y;
    private Double z;

    public SanJiaoX() {
    }

    public SanJiaoX(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    @Override
    void C() {
        if(Bang.PanDuan(x,y,z)){
            System.out.println("周长是"+(x+y+z));
            return;
        }
        System.out.println("不能构成三角型");
    }

}