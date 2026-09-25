class Solution {
    int check(int row, int col, int[][] board){
        int m = board.length, n = board[0].length;
        int cell = board[row][col];

        int up = row-1>=0? board[row-1][col]:-1;
        int down = row+1<m? board[row+1][col]:-1;
        int left = col-1>=0? board[row][col-1]:-1;
        int right = col+1<n? board[row][col+1]:-1;
        int upLeft = row-1>=0 && col-1>=0? board[row-1][col-1]:-1;
        int upRight = row-1>=0 && col+1<n? board[row-1][col+1]:-1;
        int downLeft = row+1<m && col-1>=0? board[row+1][col-1]: -1;
        int downRight = row+1<m && col+1<n? board[row+1][col+1]: -1;

        int countLive = 0;
        if(up == 1) countLive++;
        if(down == 1) countLive++;
        if(left == 1) countLive++;
        if(right == 1) countLive++;
        if(upLeft == 1) countLive++;
        if(upRight == 1) countLive++;
        if(downLeft == 1) countLive++;
        if(downRight == 1) countLive++;

        if(cell == 1){
            if(countLive<2) return 0;
            if(countLive<4) return 1;
            else return 0;
        }
        if(countLive==3) return 1;
        return 0;
    }
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;
        int[][] ans = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                ans[i][j] = check(i, j, board);
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                board[i][j] = ans[i][j];
            }
        }
    }
}