import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;


public class ReadAsCharacterStream {
    

    static void Read() throws Exception{
        int readingCharAsInt;
        StringBuilder s = new StringBuilder();
        String filePath = "/Users/kousik/Desktop/Mind Canvas/Java/Core/FileIO/src/input.txt";
        

                                /* SUB-CLASSES OF Reader (Character Stream)*/


        /* InputStreamReader */
        InputStreamReader r1 = new InputStreamReader(new FileInputStream(new File(filePath)));
        while ((readingCharAsInt = r1.read()) != -1) {
            s.append((char) readingCharAsInt);
        }
        System.out.println(s);


        /* FileReader */
        FileReader r2 = new FileReader(new File(filePath));
        s.delete(0, s.length());
        while ((readingCharAsInt = r2.read()) != -1) {
            s.append((char) readingCharAsInt);
        }
        System.out.println(s);



        /* BufferedReader */
        BufferedReader r3 = new BufferedReader(new FileReader(new File(filePath)));
        s.delete(0, s.length());
        String ts;
        while ((ts = r3.readLine()) != null) {
            s.append(ts);
        }
        System.out.println(s);
    }


}
