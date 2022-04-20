package com.test.d7;

public class Test {
    public static void main(String[] args) {
        int len= args.length;
        if(len==0){
            System.out.println("无运行参数");
        }else if(len>0){
            for(int i=0;i< args.length;i++){
                System.out.println(args[i]);
            }
        }
    }
}
