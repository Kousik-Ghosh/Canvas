import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferedReaderCharacter {

    public static void main(String[] args) throws Exception {
        String filePath;
        BufferedReader bfr;

        // /* Mark(readAheadLimit) Example*/
        // /* File Content */
        // /* {0000000....000000} = 1023 Bytes + newline = 1024 Bytes
        //  * {1111111....111111} = 1023 Bytes + newline = 1024 Bytes
        //  * {2222222....222222} = 1023 Bytes + newline = 1024 Bytes
        // */
        // filePath = "/Users/kousik/Desktop/Mind Canvas/Java/Core/FileIO/src/MarkAndReset.txt";
        // bfr = new BufferedReader(new FileReader(new File(filePath)));
        // String s = "";
        // char c;
        // /* Reading the first 1024 Bytes (0-entire line + newline) */
        // s = bfr.readLine();
        // System.out.println(s.length());

        // /* Marking - markReadAhead of 2048 Bytes - OK*/
        // bfr.mark(2048);
        //             /* OR */
        // /* Marking - markReadAhead of 2047 Bytes - FAIL*/
        // // bfr.mark(2047);

        // /* Reading the next 1024 Bytes (1-entire line + newline) */
        // s = bfr.readLine();
        // System.out.println(s.length());
        // /* Reading the next 1024 Bytes (2-entire line + newline) */
        // s = bfr.readLine();
        // System.out.println(s.length());

        // /* Mark reset - if still exist*/
        // bfr.reset();

        // /* Reading the next 1024 Bytes (1-entire line + newline) - OK/FAIL based on markReadAhead*/
        // s = bfr.readLine();
        // System.out.println(s.length());
        // bfr.close();




        filePath = "/Users/kousik/Desktop/Mind Canvas/Java/Core/FileIO/src/input.txt";
        bfr = new BufferedReader(new FileReader(new File(filePath)));
        
        /* .read() - one character at a time. returns -1 at file end*/
        // while (bfr.ready()) {
        //     System.out.print((char) bfr.read());
        // }
        // bfr.close();

        /* .readLine() - read till the newLine. Excluding newLine. return null at file end*/
        // while (bfr.ready()) {
        //     System.out.print(bfr.readLine());
        // }
        // bfr.close();


        /* .read(arr) - read 10 character at a time */
        // char[] arr = new char[10];
        // while (bfr.ready()) {
        //     bfr.read(arr);
        //     System.out.println(arr);
        // }
        // bfr.close();


        /* .skip(character) - skip 10 character */
        while (bfr.ready()) {
            bfr.skip(10);
            System.out.println(bfr.readLine());
        }
        bfr.close();


        








    }

    
}
