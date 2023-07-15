/* https://leetcode.com/problems/baseball-game/description/ */

class Solution {
    public int calPoints(String[] operations) {
        
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("+")){
                int x = stack.pop();
                int y = stack.peek();
                stack.push(x);
                stack.push(x+y);
            }else if(operations[i].equals("D")){
                int x = stack.peek();
                stack.push(x<<1);
            }else if(operations[i].equals("C")){
                stack.pop();
            }else{
                stack.push(Integer.parseInt(operations[i]));
            }
        }

        int sum = 0;
        while(!stack.isEmpty()){
            sum = sum + stack.pop();
        }

        return sum; 


    }
}