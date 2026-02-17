import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
 
        
        HashMap<Integer, Character> hs = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            hs.put(nums1[i], 'F');
        }

        for (int i = 0; i < nums2.length; i++) {
            if (hs.containsKey(nums2[i])) {
                hs.put(nums2[i], 'S');
            }
        }

        List<Integer> ll = new ArrayList<>();
        for (Map.Entry<Integer, Character> entry : hs.entrySet()) {
            if (entry.getValue() == 'S') {
                ll.add(entry.getKey());
            }
        }

        return ll.stream().mapToInt(i -> i).toArray();

    }
}