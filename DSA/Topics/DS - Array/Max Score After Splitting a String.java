class Solution {
    public int maxScore(String s) {
        int length = s.length();
        int zerosFromLeft = 0;
        int onesFromRight = 0;
        int maxScored = -1;
        int[] zeros = new int[length];
        int[] ones = new int[length];

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) - '0' == 0) {
                zerosFromLeft++;
                zeros[i] = zerosFromLeft;
            }else{
                zeros[i] = zerosFromLeft;
            }
        }

        for (int j = length-1; j > 0; j--) {
            if (s.charAt(j) - '1' == 0) {
                onesFromRight++;
                ones[j] = onesFromRight;
            }else{
                 ones[j] = onesFromRight;
            }
        }

        for (int k = 0; k < length - 1; k++) {
            if (zeros[k] + ones[k+1] > maxScored) {
                maxScored = zeros[k] + ones[k+1];
            }
        }


        return maxScored;
    }
}