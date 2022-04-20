package Damo;

public class Test {

    public static void main(String[] args) {

        String number ="123456789";

        int len=number.length();
        System.out.println(len);

        char numberch=number.charAt(0);
        System.out.println(numberch);

        char [] arr=new char[10];
        arr=number.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String num1=number.substring(1,8);
        String num2=number.substring(1);
        System.out.println(num1);
        System.out.println(num2);

        String number1=number.replace("1","0");
        System.out.println(number1);
        
        boolean bijiao=number.equals(number1);
        System.out.println(bijiao);

        boolean flog =number1.contains("9");
        System.out.println(flog);
    }

}
class Outer{
    static class Inner{

    }
    public class Inner2{
        
    }
}
