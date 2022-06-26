package Thread_safe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//这是一个账户对象
public class Counnet {
    private Double money;
    private final Lock r=new ReentrantLock();
    public Counnet() {
    }

    public Counnet(Double money) {
        this.money = money;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public void updateMoney(Double d) {
        //得到当前线程的名字
        String name=Thread.currentThread().getName();
       // synchronized (this) {

        r.lock();//上锁
           try{
               if(this.money>=d){
                   System.out.println(name+"来取钱，吐出"+d);
                   this.money-=d;
                   System.out.println(name+"来取钱，剩余"+money);
               }else{
                   System.out.println(name+"来取钱"+d+"余额不足");
                   //}
               }
           }finally {
               r.unlock();//解锁
           }
    }
}
