/* https://leetcode.com/problems/valid-sudoku/description/ */

class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<Character> line = new HashSet<>();
    
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                if(line.contains(board[i][j])){
                    return false;
                }else{
                    line.add(board[i][j]);
                }
            }
            line.clear();
        }

        line.clear();

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[j][i] == '.'){
                    continue;
                }
                if(line.contains(board[j][i])){
                    return false;
                }else{
                    line.add(board[j][i]);
                }
            }
            line.clear();
        }

        for(int i = 0; i < 9; i = i + 3){
            for(int j = 0; j < 9; j = j + 3){
                if(!checkBlock(i, j, board)){
                    return false;
                }
            }
        }
        return true;

    }

    static boolean checkBlock(int start_i, int start_j, char[][] board){
        int end_i = start_i + 3;
        int end_j = start_j + 3;

        HashSet<Character> block = new HashSet<>();
        for(int i = start_i; i < end_i; i++){
            for(int j = start_j; j < end_j; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                if(block.contains(board[i][j])){
                    return false;
                }else{
                    block.add(board[i][j]);
                }
            }
        }

        return true;
    }

}