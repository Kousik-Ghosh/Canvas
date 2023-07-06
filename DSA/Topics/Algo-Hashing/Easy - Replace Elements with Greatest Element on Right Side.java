/* https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/ */

class Solution {
    public int[] replaceElements(int[] arr) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        int max = arr[arr.length-1];
        for(int i = arr.length - 1; i >= 0; i--){
            max = arr[i] > max ? arr[i] : max;
            hm.put(i-1, max);
        }

        int[] ans = new int[arr.length];
        for(int i = 0; i < arr.length-1; i++){
            ans[i] = hm.get(i);
        }
        ans[ans.length-1] = -1;

        return ans;
    }
}

/* 
 * Loop through the array starting from the end.
 * Keep the maximum value seen so far.
*/