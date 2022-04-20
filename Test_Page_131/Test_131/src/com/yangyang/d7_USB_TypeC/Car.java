package com.yangyang.d7_USB_TypeC;

public class Car implements USBrecharrable,TypeCrecharrable {
    @Override
    public void charge() {
        System.out.println("汽车上的USB与TypeC接口都能给手机充电");
    }
}
