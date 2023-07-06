/* https://leetcode.com/problems/group-anagrams/description/ */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();


        for(int i = 0; i < strs.length; i++){
            String s = strs[i];
            int[] charArr = new int[26];
            for(char c : s.toCharArray()){
                charArr[c-'a']++;
            }
            String cks = new String(Arrays.toString(charArr));
            ArrayList<String> temp;
            if(map.containsKey(cks)){
                temp = map.get(cks);
                temp.add(s);
                map.put(cks, temp);
            }else{
                temp = new ArrayList<>();
                temp.add(s);
                map.put(cks, temp);
            }
        }

        ans.addAll(map.values());
        return ans;


    }
}


/* 
 * For each string in input, create a int array of size 26 and set position for each character
 * like for cat -> [1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0]
 * covert it into string   "String cks = new String(Arrays.toString(charArr))"
 * put it into HashMap<String, ArrayList<String>> as like this (cks, current string)
*/