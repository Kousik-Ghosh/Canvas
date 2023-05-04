import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

@SuppressWarnings( value = "unused")
public class Queue_Deque{

    static Deque<Integer> dqueue = new ArrayDeque<Integer>();

    static void run(){  
        /* Array to Collections */
        int[] arrInt = new int[]{4,5,33,56,99,167};
        for (int i : arrInt) {
            dqueue.offer(i);
        }
        dqueue.clear();

        /* Wrapper-Array to Collections */
        Integer[] arrInteger = new Integer[]{45,2,44,222,567,67,0,56,1};
        dqueue = new LinkedList<Integer>(Arrays.asList(arrInteger));
        

        /* Add */
        dqueue.offerFirst(2000);
        dqueue.offerLast(3000);


        /* get */
        dqueue.peekFirst();
        dqueue.peekLast();
        

        /* delete */
        dqueue.pollFirst();
        dqueue.pollLast();
        

        /* miscellaneous */
        int         size =  dqueue.size();
        Boolean contains =  dqueue.contains(2);
        Boolean    empty =  dqueue.isEmpty();

        /* Sort & Search */
        // Not Applicable for DQueue
        
        /* Iterating  backwards */
        Iterator<Integer> descIter = dqueue.descendingIterator();
        while (descIter.hasNext()) {
            System.out.print(descIter.next()+" ");
        }


        /* Collection to Wrapper-Array */
        arrInteger = new Integer[dqueue.size()];
        dqueue.toArray(arrInteger);

        /* Collection to Array */
        arrInt = new int[dqueue.size()];
        for (int j = 0; j < arrInt.length; j++) {
            arrInt[j] = dqueue.peek();
        }

    }

    static void print(){
        System.out.println("----------");
        Iterator<Integer> iter = dqueue.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next()+" ");
        }
        System.out.println();
    }

}