import java.util.Arrays;
import java.util.HashSet;

@SuppressWarnings(value = "unused")
class Set_HashSet{

    static HashSet<Integer> set = new HashSet<>();
    static void run(){

        Integer[] arr = new Integer[]{2,3,4,55,6,223,342,4556};
        set = new HashSet<>(Arrays.asList(arr));
        

        /* add */
        set.add(10);

        
        /* get */
        Boolean contains = set.contains(10);


        /* delete */
        set.remove(10);


        /* miscellaneous */
        int size               = set.size();
        Boolean empty          = set.isEmpty();
        set.clear();
        

        /* Sort & Search */
         // Not applicable because .get(key) is O(1)

    }

    static void print(){
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}