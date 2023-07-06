/* https://leetcode.com/problems/move-zeroes/description/ */

class Solution {
    public void moveZeroes(int[] nums) {
        
        int insert = 0;
        int runner = 0;

        while(runner < nums.length){
            
            if(nums[runner] != 0){
                int temp = nums[insert];
                nums[insert] = nums[runner];
                nums[runner] = temp;
                insert++;
            }
            runner++;

            
        }


    }
}