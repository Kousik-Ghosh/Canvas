import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

@SuppressWarnings( value = "unused")
public class LinkedList_List{

    static LinkedList<Integer> ll = new LinkedList<Integer>();

    static void run(){
        /* Array to Collections */
        int[] arrInt = new int[]{4,5,33,56,99,167};
        for (int i : arrInt) {
            ll.add(i);
        }
        ll.clear();


        /* Wrapper-Array to Collections */
        Integer[] arrInteger = new Integer[]{45,2,44,222,567,67,0,56,1,44};
        ll = new LinkedList<Integer>(Arrays.asList(arrInteger));
        

        /* Add */
        int pos = 5;
        ll.addFirst(1000);
        ll.addLast(1000);
        ll.add(pos, 300);


        
        /* get */
        ll.get(pos);
        ll.getFirst();
        ll.getLast();


        /* delete */
        ll.remove(pos);
        ll.remove(ll.indexOf(44));
        ll.removeFirst();
        ll.removeLast();


        /* miscellaneous */
        int         size =  ll.size();
        Boolean contains =  ll.contains(2);
        int        index =  ll.indexOf(44);
        Boolean    empty =  ll.isEmpty();
        
    
        /* Sort & Search */
        Collections.sort(ll);
        pos = Collections.binarySearch(ll,222);
        Collections.sort(ll, Collections.reverseOrder());


        
        /* Iterating */
        ListIterator<Integer> li = ll.listIterator();
        while (li.hasNext()) {
            int value = li.next();
        }
        while (li.hasPrevious()) {
            int value = li.previous();
        }


        /* Collection to Wrapper-Array */
        arrInteger = new Integer[ll.size()];
        ll.toArray(arrInteger);

        /* Collection to Array */
        arrInt = new int[ll.size()];
        for (int j = 0; j < arrInt.length; j++) {
            arrInt[j] = ll.get(j);
        }
        
    }

    static void print(){
        System.out.println("----------");
        Iterator<Integer> iter = ll.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next()+" ");
        }
        System.out.println();
    }

}