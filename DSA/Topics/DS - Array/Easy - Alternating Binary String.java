class Solution {
    public int minOperations(String s) {
        
        int ans1 = 0;
        int ans2 = 0;
        char toBe;
        
        toBe = '0';
        for (int i = 0; i < s.length(); i++) {
            if (toBe != s.charAt(i)) {
                ans1++;  
            }
            toBe = this.flip(toBe);
        }
    
        toBe = '1';
        for (int i = 0; i < s.length(); i++) {
            if (toBe != s.charAt(i)) {
                ans2++;  
            }
            toBe = this.flip(toBe);
        }
    
        return (ans1 < ans2) ? ans1 : ans2;

    }

    public char flip(char x) {
        if (x == '0') {
            return '1';
        }
        return '0'; 
    }
}