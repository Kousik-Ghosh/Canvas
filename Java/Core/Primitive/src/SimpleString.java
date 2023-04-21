public class SimpleString {
    static void run(){

        String s = "kousik";
        char[] arr = s.toCharArray();
        for (char c : arr) {
            System.out.println(c);
        }

        char c = s.charAt(2);
        System.out.println("Character at position 2: "+c);

        int pos = s.indexOf('i');
        System.out.println("Position of character 'i' :"+pos);

        pos = s.indexOf("si");
        System.out.println("Position of string 'si' :"+pos);

    }
}
