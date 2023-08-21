/* https://leetcode.com/problems/permutation-in-string/description/ */

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()){
            return false;
        }

        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        int s1Length = s1.length();
        for(int i = 0; i < s1Length; i++){
            hm1.put(s1.charAt(i), hm1.getOrDefault(s1.charAt(i),0) + 1 );
        }

        int j = 0;
        for(j = 0; j < s1Length; j++){
            hm2.put(s2.charAt(j), hm2.getOrDefault(s2.charAt(j),0) + 1 );
        }

        if(isEqual(hm1, hm2)){
            return true;
        }

        int front = 0;
        int back = j;
        while(back < s2.length()){
            hm2.put(s2.charAt(front), hm2.get(s2.charAt(front)) - 1 );
            hm2.put(s2.charAt(back), hm2.getOrDefault(s2.charAt(back),0) + 1 );
            if(isEqual(hm1, hm2)){
                return true;
            }
            front++;
            back++;
        }       

        return false;       

    }

    public static boolean isEqual(HashMap<Character, Integer> hm1, HashMap<Character, Integer> hm2){    
        for (Map.Entry<Character, Integer> e : hm1.entrySet()) {
            if(!hm2.containsKey(e.getKey())){
                return false;
            }
            if(!hm2.get(e.getKey()).equals(e.getValue())){
                return false;
            }
        }
        return true;
    }
}