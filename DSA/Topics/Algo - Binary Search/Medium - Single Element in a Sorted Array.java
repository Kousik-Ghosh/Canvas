class Solution{
    public int singleNonDuplicate(int[] nums) {
        
        if(nums.length == 1){
          return nums[0];
        }
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
          int mid = (right+left)/2;

          if(mid == 0){
            if(nums[mid] != nums[mid+1]){
              return nums[mid];
            }
          }
          if(mid == nums.length - 1){
            if(nums[mid] != nums[mid-1]){
              return nums[mid];
            }
          }
          if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
            return nums[mid];
          }

          if(mid > 0 && mid < nums.length){
            if(mid % 2 == 0){
              if(nums[mid] == nums[mid+1]){
                left = mid + 1;
              }else{
                right = mid -1;
              }
            }
            if(mid % 2 != 0){
              if(nums[mid-1] == nums[mid]){
                left = mid + 1;
              }else{
                right = mid -1;
              }
            }
          }
         


        }

        return -1;


    }
}