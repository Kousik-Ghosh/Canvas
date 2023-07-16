/* https://leetcode.com/problems/daily-temperatures/description/ */


class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        

        int[] tillWarmerDay = new int[temperatures.length];

        // for each value, put the index in stack, but before,
        // when current index temp is > stack.peek() temp it means we have found a warmer day.
        // so while, in reverse, change the till-warmer day by stack.pop value from current day,
        // until we stack is empty or(&&)  current index temp is < stack.peek()  
        
        
        //monotonous decreasing


        ArrayDeque<Integer> previousDayStack = new ArrayDeque<>();
        for(int currentDay = 0; currentDay < temperatures.length; currentDay++){

            while(!previousDayStack.isEmpty() && temperatures[previousDayStack.peek()] < temperatures[currentDay]){
                int previousDays = previousDayStack.pop();
                tillWarmerDay[previousDays] = currentDay - previousDays;
            }

            previousDayStack.push(currentDay);
        }

        return tillWarmerDay;
        
    }
}