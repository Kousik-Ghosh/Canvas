/* https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/ */

class Solution {
    public int maxVowels(String s, int k) {
        

        int count = 0;
        int max = 0;
        int left = 0;
        for(int i = 0; i < s.length(); i++){
            if(i < k){
                if(isVowel(s.charAt(i))){
                    count++;
                    max = Math.max(max, count);
                }
            }else{

                if(isVowel(s.charAt(left))){
                    count--;
                }
                left++;
                
                if(isVowel(s.charAt(i))){
                    count++;
                    max = Math.max(max, count);
                }

                
            }
        }

        return max;

    }

    static boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        return false;
    }
}