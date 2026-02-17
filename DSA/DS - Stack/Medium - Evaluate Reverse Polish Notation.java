/* https://leetcode.com/problems/evaluate-reverse-polish-notation/description/ */

class Solution {
    public int evalRPN(String[] tokens) {


        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].equals("+")){
                stack.push(stack.pop() + stack.pop());
            }else if(tokens[i].equals("-")){
                int last = stack.pop();
                int before_last = stack.pop();
                stack.push(before_last - last);
            }else if(tokens[i].equals("*")){
                stack.push(stack.pop() * stack.pop());
            }else if(tokens[i].equals("/")){
                int last = stack.pop();
                int before_last = stack.pop();
                stack.push((int) before_last / last);
            }else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }

        return stack.pop();
    }
}