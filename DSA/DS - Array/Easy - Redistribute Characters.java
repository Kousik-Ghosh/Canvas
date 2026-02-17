class Solution {
    public boolean makeEqual(String[] words) {
        
        int []arr = new int[26];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                arr[words[i].charAt(j) - 'a']++;
            }
        }

       
      int i = 0;
       while (i < 26) {
            if (arr[i] % words.length != 0) {
                return false;
            }
            i++;
       }

       return true;

    }
}