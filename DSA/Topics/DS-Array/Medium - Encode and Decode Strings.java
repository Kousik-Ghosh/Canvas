/* https://leetcode.com/problems/encode-and-decode-strings/ */

/* https://leetcode.com/problems/product-of-array-except-self/description/ */
class Solution {

    public String encode(List<String> strs) {
        
        String ans = "";
        for(String s : strs){
            ans = ans + s.length() + "#" + s;
        }
        return ans;
    }

   
    public List<String> decode(String str) {
        
        List<String> ans = new ArrayList<>();
        String s = "";
        String number = "";
        boolean getNumber = true;
        int size = 0;

        for(int i = 0; i < str.length(); i++){
            
            if(getNumber){
                if(str.charAt(i) != '#'){
                    number = number + str.charAt(i);
                }else{
                    size = Integer.parseInt(number);
                    getNumber = false;
                    number = "";
                }
            }else{
                s = s + str.charAt(i);
                size--;
                if(size == 0){
                    ans.add(s);
                    getNumber = true;
                    s = "";
                }
            }
        }

        return ans;
        
    }

}