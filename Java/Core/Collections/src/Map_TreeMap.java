import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

@SuppressWarnings(value = "unused")
class Map_TreeMap{

    /* Internal Implementaion is Binary Search tree 
     * Default traversal  DFS:In-Order.
    */
    static TreeMap<Integer, String> treeMap = new TreeMap<>();
    static void run(){


        /* Adding Element */
        treeMap.put(3, "kousik");
        treeMap.put(1, "Ghosh");
        treeMap.put(2, "is");
        treeMap.put(4, "a");
        treeMap.put(6, "Developer");


        int key = 5;
        /* Getting */
        treeMap.get(3);

        treeMap.firstEntry();
        treeMap.lastEntry();

        treeMap.subMap(2, 4);
    
        treeMap.ceilingEntry(key);   //>=
        treeMap.floorEntry(key);     //<=
        
        treeMap.higherEntry(key);    //>
        treeMap.lowerEntry(key);     //<

        for(Map.Entry<Integer, String> m : treeMap.entrySet()){
            m.getKey();
            m.getValue();
        }

        for(int x : treeMap.keySet()){
            System.out.println(x);
        }
    


        /* Deleteing */
        treeMap.remove(3); // maintains tree



        /* miscellaneous */
        int size               = treeMap.size();
        Boolean isKeyPresent   = treeMap.containsKey(key);
        Boolean isValuePresent = treeMap.containsValue("kousik");
        Boolean empty          = treeMap.isEmpty();


        /* Sort & Search */
         // Not applicable because .get(key) is O(1)

        

        /* Sorting based on custom comparator */
        TreeMap<String, String> customSortedtreeMap = new TreeMap<>(new CustomCompare());



        /* New TreeMap from existing HashMap */
        HashMap<Integer, String> hashMap = new HashMap<>();
        TreeMap<Integer, String> treeFromHashMap = new TreeMap<>(hashMap);


    }

    static void print(){
        System.out.println(treeMap);
    }

}

class CustomCompare implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
    
}