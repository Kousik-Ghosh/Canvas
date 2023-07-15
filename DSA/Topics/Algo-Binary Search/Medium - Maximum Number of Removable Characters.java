/* https://leetcode.com/problems/maximum-number-of-removable-characters/description/ */

class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
        
        char[] sArray = s.toCharArray();
        int left = 0;
        int right = removable.length;

        while(left <= right){

            int mid = (left+right)/2;

            for(int i = 0; i < mid; i++){
                sArray[removable[i]] = '*';
            }

            if(checkSubsequence(sArray, p)){
                left = mid+1;
            }else{
                right = mid-1;
            }

            for(int i = 0; i < mid; i++){
                sArray[removable[i]] = s.charAt(removable[i]);
            }
        }

        return right;

    }

    static boolean checkSubsequence(char[] s, String p){

        if(p.length() == 0){
            return true;
        }

        int sPointer = 0;
        int pPointer = 0;

        while(sPointer < s.length && pPointer < p.length()){
            if(s[sPointer] == p.charAt(pPointer)){
                sPointer++;
                pPointer++;
            }else{
                sPointer++;
            }
        }

        return pPointer == p.length();

    }
}

/* 
 * Binary Search for a suitable index in removable array till which
 * if we remove, we still get p as a subsequecne of s;
 * 
 * We utilize checkSubsequence(s,p) for check if p is a subsequence of s.
 * for each mid of removable array, put '*' till mid - idicating removal 
 * ( check subsequence will see this as different character)
 * 
 * if it is still subsequence increase left other wise decrease right.
 * 
 * revert back the '*' to its original value.
 * return left, beacuase left will point to the final K.
*/