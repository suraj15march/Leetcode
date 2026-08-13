class Solution {
    int solve(int[][] grid, int row, int col){
        int m = grid.length, n = grid[0].length;
        if(row<0 || row>=m || col<0 || col>=n || grid[row][col] == 0) return 0;

        grid[row][col] = 0;
        int up = solve(grid, row-1, col);
        int down = solve(grid, row+1, col);
        int left = solve(grid, row, col-1);
        int right = solve(grid, row, col+1);

        return 1+up+down+left+right;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int ans = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1)
                    ans = Math.max(ans, solve(grid, i, j));
            }
        }
        return ans;
    }
}