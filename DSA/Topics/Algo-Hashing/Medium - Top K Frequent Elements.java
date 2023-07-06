/* https://leetcode.com/problems/top-k-frequent-elements/description/ */

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }   
        }

        int p = 0;
        int[][] ans = new int[map.size()][2];
        for(int key : map.keySet()){
            ans[p][0] = key;
            ans[p][1] = map.get(key);
            p++;
        }

        int[] anss = new int[k];
        Arrays.sort(ans, (a,b) -> {return b[1]-a[1];});
        for(int j = 0; j < k; j++){
            anss[j] = ans[j][0];
        }

        return anss;

    }
}


/* best approach is a version of bucket sort
 * 
 * But above simply count each occurance in hashmap
 * convert hashmap to 2-d array
 * sort descinding order on coloum 2
 * retun till k of first coloum
*/