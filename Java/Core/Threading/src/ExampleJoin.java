public class ExampleJoin implements Runnable{


    @Override
    public void run() {

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.println(Thread.currentThread().getName());
                
                /* NEVER DO THIS.
                 * IT WILL WAIT FOR SELF TO COMPLETE.
                 */
                //Thread.currentThread().join();
                
            }
        }

    }
    
}
