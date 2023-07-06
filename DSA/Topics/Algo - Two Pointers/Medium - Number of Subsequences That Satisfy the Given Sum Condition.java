/* https://leetcode.com/problems/number-of-subsequences-that-satisfy-the-given-sum-condition/description/  */


class Solution {
    public int numSubseq(int[] nums, int target) {

        int res = 0, mod = 1000000007, l = 0, r = nums.length - 1;
        
        List<Integer> pre = new ArrayList<>();
        pre.add(1);
        for (int i = 1; i <= nums.length; ++i) {
            pre.add((pre.get(i - 1) << 1) % mod);
        }

        Arrays.sort(nums);

        while (l <= r) {
            if (nums[l] + nums[r] > target) {
                r--;
            } else {
                res = (res + pre.get(r - l)) % mod;
                l++;
            }
        }

        return res;
    }
}

/* 
 * Though it is asking subsequences, it is actual only talikng about it min ad max;
 * so order does not matter, making it subset, and we can sort it;
 * once sorted, for every nums[i] and nums[i+x], given nums[i]+nums[i+x]<=target
 * there can be 2^(x-i) subsequence satidfy the condition
 * thus loop through and add them all
 * 
*/