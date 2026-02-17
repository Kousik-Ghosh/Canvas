class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int left = 1;
        int right = 0;
        for(int i = 0; i < piles.length; i++){
            right = Math.max(right, piles[i]);
        }
        if(piles.length == h){
            return right;
        }

        int mid = (right+left)/2;
        int ans = Integer.MAX_VALUE;
        while(left <= right){
            mid = (right+left)/2;

            double totalHour = 0;
            for(int i = 0; i < piles.length; i++){
                double pph = Math.ceil((double) piles[i] / mid);
                totalHour = totalHour + pph;
            }

            if(totalHour <= h){
                ans = Math.min(ans, mid);  
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return ans;


    }
}