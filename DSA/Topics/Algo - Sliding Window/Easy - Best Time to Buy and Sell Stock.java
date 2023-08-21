/* https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/ */


class Solution {
    public int maxProfit(int[] prices) {
        
        int[] max = new int[prices.length];
        int maxTillNow = Integer.MIN_VALUE;
        for(int i = prices.length-1; i >= 0; i--){
            if(prices[i] > maxTillNow){
                maxTillNow = prices[i];
                max[i] = prices[i];
            }else{
                max[i] = maxTillNow;
            }
        }


        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++){
            if(max[i] - prices[i-1] > maxProfit){
                maxProfit = max[i] - prices[i-1];
            }
        }

        return maxProfit;

    }
}