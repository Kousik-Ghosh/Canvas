import java.util.ArrayList;
import java.util.List;

public class LinkedList {

    static List<Integer> listOfInteger = new ArrayList<Integer>();

    static void run(){

        
        listOfInteger.add(2);
        listOfInteger.add(2);
        listOfInteger.add(2);
        listOfInteger.add(2);




    }


    static void print(){
        for (Integer integer : listOfInteger) {
            System.out.println(integer);
        }
    }
}
