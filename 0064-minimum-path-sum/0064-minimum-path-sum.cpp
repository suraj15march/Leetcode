class Solution {
public:
    int minPathSum(vector<vector<int>>& grid) {
        int m = grid.size();
        int n = grid[0].size();
        vector<vector<int>> memo(m, vector<int>(n, -1));
       
        return minPathSumMemo(grid, memo, 0, 0);
    }
    int minPathSumMemo(vector<vector<int>> &grid, vector<vector<int>>& memo,
                       int i, int j) {
        int m = grid.size();    // rows
        int n = grid[0].size(); // col
        if (i==m-1 && j==n-1) {
            return grid[i][j];
        }
        if(memo[i][j] != -1)
        {
            return memo[i][j];
        }
        int down = INT_MAX;
        int right = INT_MAX;
        if (i+1 < m)
        {
            down = minPathSumMemo(grid, memo, i + 1, j);
        }
        if (j+1 < n)
        {
            right = minPathSumMemo(grid,memo, i, j + 1);
        }
        memo[i][j] = grid[i][j] + min(down, right);
        return memo[i][j];
    }
};