/* https://leetcode.com/problems/array-with-elements-not-equal-to-average-of-neighbors/description/ */

class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int[] ans = new int[nums.length];
        Arrays.sort(nums);

        int pos = 0;
        int i = 0;
        while(pos < nums.length){
            ans[pos] = nums[i++];
            pos = pos + 2;
        }

        pos = 1;
        while(pos < nums.length){
            ans[pos] = nums[i++];
            pos = pos + 2;
        }

        return ans;



    }
}


/* 
 * first sort the array
 * make each index left and right less than it.
 * i.e if left and right is less then avg will be less.
 * traverse the array
 * put each value in alternate pos in new array
 * 0,2,4,6,8..
 * 1,3,5,7,9
 * 
*/