class Solution{

    public static int searchInsert(int[] nums, int target){
      int left = 0;
      int right = nums.length -1;

      while (left <= right) {
         int mid = left + ((right - left)/2);
         if(nums[mid] == target){
            return mid;
         }else if(target < nums[mid]){
            right = mid - 1;
         }else{
            left = mid + 1;
         }
      }
      return left;

   }
}