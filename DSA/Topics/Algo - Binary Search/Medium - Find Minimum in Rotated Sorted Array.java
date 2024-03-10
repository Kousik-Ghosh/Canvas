/* https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/ */

class Solution {
    public int findMin(int[] nums) {
        
        if(nums.length == 1 || nums[0] < nums[nums.length-1]){
            return nums[0];
        }


        int left = 0;
        int right = nums.length-1;


        while(left < right){

            int mid = left+(right-left)/2;

            //JUST THINK ABOUT THE FIRST LOOP OTHER WILL FALL IN LINE

            //if mid is lesser than right it means you are in right sub-part. 
            //Thus shift right to mid. cause you do not wanna over shoot

            if(nums[mid] < nums[right]){
                right = mid;
            }else{   // if mid is greater than right it means you are in left sub-part. were u dont wanna be. get out of it.
                left = mid+1;
            }

        }

        return nums[left];
        
    }
}