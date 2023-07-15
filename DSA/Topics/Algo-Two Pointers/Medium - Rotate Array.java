/* https://leetcode.com/problems/rotate-array/description/ */

class Solution {
    public void rotate(int[] nums, int k) {
        

        int actualRotaion = k % nums.length;

        rotateUtil(nums, 0, nums.length-1);    //whole array rotate
        rotateUtil(nums, 0, actualRotaion-1);       //from 0-K
        rotateUtil(nums, actualRotaion, nums.length-1);     // from k-array_end
        
        

    }

    static void rotateUtil(int[] nums, int start, int end){

        int temp;
        while(start <= end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp; 
            start++;
            end--;
        }

    }
}