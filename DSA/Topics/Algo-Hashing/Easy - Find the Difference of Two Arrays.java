/* https://leetcode.com/problems/find-the-difference-of-two-arrays/description/ */

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> ans = new ArrayList<>(2);

        HashSet<Integer> num1 = new HashSet<Integer>();
        HashSet<Integer> num2 = new HashSet<Integer>();

        for (int i = 0; i < nums1.length; i++) {
            num1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            num2.add(nums2[i]);
        }

        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());
        for (Integer integer : num1) {
            if(!num2.contains(integer)){
                ans.get(0).add(integer);
            }
        }

        for (Integer integer : num2) {
            if(!num1.contains(integer)){
                ans.get(1).add(integer);
            }
        }

        return ans;

    }
}