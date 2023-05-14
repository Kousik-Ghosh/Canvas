import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;


/* BST 
 * add, remove, and search -> O(log(n))
 * Iterator: In-order
 * Duplicate - not allowed
 */
public class Set_TreeSet {

    static TreeSet<Integer> ts = new TreeSet<>();
    static void run(){

        Integer[] arr = new Integer[]{3,60,55};
        ts = new TreeSet<>(Arrays.asList(arr));
        print();
    
        
        
    }

    static void print(){
        Iterator<Integer> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }  
}
