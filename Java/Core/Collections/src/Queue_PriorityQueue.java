import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;


/* 
 * by default min heap.
 */
public class Queue_PriorityQueue {

    static PriorityQueue<Integer> pQueue = new PriorityQueue<>();
    static void run(){

        Integer[] arr = new Integer[]{3,60,55};
        pQueue = new PriorityQueue<>(Arrays.asList(arr));

        Iterator<Integer> itr = pQueue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        
    }

    static void print(){
        while (!pQueue.isEmpty()) {
            System.out.println(pQueue.peek());
            pQueue.poll();
        }
    }  
}
