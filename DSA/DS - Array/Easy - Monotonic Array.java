class Solution {
    public boolean isMonotonic(int[] nums) {
        int i = 0;
        int l = nums.length;
        boolean mi = true, md = true;
        while (i < l - 1) {
            if (nums[i] > nums[i+1]) {
                mi = false;
            }
            if (nums[i] < nums[i+1]) {
                md = false;
            }
            i++;
        }
        return mi || md;
    }
}