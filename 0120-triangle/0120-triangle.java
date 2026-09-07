class Solution {
    public int helper(List<List<Integer>> triangle, int triIndex, int index, int[][] memo){
        if(triIndex >= triangle.size()){
            return 0;
        }
        List<Integer> row = triangle.get(triIndex);

        if(index>=row.size()) return 0;

        if(memo[triIndex][index] != Integer.MAX_VALUE) return memo[triIndex][index];

        int first = row.get(index) + helper(triangle, triIndex+1, index, memo);
        int second = row.get(index) + helper(triangle, triIndex+1, index+1, memo);
        
        memo[triIndex][index] = Math.min(first, second);
        return memo[triIndex][index];
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] memo = new int[n][n];
        for(int[] arr: memo){
            Arrays.fill(arr, Integer.MAX_VALUE);
        }
        return helper(triangle, 0, 0, memo);
    }
}