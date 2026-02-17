/* https://leetcode.com/problems/valid-parentheses/description/ */

class Solution {
    public boolean isValid(String s) {

        if(s.length() < 2){
            return false;
        }

        HashMap<Character, Character> lookup = new HashMap<>();
        lookup.put('}','{');
        lookup.put(')','(');
        lookup.put(']','[');
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++){
            if(lookup.containsKey(s.charAt(i))){
                if(stack.peek() != lookup.get(s.charAt(i))){
                    return false;
                }else{
                    stack.pop();
                }
            }else{
                stack.push(s.charAt(i));
            }
        }

        return stack.isEmpty();
    }
}