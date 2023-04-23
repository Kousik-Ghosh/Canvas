import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

@SuppressWarnings( value = "unused")
public class Map_LinkedHashMap {
    
    static LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
    static void run(){

        int key = 3;
        String value = "kousik";

        /* add */
        lhm.put(key, value);


        /* get */
        value = lhm.get(key);

        for(Map.Entry<Integer,String> entry : lhm.entrySet()) {
            key   = entry.getKey();
            value = entry.getValue();
        }

        for (int x : lhm.keySet()) {
           key = x;
        }
        for (String y : lhm.values()) {
           value = y;
        }

        /* delete */
        lhm.remove(key);
        lhm.remove(key, value);


         /* miscellaneous */
        int size               = lhm.size();
        Boolean isKeyPresent   = lhm.containsKey(key);
        Boolean isValuePresent = lhm.containsValue(value);
        Boolean empty          = lhm.isEmpty();
         
 
 
         /* Sort & Search */
         // Not applicable because .get(key) is O(1)

    }

    static void print(){

    }
}
