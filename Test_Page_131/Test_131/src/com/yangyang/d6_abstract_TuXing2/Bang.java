package com.yangyang.d6_abstract_TuXing2;
/*工具类
* */
public class Bang {
    //判断是否是三角形
    public static Boolean PanDuan(Double x, Double y, Double z) {
        if(x+y>z&&x+z>y&&y+z>x){
            return true;
        }else {
            return false;
        }
    }
}
