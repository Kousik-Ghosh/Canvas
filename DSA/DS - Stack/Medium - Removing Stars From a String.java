/* https://leetcode.com/problems/removing-stars-from-a-string/description/ */

class Solution {
    public String removeStars(String s) {
        
        if(s.length() == 1 && s.charAt(0) != '*' ){
            return s;
        }

        int top = 0;
        char[] stack = new char[100000];
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '*'){
                top--;
            }else{
                stack[top] = s.charAt(i);
                top++;
            }
        }

        return new String(stack).substring(0, top);
    }
}