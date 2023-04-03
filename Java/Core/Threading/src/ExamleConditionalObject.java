import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ExamleConditionalObject implements Runnable{

    ReentrantLock rl = new ReentrantLock();
    Condition cnd = rl.newCondition();

    void criticalCode() throws InterruptedException{
        rl.lock();
        System.out.println("Lock-By::"+Thread.currentThread().getName());
        try {
            
            if(Thread.currentThread().getName().equals("Thread-0")){
                System.out.println("Await-By::"+Thread.currentThread().getName());
                cnd.await();
                System.out.println("Await-Resume-By::"+Thread.currentThread().getName());
            }else{
                System.out.println("Signalling-By::"+Thread.currentThread().getName());
                cnd.signalAll();
            }

        } finally {
            System.out.println("UnLock-By::"+Thread.currentThread().getName());
            rl.unlock();
        }
        
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
