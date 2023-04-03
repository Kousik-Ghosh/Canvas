import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ExamleSynchronisedBlock implements Runnable{

    ReentrantLock rl = new ReentrantLock();
    Condition cnd = rl.newCondition();

    void criticalCode() throws InterruptedException{
    
        System.out.println("Non-Critical-Access-By::"+Thread.currentThread().getName());

        synchronized(cnd){
            System.out.println("Lock-By::"+Thread.currentThread().getName());
        }
        System.out.println("UnLock-By::"+Thread.currentThread().getName());
        
    }

    @Override
    public void run() {

        try {
            criticalCode();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
