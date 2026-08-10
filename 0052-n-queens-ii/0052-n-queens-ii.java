class Solution {
    int ans = 0;
    boolean isSafe(boolean[][] board, int row, int col){
        int n = board.length;
        for(int i=0; i<n; i++){
            if(board[row][i] || board[i][col] ) return false;
        }
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j]) return false;
        }
        for(int i=row+1, j=col+1; i<n && j<n; i++, j++){
            if(board[i][j]) return false;
        }
        for(int i=row-1, j=col+1; i>=0 && j<n; i--, j++){
            if(board[i][j]) return false;
        }
        for(int i=row+1, j=col-1; i<n && j>=0; i++, j--){
            if(board[i][j]) return false;
        }
        return true;
    }
    void solve(boolean[][] board, int row){
        int n = board.length;
        if(row == n){
            ans++;
            return;
        }
        for(int col=0; col<n; col++){
            if(isSafe(board, row, col)){
                board[row][col] = true;
                solve(board, row+1);
                board[row][col] = false;
            }
        }
    }
    public int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        solve(board, 0);
        return ans;
    }
}