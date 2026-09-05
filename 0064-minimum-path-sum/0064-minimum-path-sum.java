class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] memo = new int[m][n];
        for(int[] row: memo){
            Arrays.fill(row, -1);
        }
        return memorization(grid, 0, 0, memo);
        // return memo[m-1][n-1];
        // return recursion(grid, 0, 0);
    }

    int memorization(int [][] grid, int i , int j, int[][] memo){
        int m = grid.length, n = grid[0].length;
        if(i == m-1 && j == n-1)
        {
            memo[i][j] = grid[i][j];
            return grid[i][j];
        }
        if(memo[i][j] != -1) return memo[i][j];

        int down = Integer.MAX_VALUE;
      int right = Integer.MAX_VALUE;

      if(i + 1 < m)
      {
        down = memorization(grid, i+1, j, memo);
      }

      if(j + 1 < n)
      {
        right = memorization(grid, i, j+1, memo);
      }

      memo[i][j] = grid[i][j] + Math.min(down, right);

      return memo[i][j];
    }

    private int recursion(int [][] grid, int i , int j)
    {
        int m = grid.length; // rows
        int n = grid [0].length; // col

        if(i == m-1 && j == n-1)
        {
            return grid[i][j];
        }
      

      int down = Integer.MAX_VALUE;
      int right = Integer.MAX_VALUE;

      if(i + 1 < m)
      {
        down = recursion(grid, i+1, j);
      }

      if(j + 1 < n)
      {
        right = recursion(grid, i, j+1);
      }

      return grid[i][j] + Math.min(down, right);

    }
}