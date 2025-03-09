class Solution {
    public String largestGoodInteger(String num) {
        int max = -1;
        for (int i = 0; i <= num.length() - 3; i++) {
            if ( num.charAt(i) == num.charAt(i+1) && num.charAt(i+1) == num.charAt(i+2) ) {
                int v = num.charAt(i) - '0';
                if (v > max) {
                    max = v;
                }
            }
        }
        if (max == -1) {
            return "";
        }else{
            return max+""+max+""+max;
        } 
    }
}