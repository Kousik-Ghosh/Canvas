/* https://leetcode.com/problems/longest-consecutive-sequence/description/ */

class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }

        int ans = -1;
        for (int i = 0; i < nums.length; i++) {
            
            if(!hs.contains(nums[i]-1)){
                int nextContNumber = nums[i]+1;
                int localMax = 0;
                while(hs.contains(nextContNumber)){
                    localMax++;
                    nextContNumber++;
                }
                if(localMax > ans){
                    ans = localMax;
                }
            }


        }

        return ans+1;




    }
}

/* put input array into hashset
 * for each value check whether value-1 exists
 *      if does not, it means it is the start element
 *          from where on, incriment by 1,check in hashset whether it exists
 *          and keep count
 * 
 * return max count
*/