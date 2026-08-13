class Solution {
    int ans = 0;
    void solve(int[][] grid, int row, int col){
        int m = grid.length, n = grid[0].length;
        if(row<0 || row>=m || col<0 || col>=n || grid[row][col]==0){
            ans++;
            return;
        }
        if(grid[row][col] == 2) return;
        grid[row][col] = 2;
        solve(grid, row-1, col);
        solve(grid, row+1, col);
        solve(grid, row, col-1);
        solve(grid, row, col+1);
    }
    public int islandPerimeter(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1){
                    solve(grid, i, j);
                    return ans;
                }
            }
        }
        return ans;
    }
}