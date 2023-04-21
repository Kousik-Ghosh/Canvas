import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@SuppressWarnings("unused")
public class List_ArrayList {

    static ArrayList<Integer> al = new ArrayList<Integer>();

    static void run(){
        /* Array to Collections */
        int[] arrInt = new int[]{4,5,34,2,1,55};
        for (int i : arrInt) {
            al.add(i);
        }
        al.clear();



        /* Wrapper-Array to Collections */
        Integer[] arrInteger = new Integer[]{4,5,34,2,1,55};
        al = new ArrayList<Integer>(List.of(arrInteger));
        


        /* Add */
        int pos = 5;
        al.add(100);
        al.add(pos, 200);
        al.set(pos-1, 300);



        /* get */
        al.get(pos);



        /* delete */
        al.remove(pos);
        al.remove(al.indexOf(44));



        /* miscellaneous */
        int size         = al.size();
        pos              = al.indexOf(34);
        Boolean contains = al.contains(34);
        Boolean empty    = al.isEmpty();
        


        /* Sort & Search */
        Collections.sort(al);
        pos = Collections.binarySearch(al,34);
        Collections.sort(al, Collections.reverseOrder());
    
        



        /* Iterating */
        ListIterator<Integer> li = al.listIterator();
        while (li.hasNext()) {
            int value = li.next();
        }
        while (li.hasPrevious()) {
            int value = li.previous();
        }




        /* Collection to Wrapper-Array */
        arrInteger = new Integer[al.size()];
        al.toArray(arrInteger);

        /* Collection to Array */
        arrInt = new int[al.size()];
        for (int j = 0; j < arrInt.length; j++) {
            arrInt[j] = al.get(j);
        }
    }

    static void print(){
        System.out.println("----------");
        Iterator<Integer> iter = al.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next()+" ");
        }
        System.out.println();
    }
}