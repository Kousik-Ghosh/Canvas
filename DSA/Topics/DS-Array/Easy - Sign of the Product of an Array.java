/* https://leetcode.com/problems/sign-of-the-product-of-an-array/description/ */

class Solution {
    public int arraySign(int[] nums) {
        int negative = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                negative++;
            }else if(nums[i] == 0){
                return 0;
            }
        }

        if(negative % 2 != 0){
            return -1;
        }else{
            return 1;
        }

    }
}