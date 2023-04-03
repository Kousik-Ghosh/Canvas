import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class WriteAsByteStream {
    

    static void Write() throws Exception{

        Byte b;
        String filePath = "/Users/kousik/Desktop/Mind Canvas/Java/Core/FileIO/src/output.txt";
        

                                /* SUB-CLASSES OF InputStream (Byte Stream)*/

        /* FileOutputStream */
        FileOutputStream w1 = new FileOutputStream(new File(filePath)); 
        b = (byte) 'K'; 
        w1.write(b);


        /* BufferedOutputStream */
        BufferedOutputStream w2 = new BufferedOutputStream(new FileOutputStream(new File(filePath)));
        w2.write((byte) 'G');
        w2.close();



        
    }


}
