class Solution {
    List<Integer> getSquares(int n){
        List<Integer>squares = new ArrayList<>();
        for(int i=1; i*i<=n; i++){
            squares.add(i*i);
        }
        return squares;
    }
    int helper(int index, List<Integer>squares, int n, int[][] dp){
        if(index>=squares.size()) return 10001;
        if(n<=0) return 0;
        if(dp[index][n] != -1) return dp[index][n];
        int take = 10001;
        if(squares.get(index)<=n)
            take = 1 + helper(index, squares, n-squares.get(index), dp);
        int skip = helper(index+1, squares, n, dp);
        return dp[index][n] = Math.min(take, skip);
    }
    public int numSquares(int n) {
        List<Integer>squares = getSquares(n);
        int[][] dp = new int[squares.size()][n+1];
        for(int[] arr: dp){
            Arrays.fill(arr, -1);
        }
        int ans = helper(0, squares, n, dp);
        return ans==10001?0:ans;
    }
}