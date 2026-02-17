/* https://leetcode.com/problems/pascals-triangle/description/ */
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        int[][] grid = new int[numRows][numRows + 1];
        grid[0][1] = 1;

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[i].length; j++) {
                grid[i][j] = grid[i - 1][j - 1] + grid[i - 1][j];
            }
        }

        for (int i = 0; i < grid.length; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != 0) {
                    temp.add(grid[i][j]);
                }
            }
            ans.add(temp);
        }

        return ans;
    }
}