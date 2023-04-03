import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;


public class WriteAsCharacterStream {
    

    static void Write() throws Exception{
        String filePath = "/Users/kousik/Desktop/Mind Canvas/Java/Core/FileIO/src/output.txt";
        

                                /* SUB-CLASSES OF Writer (Character Stream)*/


        /* OutputStreamWriter */
        OutputStreamWriter w1 = new OutputStreamWriter(new FileOutputStream(new File(filePath)));
        w1.write("BY::OutputStreamWriter");
        w1.close();

        Thread.sleep(1000);

        /* FileWriter */
        FileWriter w2 = new FileWriter(new File(filePath));
        w2.write("BY::FileWriter");
        w2.close();

        Thread.sleep(1000);

        /* BufferedWriter */
        BufferedWriter w3 = new BufferedWriter(new FileWriter(new File(filePath)));
        w3.write("BY::BufferedWriter");
        w3.close();


    }


}
