import java.util.HashMap;

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        
        int max = -1;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            
                if (map.containsKey(s.charAt(i))) {
                    int delta = i - map.get(s.charAt(i))  - 1;
                    if (delta > max) {
                        max = delta; 
                    }
                }else{
                    map.put(s.charAt(i), i);
                }

        }

        return max;

    }
}