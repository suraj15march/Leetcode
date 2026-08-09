class Solution {
    List<List<String>>ans;
    char[][] board;
    boolean isValid(int row, int col, int n){
        for(int i=0; i<n; i++){
            if(board[i][col] == 'Q') return false;
        }
        for(int i=0; i<n; i++){
            if(board[row][i] == 'Q') return false;
        }
        for(int i=row-1, j=col-1; i>=0&&j>=0; i--,j--){
            if(board[i][j] == 'Q') return false;
        }
        for(int i=row-1, j=col+1; i>=0&&j<n; i--,j++){
            if(board[i][j] == 'Q') return false;
        }
        for(int i=row+1, j=col+1; i<n&&j<n; i++,j++){
            if(board[i][j] == 'Q') return false;
        }
        for(int i=row+1, j=col-1; i<n&&j>=0; i++,j--){
            if(board[i][j] == 'Q') return false;
        }
        return true;
    }
    List<String>construct(int n){
        List<String>list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(new String(board[i]));
        }
        return list;
    }
    void solve(int queenPos, int n){
        if(queenPos == n){
            ans.add(construct(n));
            return;
        }
        for(int i=0; i<n; i++){
            if(isValid(i, queenPos, n)){
                board[i][queenPos] = 'Q';
                solve(queenPos+1, n);
                board[i][queenPos] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        ans = new ArrayList<>();
        board = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        solve(0, n);
        return ans;
    }
}