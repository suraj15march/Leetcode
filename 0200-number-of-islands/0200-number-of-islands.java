class Solution {
    void solve(char[][] grid, int row, int col){
        int m = grid.length;
        int n = grid[0].length;
        if(row<0 || row>=m || col<0 || col>=n || grid[row][col]!='1') return;
        grid[row][col] = '2';
        solve(grid, row-1, col);
        solve(grid, row, col-1);
        solve(grid, row+1, col);
        solve(grid, row, col+1);
    }
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == '1'){
                    ans++;
                    solve(grid, i, j);
                }
            }
        }
        return ans;
    }
}