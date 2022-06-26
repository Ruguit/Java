package Thread_safe;

public class MoneyThread extends Thread{
    private Counnet counnet;
    public MoneyThread(Counnet counnet,String name){
        super(name);
        this.counnet=counnet;
    }
    @Override
    public void run(){
        counnet.updateMoney(1000.0);
    }
}
