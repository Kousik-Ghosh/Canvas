import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings( value = "unused")
public class Map_HashMap {
    

    static HashMap<Integer,String> hashMap = new HashMap<Integer,String>();

    static void run(){  
        
        int key = 3;
        String value = "kousik";

        /* add */
        hashMap.put(key, value);


        /* get */
        value = hashMap.get(key);

        for(Map.Entry<Integer,String> entry : hashMap.entrySet()) {
             key   = entry.getKey();
             value = entry.getValue();
        }

        for (int x : hashMap.keySet()) {
            key = x;
        }
        for (String y : hashMap.values()) {
            value = y;
        }


        /* delete */
        hashMap.remove(key);
        hashMap.remove(key, value);


         /* miscellaneous */
        int size               = hashMap.size();
        Boolean isKeyPresent   = hashMap.containsKey(key);
        Boolean isValuePresent = hashMap.containsValue(value);
        Boolean empty          = hashMap.isEmpty();
         
 
 
         /* Sort & Search */
         // Not applicable because .get(key) is O(1)

    }

    static void print(){

    }
}
