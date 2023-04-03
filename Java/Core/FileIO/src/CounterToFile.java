import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class CounterToFile {
    
    public static void startCounter() {
        String filePath = "/Users/kousik/Desktop/Mind Canvas/Java/Core/FileIO/src/output.txt";


        Runnable r = () -> {
            BufferedWriter w4;
            for (int i = 0; i < 10; i++) {
                try {
                    w4 = new BufferedWriter(new FileWriter(new File(filePath)));
                    w4.write(""+i);
                    w4.flush();
                    w4.close();
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        new Thread(r).start();


        System.out.println("Main::End");
    }
}
