import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class ReadAsByteStream {
    

    static void Read() throws Exception{
        int readingCharAsInt;
        StringBuilder s = new StringBuilder();
        String filePath = "/Users/kousik/Desktop/Mind Canvas/Java/Core/FileIO/src/input.txt";
        

                                /* SUB-CLASSES OF InputStream (Byte Stream)*/

        /* FileInputStream */
        FileInputStream r1 = new FileInputStream(new File(filePath)); 
        while ((readingCharAsInt = r1.read()) != -1) {
            s.append((char) readingCharAsInt);
        }
        System.out.println(s);



        BufferedInputStream r2 = new BufferedInputStream(new FileInputStream(new File(filePath)));
        s.delete(0, s.length());
        while ((readingCharAsInt = r2.read()) != -1) {
            s.append((char) readingCharAsInt);
        }
        System.out.println(s);



        
    }


}
