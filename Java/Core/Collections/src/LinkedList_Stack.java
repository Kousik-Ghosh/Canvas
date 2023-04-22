import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

@SuppressWarnings( value = "unused")
public class LinkedList_Stack{

    static LinkedList<Integer> stack = new LinkedList<Integer>();

    static void run(){  
        /* Array to Collections */
        int[] arrInt = new int[]{4,5,33,56,99,167};
        for (int i : arrInt) {
            stack.offer(i);
        }
        stack.clear();

        /* Wrapper-Array to Collections */
        Integer[] arrInteger = new Integer[]{45,2,44,222,567,67,0,56,1};
        stack = new LinkedList<Integer>(Arrays.asList(arrInteger));
        

        /* Add */
        stack.offer(1000);      //end

        /* get */
        stack.peekLast();   // end

        /* delete */
        stack.pollLast();   // end

        /* miscellaneous */
        int         size =  stack.size();
        Boolean contains =  stack.contains(2);
        int        index =  stack.indexOf(44);
        Boolean    empty =  stack.isEmpty();

        /* Sort & Search */
        Collections.sort(stack);
        int pos = Collections.binarySearch(stack,222);
        Collections.sort(stack, Collections.reverseOrder());
    
        /* Iterating */
        ListIterator<Integer> li = stack.listIterator();
        while (li.hasNext()) {
            int value = li.next();
        }
        while (li.hasPrevious()) {
            int value = li.previous();
        }


        /* Collection to Wrapper-Array */
        arrInteger = new Integer[stack.size()];
        stack.toArray(arrInteger);

        /* Collection to Array */
        arrInt = new int[stack.size()];
        for (int j = 0; j < arrInt.length; j++) {
            arrInt[j] = stack.get(j);
        }

    }

    static void print(){
        System.out.println("----------");
        Iterator<Integer> iter = stack.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next()+" ");
        }
        System.out.println();
    }

}