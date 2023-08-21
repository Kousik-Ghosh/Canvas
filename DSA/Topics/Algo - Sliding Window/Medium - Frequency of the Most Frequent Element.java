/* https://leetcode.com/problems/frequency-of-the-most-frequent-element/description/ */

class Solution {
    public int maxFrequency(int[] nums, int k) {
        
        Arrays.sort(nums);

        int left = 0;
        int right = 0;
        long sum = 0;
        int maxWindow = 0;
        while(left <= right && right < nums.length){

            if(nums[right]*(right-left) <= sum+k){
                sum = sum + nums[right];
                maxWindow = Math.max(maxWindow, right - left);
                right++;
            }else{
                sum = sum - nums[left];
                left++;
            }


        }

        return maxWindow+1;

    }
}