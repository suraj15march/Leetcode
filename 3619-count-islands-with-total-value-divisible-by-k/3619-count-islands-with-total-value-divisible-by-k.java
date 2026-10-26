class Solution {
    void solve(int[][] grid, int row, int col, long[] sum) {
        int n = grid.length, m = grid[0].length;
        if (row < 0 || col < 0 || row >= n || col >= m || grid[row][col] == 0 || grid[row][col] == -1)
            return;

        sum[0] += grid[row][col];
        grid[row][col] = -1;

        solve(grid, row + 1, col, sum);
        solve(grid, row, col + 1, sum);
        solve(grid, row - 1, col, sum);
        solve(grid, row, col - 1, sum);
    }

    public int countIslands(int[][] grid, int k) {
        int n = grid.length, m = grid[0].length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] != 0 && grid[i][j] != -1) {
                    long[] sum = new long[1];
                    solve(grid, i, j, sum);
                    if (sum[0] % k == 0)
                        ans++;
                }
            }
        }
        return ans;
    }
}