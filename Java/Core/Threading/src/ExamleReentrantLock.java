import java.util.concurrent.locks.ReentrantLock;

public class ExamleReentrantLock implements Runnable{
    
    ReentrantLock rl = new ReentrantLock();

    void criticalCode(){
        rl.lock();
        System.out.println("Lock-By::"+Thread.currentThread().getName());
        try {
            
        } finally {
            System.out.println("UnLock-By::"+Thread.currentThread().getName());
            rl.unlock();
        }
        
    }

    @Override
    public void run() {
    
        /* Non-critical code*/
        System.out.println("NC::"+Thread.currentThread().getName());
        
        for (int i = 0; i < 100000; i++) {
            for (int j = 0; j < 100000; j++) {
                
            }
        }

        criticalCode();

    }

}
