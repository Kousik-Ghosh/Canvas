import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class BufferedWriterCharacter {

    public static void main(String[] args) throws Exception {
        String filePath = "/Users/kousik/Desktop/Mind Canvas/Java/Core/FileIO/src/output.txt";
        BufferedWriter bfw = new BufferedWriter(new FileWriter(new File(filePath), true));

        // bfw.write(97);
        // bfw.newLine();
        // bfw.write("kousik ghosh");
        // bfw.newLine();
        // char[] arr = new char[]{'s','o','s'};
        // bfw.write(arr);
        // bfw.flush();

        /* append works if FileWriter(file, append:true) */
        bfw.newLine();
        bfw.append('e');
        bfw.flush();


        bfw.close();
    }
}
