/* https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/description/ */

class Solution {
    public int minimumDifference(int[] nums, int k) {
        
        if(nums.length == 1){
            return 0;
        }
        Arrays.sort(nums);

        int min = Integer.MAX_VALUE;
        int start = nums.length - 1;
        int end = nums.length - k;

        while(end >= 0){
            if(nums[start] - nums[end] < min){
                min = nums[start] - nums[end];
            }
            start--;
            end--;
        }
        return min;
    }
}