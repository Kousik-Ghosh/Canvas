/* https://leetcode.com/problems/merge-sorted-array/description/ */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int x = m-1;
        int y = n-1;

        for(int i = m+n-1; i >= 0; i--){
            if(x >= 0 && y >= 0){
                nums1[i] = nums1[x] >= nums2[y] ? nums1[x--] : nums2[y--];
            }else if(x >= 0){
                nums1[i] = nums1[x--];
            }else{
                nums1[i] = nums2[y--];
            }
        }

    }
}