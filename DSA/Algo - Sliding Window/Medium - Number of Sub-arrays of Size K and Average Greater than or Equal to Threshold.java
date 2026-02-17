/* https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/ */

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int[] sum = new int[arr.length];
        sum[0] = arr[0];
        for(int i = 1; i < sum.length; i++){
            sum[i] = sum[i-1] + arr[i];
        }

        int count = 0;
        for(int i = k-1; i < sum.length; i++){
            if(i == k-1){
                if(sum[i]/k >= threshold){
                    count++;
                }
            }else if((sum[i]-sum[i-k])/k >= threshold){
                count++;
            }
        }

        return count;

    }
}