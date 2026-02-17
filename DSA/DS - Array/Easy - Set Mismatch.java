import java.util.HashSet;

class Solution {
    public int[] findErrorNums(int[] nums) {
            int length = nums.length;
            int idealSum = (length * ( length + 1) ) / 2;
            int actualSum = 0;
            int replacedBy = 0, missing = 0;
            HashSet<Integer> hs = new HashSet<>();

            for (int i = 0; i < nums.length; i++) {
                if(hs.contains(nums[i])){
                    replacedBy = nums[i];
                }else{
                    hs.add(nums[i]);
                }
            }

            for (Integer integer : hs) {
                actualSum += integer; 
            }

            missing = idealSum - actualSum;
            return new int[]{replacedBy, missing};
    }
}