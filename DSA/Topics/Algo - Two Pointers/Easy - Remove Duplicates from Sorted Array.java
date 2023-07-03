/* https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/ */

class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums.length == 1){
            return 1;
        }

        int ansPointer = 1;
        for(int traversalPointer = 1; traversalPointer < nums.length; traversalPointer++){
            if(nums[traversalPointer-1] != nums[traversalPointer]){
                nums[ansPointer++] = nums[traversalPointer];
            }
        }
        return ansPointer;
    }
}