/* https://leetcode.com/problems/container-with-most-water/description/ */

class Solution {
    public int maxArea(int[] height) {
        
        int start = 0;
        int end = height.length - 1;

        int max = Integer.MIN_VALUE;
        while(start < end){
            int area = (end-start) * Math.min(height[end],height[start]);
            if( area > max){
                max = area;
            }else if(height[start]< height[end]){
                start++;
            }else{
                end--;
            }
        }

        return max;

    }
}