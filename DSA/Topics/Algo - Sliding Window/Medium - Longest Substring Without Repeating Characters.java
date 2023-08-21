/* https://leetcode.com/problems/longest-substring-without-repeating-characters/ */


class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 2){
            return s.length();
        }

        int left = 0;
        int right = 0;
        int max = -1;
        HashMap<Character, Integer> hs = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(hs.containsKey(s.charAt(i))){
                if(hs.get(s.charAt(i)) >= left){
                    left = hs.get(s.charAt(i));
                    left++;
                }
            }
            hs.put(s.charAt(i), i);
            right = i;
            max = Math.max(max, Math.abs(right-left));
        }

        return max+1;

    }
}