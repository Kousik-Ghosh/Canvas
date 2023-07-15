/* https://leetcode.com/problems/validate-stack-sequences/description/ */


class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        int popPointer  = 0;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i < pushed.length; i++){
            stack.push(pushed[i]);
            while(!stack.isEmpty() && stack.peek() == popped[popPointer] && popPointer < popped.length){
                stack.pop();
                popPointer++;
            }
        }

        return stack.isEmpty();
    }
}