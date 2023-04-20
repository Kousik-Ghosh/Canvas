import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList_NTS {

    static int[] arr = new int[]{4,5,34,2,1,55};
    static ArrayList<Integer> listOfIntegers = new ArrayList<Integer>();

    static void run(){

        
        
        Integer[] arrInteger = new Integer[arr.length];
        Arrays.setAll(arrInteger, i -> arr[i]);
        listOfIntegers = new ArrayList<Integer>(List.of(arrInteger));
        

        int pos = 5;
        listOfIntegers.add(100);
        listOfIntegers.add(pos, 200);
        listOfIntegers.set(pos-1, 300);
        listOfIntegers.remove(pos);
        

        int size         = listOfIntegers.size();
        pos              = listOfIntegers.indexOf(34);
        Boolean contains = listOfIntegers.contains(34);
        Boolean empty    = listOfIntegers.isEmpty();
        

        Collections.sort(listOfIntegers);
        pos = Collections.binarySearch(listOfIntegers,34);
        Collections.sort(listOfIntegers, Collections.reverseOrder());
    
        
        arr = listOfIntegers.stream().mapToInt(i -> i).toArray();

        listOfIntegers.clear();
    }

    static void print(){
        System.out.println("-------");
        for (Integer integer : listOfIntegers) {
            System.out.println(integer);
        }
    }
}