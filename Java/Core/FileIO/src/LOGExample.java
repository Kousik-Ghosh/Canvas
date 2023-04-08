import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Date;

public class LOGExample {
    public static void main(String[] args) throws Exception {
        
        /* Append to a file with existing content */

        String filePath = "/Users/kousik/Desktop/Mind Canvas/Java/Core/FileIO/src/LOG.txt";
        FileWriter fileWriter = new FileWriter(new File(filePath), true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.newLine();
        bufferedWriter.write(new Date().toString());
        bufferedWriter.close();

        

    }
}
