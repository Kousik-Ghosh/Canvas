import java.util.Arrays;
import java.util.LinkedHashSet;

public class Set_LinkedHashSet {

    static LinkedHashSet<Integer> linkedset= new LinkedHashSet<>();
    static void run(){

        Integer[] arr = new Integer[]{3,2,55,1,0,88,456,224,5,1,5,1};
        linkedset = new LinkedHashSet<>(Arrays.asList(arr));
        print();
    }

    static void print(){
        for (Integer integer : linkedset) {
            System.out.println(integer);
        }
    }  
}
