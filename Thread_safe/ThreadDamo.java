package Thread_safe;

public class ThreadDamo {
    public static void main(String[] args) {
        //共享的账户对象
        Counnet counnet=new Counnet(1000.0);
        //创建两个线程对象 并改名字，将账户对象传入
        new MoneyThread(counnet,"一号").start();
        new MoneyThread(counnet,"二号").start();
    }
}
