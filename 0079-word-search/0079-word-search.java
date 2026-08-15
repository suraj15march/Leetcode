class Solution {
    boolean solve(char[][] board, int row, int col, int index, String word) {
        if(index>=word.length()) return true;
        int m = board.length, n = board[0].length;
        if(row<0 || row>=m || col<0 || col>=n || word.charAt(index) != board[row][col]) return false;
        char temp = board[row][col];
        board[row][col] = '#';
        boolean up = solve(board, row-1, col, index+1, word);
        boolean down = solve(board, row+1, col, index+1, word);
        boolean left = solve(board, row, col-1, index+1, word);
        boolean right = solve(board, row, col+1, index+1, word);
        board[row][col] = temp;
        return up || down || left || right;
    }
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] == word.charAt(0)){
                    if(solve(board, i, j, 0, word)) return true;
                }
            }
        }
        return false;
    }
}