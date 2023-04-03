import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ExamleSynchronised implements Runnable{

    ReentrantLock rl = new ReentrantLock();
    Condition cnd = rl.newCondition();

    synchronized void criticalCode() throws InterruptedException{
    
        System.out.println("Lock-By::"+Thread.currentThread().getName());
        
        //Condition{.}.await(); -> wait();
        //Condition{.}.signalAll(); -> notifyAll();
        
    }

    @Override
    synchronized public void run() {

        try {
            criticalCode();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done-Critical::"+Thread.currentThread().getName());
    }

}
