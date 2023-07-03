/* https://leetcode.com/problems/merge-strings-alternately/description/ */

class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        String ans = "";
        for(int i = 0 ; i < Math.min(word1.length(), word2.length()); i++){
            
                ans = ans + word1.charAt(i);
            
                ans = ans + word2.charAt(i);
            
        }

        int extra = word1.length() - word2.length();
        if(extra > 0){
            ans = ans + word1.substring(word2.length(), word1.length());
        }else if(extra < 0){
            ans = ans + word2.substring(word1.length(), word2.length());
        }

        return ans;
    }
}