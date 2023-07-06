/* https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/ */
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int left = Integer.MIN_VALUE;
        int right = 0;
        for(int i = 0; i < weights.length; i++){
            left = Math.max(weights[i], left);
            right = right + weights[i];
        }

        while(left <= right){
            int mid = (left + right) / 2;

            int daysNeeded = 1; int totalWeightThatDay = 0;
            for(int i = 0; i < weights.length; i++){
                if(totalWeightThatDay + weights[i] > mid){
                    totalWeightThatDay = 0;
                    daysNeeded++;
                }
                totalWeightThatDay += weights[i]; 
            }

            if(daysNeeded > days){
                left = mid + 1;
            }else{  
                right = mid -1;
            }

        }

        return left;


    }
}