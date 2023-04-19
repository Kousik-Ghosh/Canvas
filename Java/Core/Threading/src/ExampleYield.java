public class ExampleYield implements Runnable{

    /* The yield() basically means that the thread is not 
       doing anything particularly important and if any other 
       threads or processes need to be run, they should run. 
       Otherwise, the current thread will continue to run. */

    @Override
    public void run() {

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 50; j++) {
                
                if(j == 25){
                    System.out.println("YIELD:: "+Thread.currentThread().getName());
                    Thread.yield();
                }
                System.out.println("Doing Something..");
            }
        }

    }
    
}
