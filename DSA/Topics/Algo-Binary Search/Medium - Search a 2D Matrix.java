class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int left = 0;
        int right = matrix.length-1;

        int row = -1;
        while(left <= right){
            int mid = (left+right)/2;
            if(matrix[mid][0]<= target && target <= matrix[mid][matrix[0].length-1]){
                row = mid;
                break;
            }else if(matrix[mid][matrix[0].length-1] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        if(row == -1){
            return false;
        }

         left = 0;
         right = matrix[row].length -1;
        while(left <= right){
            int mid = (left+right)/2;
            if(matrix[row][mid] == target){
                return true;
            }else if(matrix[row][mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return false;

    }
}