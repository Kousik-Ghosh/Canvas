/* https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/ */

class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length == 2){
            return 2;
        }


        int ansPointer = 2;
        for(int traversalPointer = 2; traversalPointer < nums.length; traversalPointer++){
            if(nums[ansPointer-2] != nums[traversalPointer]){
                nums[ansPointer++] = nums[traversalPointer];
            }
        }
        return ansPointer;

    }
}