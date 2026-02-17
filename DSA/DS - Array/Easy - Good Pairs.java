import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numIdenticalPairs(int[] nums) {
                HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int v = hmap.getOrDefault(nums[i], 0);
            hmap.put(nums[i], v+1);
        }
        int sum = 0;
        for (Map.Entry<Integer, Integer> h : hmap.entrySet()) {
            if (h.getValue() > 1) {
                int x = (h.getValue() * (h.getValue()-1) ) / 2;
                sum = sum + x;
            }
        }
        return sum;
    }
}