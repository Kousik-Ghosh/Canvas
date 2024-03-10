/* https://leetcode.com/problems/boats-to-save-people/description/ */

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        Arrays.sort(people);
        int boat = 0;
        int start = 0;
        int end = people.length - 1;

        while(start <= end){
            if( people[start] + people[end] <= limit ){
                boat++;
                start++;
                end--;
            }else{
                if(people[start] > people[end]){
                    boat++;
                    start++;
                }else{
                    boat++;
                    end--;
                }
            }
        }

        return boat;

    }
}


/* 
 * if start and end person added weight <= target
 *  give them a boat;
 * if not, the who ever has max among to give them one and move to its next
*/