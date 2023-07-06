/* https://leetcode.com/problems/maximum-number-of-balloons/ */

class Solution {
    public int maxNumberOfBalloons(String text) {
        
        if(text.length() < 7){
            return 0;
        }

        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < text.length(); i++){
            if(hm.containsKey(text.charAt(i))){
                hm.put(text.charAt(i), hm.get(text.charAt(i))+1);
            }else{
                hm.put(text.charAt(i),1);
            }
        }

        int smax = 0;
        if(hm.containsKey('b') && hm.containsKey('a') && hm.containsKey('n')){
            smax = Math.min(hm.get('b'), hm.get('a'));
            smax = Math.min(smax, hm.get('n'));
        }

        int dmax = 0;
        if(hm.containsKey('l') && hm.containsKey('o')){
            dmax = Math.min(hm.get('l')/2, hm.get('o')/2);
        }

        return Math.min(smax, dmax);




    }
}

/* 
 * Count the number of all characters
 * get min of count of "b","a","n"
 * get min of count of "l"/2, "o"/2
 * return min of above twos.
*/