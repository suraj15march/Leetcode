class Solution {
    boolean isSafe(char[][] board, int row, int col, char ch){
        for(int i=0; i<9; i++){
            if(board[i][col] == ch || board[row][i] == ch) return false;
        }
        int newRow = 3*(row/3), newCol = 3*(col/3);
        for(int i=newRow; i<newRow+3; i++){
            for(int j=newCol; j<newCol+3; j++){
                if(board[i][j] == ch) return false;
            }
        }
        return true;
    }
    boolean solver(char[][] board, int row, int col){
        if(row == 9) return true;
        int nextCol = col+1, nextRow = row;
        if(nextCol==9){
            nextCol = 0;
            nextRow = row+1;
        }
        if(board[row][col] != '.'){
            return solver(board, nextRow, nextCol);
        }
        for(char i='1'; i<='9'; i++){
            if(isSafe(board, row, col, i)){
                board[row][col] = i;
                if(solver(board, nextRow, nextCol)) return true;
                board[row][col] = '.';
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        solver(board, 0, 0);
    }
}