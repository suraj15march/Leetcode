class Solution {
    int helper(int[][] obstacleGrid, int row, int col, int[][] memo){
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        if(row >= m || col >= n || obstacleGrid[row][col] == 1) return 0;
        if(row == m-1 && col == n-1) return 1;
        if(memo[row][col] != -1) return memo[row][col];
        obstacleGrid[row][col] = -1;
        int down = helper(obstacleGrid, row+1, col, memo);
        int right = helper(obstacleGrid, row, col+1, memo);
        obstacleGrid[row][col] = 0;
        memo[row][col] = down + right;
        return memo[row][col];
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] memo = new int[m][n];
        for(int[] arr: memo){
            Arrays.fill(arr, -1);
        }
        return helper(obstacleGrid, 0, 0, memo);
    }
}