public class ExamplePriority implements Runnable{


    @Override
    public void run() {

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 10000; j++) {
                System.out.println(Thread.currentThread().getName());
            }
        }

    }
    
}
