/* https://leetcode.com/problems/remove-element/ */
import java.util.Arrays;
class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = 1000;
                count++;
            }
        }
        Arrays.sort(nums);
        return nums.length - count;
    }
}