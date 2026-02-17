/* https://leetcode.com/problems/longest-common-prefix/*/
import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            for (String string : strs) {
                if (i == string.length() || string.charAt(i) != strs[0].charAt(i)) {
                    return ans.toString();
                }
            }
            ans.append(strs[0].charAt(i));
        }

        return ans.toString();
    }

    public String longestCommonPrefix2(String[] strs) {

        int arrayLength = strs.length;
        int counter = 0;
        Arrays.sort(strs);
        for (int i = 0; i < strs[0].length(); i++) {
            if (strs[0].charAt(i) == strs[arrayLength - 1].charAt(i)) {
                counter++;
            } else {
                break;
            }
        }

        return strs[0].substring(0, counter);
    }
}
