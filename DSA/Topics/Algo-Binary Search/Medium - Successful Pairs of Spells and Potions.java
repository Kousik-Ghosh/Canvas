import java.util.Arrays;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        

        int ans[] = new int[spells.length];
        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            int left = 0;
            int right = potions.length - 1;
            while (left <= right) {
               int mid = (right+left)/2;
               long pro = (long) spells[i] * potions[mid];
               if(pro >= success){
                  right = mid - 1;
               }else{
                  left = mid + 1;
               }
            }
            int partition = left - 1;
            int pcr = potions.length - partition - 1;
            ans[i] = pcr;

        }
        return ans;

    }
}