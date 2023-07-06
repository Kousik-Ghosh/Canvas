/* https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/ */

class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        if(nums.length == 1 && target == nums[0]){
            return new int[]{0, 0};
        }
        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            int mid = (left+right)/2;
            if(nums[mid] == target){

                int li = mid;
                int ri = mid;
                while(li >= 0 && nums[li] == target){
                    li--;
                }
                while(ri <= nums.length-1 && nums[ri] == target){
                    ri++;
                }

                return new int[]{li+1, ri-1};

            }
            if(nums[mid] < target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }


        return new int[]{-1, -1};
    }
}