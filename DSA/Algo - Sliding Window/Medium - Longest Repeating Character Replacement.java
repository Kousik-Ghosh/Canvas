/* https://leetcode.com/problems/longest-repeating-character-replacement/description/ */

class Solution {
    public int characterReplacement(String s, int k) {
        
        int result = -1;
        int left = 0;
        int right = 0;
        HashMap<Character, Integer> lookup = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            //increase the count of current character
            lookup.put(s.charAt(i), lookup.getOrDefault(s.charAt(i), 0)+1);

            //find max occurence character count
            int maxCount = -1;
            for (Integer x : lookup.values()) {
                maxCount = Math.max(maxCount, x);
            }

            right = i;
            if(right-left+1 - maxCount <= k){
                result = Math.max(result, right-left+1);
            }else{
                lookup.put(s.charAt(left), lookup.getOrDefault(s.charAt(left), 0) - 1 );
                left++;
            }
        }

        return result;

    }
}