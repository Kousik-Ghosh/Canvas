import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class BufferedWriterCharacter {

    public static void main(String[] args) throws Exception {
        String filePath = "/Users/kousik/Desktop/Mind Canvas/Java/Core/FileIO/src/output.txt";
        BufferedWriter bfw = new BufferedWriter(new FileWriter(new File(filePath)));

        bfw.write(97);
        bfw.newLine();
        bfw.write("kousik ghosh");
        bfw.newLine();
        char[] arr = new char[]{'s','o','s'};
        bfw.write(arr);
        bfw.flush();

        /* append does not work as expected */
        bfw.newLine();
        bfw.append('e');
        bfw.flush();


        bfw.close();
    }
}
