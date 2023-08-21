/* https://leetcode.com/problems/simplify-path/description/ */

class Solution {
    public String simplifyPath(String path) {
        
            path = path + "/";
            ArrayDeque<String> stack = new ArrayDeque<>();
            StringBuilder dir = new StringBuilder();
            for(int i = 0; i < path.length(); i++){

                if(path.charAt(i) == '/'){

                    if(dir.toString().equals("..")){
                        if(!stack.isEmpty()){
                            stack.pop();
                        }
                    }else if(!dir.isEmpty() && !dir.toString().equals(".")){
                        stack.push(dir.toString());
                    }

                    dir = new StringBuilder();
                }else{
                    dir.append(path.charAt(i));
                }


            }

            String[] canonical = new String[stack.size()];
            for(int i = stack.size()-1; i >= 0; i--){
                canonical[i] = stack.pop();
            }

            String result = "";
            for(int i = 0; i < canonical.length; i++){
                result = result + "/" +canonical[i];
            }

            return result == "" ? "/" : result;

    }
}