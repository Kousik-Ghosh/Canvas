/* https://leetcode.com/problems/valid-palindrome/ */


class Solution {
    public boolean isPalindrome(String s) {
        
        String news = s.toLowerCase().replaceAll("[^a-z0-9]","");;
        int start = 0;
        int end = news.length() -1;

        while(start <= end){
            if(news.charAt(start) != news.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;

    }
}