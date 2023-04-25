import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

@SuppressWarnings( value = "unused")
public class LinkedList_Queue{

    static Queue<Integer> queue = new LinkedList<Integer>();

    static void run(){  
        /* Array to Collections */
        int[] arrInt = new int[]{4,5,33,56,99,167};
        for (int i : arrInt) {
            queue.offer(i);
        }
        queue.clear();

        /* Wrapper-Array to Collections */
        Integer[] arrInteger = new Integer[]{45,2,44,222,567,67,0,56,1};
        queue = new LinkedList<Integer>(Arrays.asList(arrInteger));
        

        /* Add */
        queue.offer(1000); //end

        /* get */
        queue.peek(); //head
        

        /* delete */
        queue.poll(); //head
        

        /* miscellaneous */
        int         size =  queue.size();
        Boolean contains =  queue.contains(2);
        Boolean    empty =  queue.isEmpty();

        /* Sort & Search */
        // Not Applicable for Queue
    
        
        /* Iterating */
        // Backward itteration not applicable.


        /* Collection to Wrapper-Array */
        arrInteger = new Integer[queue.size()];
        queue.toArray(arrInteger);

        /* Collection to Array */
        arrInt = new int[queue.size()];
        for (int j = 0; j < arrInt.length; j++) {
            arrInt[j] = queue.peek();
        }

    }

    static void print(){
        System.out.println("----------");
        Iterator<Integer> iter = queue.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next()+" ");
        }
        System.out.println();
    }

}