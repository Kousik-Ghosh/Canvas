import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Stack;

@SuppressWarnings( value = "unused")
public class Stack_{

    static Stack<Integer> stack = new Stack<Integer>();

    static void run(){  
        /* Array to Collections */
        int[] arrInt = new int[]{4,5,33,56,99,167};
        for (int i : arrInt) {
            stack.push(i);
        }
        stack.clear();

        /* Wrapper-Array to Collections */
        // NA - not defined

        /* Add */
        stack.push(1000);      //end

        /* get */
        stack.peek();   // top

        /* delete */
        stack.pop();   // top

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
        Integer[] arrInteger = new Integer[stack.size()];
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