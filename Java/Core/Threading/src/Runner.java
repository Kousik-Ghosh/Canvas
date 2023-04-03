

public class Runner{
    public static void main(String[] args) {
       

        /* Basic Implimentation*/
        // Worker worker = new Worker();
        // Thread thread = new Thread(worker);
        // thread.start();


        /* Lambda Implimentation*/
        // Runnable r = () -> {
        //     int counter = 0;
        //     while (counter < 2) {
        //         System.out.println(Thread.currentThread()
        //             .getName());
        //         counter++;
        //         Thread.yield();
        //     }
        // };
        // new Thread(r).start();
        // new Thread(r).start();


        /* Yield */
        // new Thread(new ExampleYield()).start();
        // new Thread(new ExampleYield()).start();
        // new Thread(new ExampleYield()).start();
        // new Thread(new ExampleYield()).start();


        /* Join */
        // ExampleJoin ej = new ExampleJoin();
        // Thread t1 = new Thread(ej);
        // t1.start();
        // try {
        //     /* It will hold the calle main on hold
        //      * for the t1 to join (or complete)
        //     */
        //     t1.join();
        
        //     /* It will hold the calle main on hold for 500 milisecond
        //      * if it finishes whitin that good other wise
        //      * continue with main.
        //     */
        //     //t1.join(500);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }


        // ExampleJoin ej = new ExampleJoin();
        // Thread t1 = new Thread(ej);
        // Thread t2 = new Thread(ej);
        // System.out.println(t1.getState());
        // t1.start();
        // try {
        //     /* It will hold the calle main on hold
        //      * Also, t2.start(); will not take place.
        //      * Thus t1 will finish and only then t2 and main will start.
        //     */
        //     System.out.println(t1.getState());
        //     t1.join();
        //     System.out.println(t1.getState());
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        // t2.start();




        /* Sleep */
        // new Thread(new ExampleSleep()).start();
        
        

        /* Interrupted */
        // new Thread(new ExampleInterrupted()).start();



         /* Priority */
        //  Thread t1 = new Thread(new ExamplePriority());
        //  t1.setPriority(1);
        //  Thread t2 = new Thread(new ExamplePriority());
        //  t2.setPriority(10);

        //  t1.start();
        //  t2.start();
         



        // /* Lock */
        // ExamleReentrantLock erl = new ExamleReentrantLock();
        // new Thread(erl).start();
        // new Thread(erl).start();




        /* Conditional Object */
        // ExamleConditionalObject eco = new ExamleConditionalObject();
        // new Thread(eco).start();
        // new Thread(eco).start();


        /* Synchronised method  */
        // ExamleSynchronised es = new ExamleSynchronised();
        // new Thread(es).start();
        // new Thread(es).start();

        /* Synchronised Block  */
        // ExamleSynchronisedBlock esb = new ExamleSynchronisedBlock();
        // new Thread(esb).start();
        // new Thread(esb).start();


        System.out.println("----Main End----");       
    }

    
   
}
