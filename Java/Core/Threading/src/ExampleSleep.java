public class ExampleSleep implements Runnable{


    @Override
    public void run() {

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
            }
        }

    }
    
}
