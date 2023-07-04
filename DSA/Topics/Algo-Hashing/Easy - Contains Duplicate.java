/* https://leetcode.com/problems/contains-duplicate/ */

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }else{
                return set.contains(nums[i]);
            }
        }
    return false;
    }
}