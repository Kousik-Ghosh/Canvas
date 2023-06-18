class Solution{
    public int[] sortedSquares(int[] nums) {
        
        int left = 0; 
        int right = nums.length - 1;
        int[] ans = new int[nums.length];
        int i = nums.length -1;
        while(left <= right){
            if(Math.abs(nums[left]) < Math.abs(nums[right])){
                ans[i] = nums[right] * nums[right];
                right--; i--;
            }
            else{
                ans[i] = nums[left] * nums[left];
                i--;
                left++; 
            }
        }

        return ans;

    }
}