public class ExampleInterrupted implements Runnable{


    @Override
    public void run() {

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 10000; j++) {
                System.out.println(Thread.currentThread().getName());
                System.out.println(Thread.currentThread().isInterrupted());
                if(j == 5000){
                    System.out.println("Throwing InterruptedException & Return");
                    try {
                        throw new InterruptedException();
                    } catch (InterruptedException e) {
                        System.out.println(Thread.currentThread().isInterrupted());
                        return;
                    }
                }
                
            }
        }

    }
    
}
