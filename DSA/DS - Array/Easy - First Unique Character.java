import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;

class Solution {
    public int firstUniqChar(String s) {
 
            int stringLength = s.length();
            HashSet<Character> visited = new HashSet<>();
            LinkedHashMap<Character, Integer> visitedOrderWithPosition = new LinkedHashMap <>();

            for (int i = 0; i < stringLength; i++) {
                if (!visited.contains(s.charAt(i))) {
                    visited.add(s.charAt(i));
                    visitedOrderWithPosition.put(s.charAt(i),i);
                }else{
                    visitedOrderWithPosition.remove(s.charAt(i));
                }
            }

            if (!visitedOrderWithPosition.isEmpty()) {
                return new ArrayList<Integer>(visitedOrderWithPosition.values()).get(0);
            }
            return -1;


    }
}