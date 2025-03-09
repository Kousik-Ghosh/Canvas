/* https://leetcode.com/problems/majority-element/description/ */
import java.util.HashMap;
import java.util.Map;
class Solution {
    public int majorityElement(int[] nums) {
                HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int count = hm.get(nums[i]) == null? 0 : hm.get(nums[i]);
            hm.put(nums[i], count+1);
        }

        for (Map.Entry<Integer, Integer> x: hm.entrySet()) {
            if (nums.length / 2 < x.getValue()) {
                return x.getKey();
            }
        }

        return 0;



    }
}