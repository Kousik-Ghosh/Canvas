class Solution {
    public int totalFruit(int[] fruits) {
        
        int ans = 0;
        HashMap<Integer, Integer> countHM = new HashMap<>();
        int slowPointer = 0;

        for(int fastPointer = 0; fastPointer < fruits.length; fastPointer++){
            countHM.put(fruits[fastPointer], countHM.getOrDefault(fruits[fastPointer], 0) + 1);

            while(countHM.size() > 2){
                countHM.put(fruits[slowPointer], countHM.get(fruits[slowPointer])-1);
                countHM.remove(fruits[slowPointer], 0);
                slowPointer++;
            }

            ans = Math.max(ans, fastPointer-slowPointer+1);
        }

        return ans;


    }
}