/* https://leetcode.com/problems/isomorphic-strings/ */

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();

        int s1=0, t1=0;

        while(s1 < s.length() && t1 < t.length()){
            if((mapS.containsKey(s.charAt(s1)) && mapS.get(s.charAt(s1)) != t.charAt(t1)) ||
            (mapT.containsKey(t.charAt(t1)) && mapT.get(t.charAt(t1)) != s.charAt(s1))){
                return false;
            }
            mapS.put(s.charAt(s1), t.charAt(t1));
            mapT.put(t.charAt(t1), s.charAt(s1));
            s1 += 1;
            t1 += 1;
        }
        return true;
    }
}

/* 
 * The idea is to make a map between each character of string s and t and vice-versa
 * example "egg" & "add"
 * e->a, g->d, g->d
 * a->e, d->g, d->g
 * At any point we see a existing character mapping with different value, we return false
*/