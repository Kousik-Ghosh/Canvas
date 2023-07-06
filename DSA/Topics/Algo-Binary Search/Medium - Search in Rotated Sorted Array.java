/* https://leetcode.com/problems/search-in-rotated-sorted-array/description/ */

class Solution {
    public int search(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length-1;


        while(left <= right){
            int mid = (left+right)/2;

            if(nums[mid] == target){
                return mid;
            }


            // mid landed on left sorted array
            if(nums[left] <= nums[mid]){

                // now, the target can be on the remaining left sorted array
                //  OR  it can be on the right sorted array
                if(target > nums[mid] || target < nums[left]){
                    left = mid + 1;
                }else{
                    right = mid -1;
                }

            }else{ // mid landed on right sorted array
                if(target < nums[mid] || target > nums[right]){
                    right = mid -1;
                }else{
                    left = mid + 1;
                }
            }
        }

        return -1;



    }
}