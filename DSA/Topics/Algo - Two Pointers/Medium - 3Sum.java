/* https://leetcode.com/problems/3sum/description/ */


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length-2; i++){
            if(i == 0 || (i > 0 && nums[i-1] != nums[i])){
                
                int start = i+1;
                int end = nums.length-1;
                int target = 0 - nums[i];

                while(start < end){
                    if(nums[start]+nums[end] == target){
                        ArrayList<Integer> tempList = new ArrayList<>();
                        tempList.add(nums[i]);
                        tempList.add(nums[start]);
                        tempList.add(nums[end]);
                        ans.add(tempList);
                        while(start < end && nums[start] == nums[start+1]){
                            start++;
                        }
                        while(start < end && nums[end-1] == nums[end]){
                            end--;
                        }
                        start++;
                        end--;
                    }else if(nums[start]+nums[end] < target){
                        start++;
                    }else{
                        end--;
                    }
                }

            }
        }

        return ans;
    }
}

/* 
 * After sorting, Take the first element and search for next 2 element from second positon till end using 2sum.
 * check that first element is not same as last, if it is, ignore that case.
 * In 2-sum part, while(start==start+1) and while(end-1==end) then start++ and end--, cause we do not want same ans again
 * after that once more start++ and end-- so that we are at not the same number again.
*/