/* https://leetcode.com/problems/asteroid-collision/description/ */

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i < asteroids.length; i++){
            int na = asteroids[i];
            if(stack.isEmpty() || na > 0){
                stack.push(na);
            }else{  //new astroid is negative - wants to go left and destroys smaller +ve untill gets till first or finds bigger +ve or -ve.
                while(true){

                    if(stack.isEmpty()){
                        stack.push(na);
                        break;
                    }

                    int peek = stack.peek();

                    //if peek is positive, check if it is lesser  than abs(-na) then destroy it, continue checking.
                    //if peek is positive, check if it is greater than abs(-na) then do nothing and break;
                    //if peek is positive, check if it is equal   to   abs(-na) the destroy it and break;

                    //if peek is negative, simply ad abs(-na) and break;

                    //if stack is empty after all poping, ex[1,2,3,4,-50], -50 will kill all and make stack epmty, so push -50 and break;


                    if(peek > 0){
                        if(peek < Math.abs(na)){
                            stack.pop();
                        }else if(peek > Math.abs(na)){
                            break;
                        }else{
                            stack.pop();
                            break;
                        }
                    }else{
                        stack.push(na);
                        break;
                    }
                    


                }
            }
        }


        int[] result = new int[stack.size()];
        for(int i = result.length-1; i >= 0; i--){
            result[i] = stack.pop();
        }
        return result;
    }
}

/* Any -ve astroid will either kill all left and get till first position (or acumilated at the begening)
   OR get destroyed and all remains is +ve number*/