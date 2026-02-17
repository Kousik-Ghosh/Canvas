class Solution {
    public int scoreOfString(String s) {
        
        int second = 0;
        int score = 0;
        for(int first = 1; first < s.length(); first++){
            score += (int) Math.abs(s.charAt(first) - s.charAt(second));
            second++;
        }
        return score;

    }
}