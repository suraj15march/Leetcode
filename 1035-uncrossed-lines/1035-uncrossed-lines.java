class Solution {
    int helper(int index1, int index2, int[] nums1, int[] nums2, int[][] dp) {
        if (index1 >= nums1.length || index2 >= nums2.length) {
            return 0;
        }
        if(dp[index1][index2] != -1){
            return dp[index1][index2];
        }
        if (nums1[index1] == nums2[index2]) {
            return dp[index1][index2] = 1 + helper(index1 + 1, index2 + 1, nums1, nums2, dp);
        }
        return dp[index1][index2] = Math.max(helper(index1 + 1, index2, nums1, nums2, dp), helper(index1, index2 + 1, nums1, nums2, dp));
    }

    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[][] dp = new int[m][n];
        for(int[] arr: dp){
            Arrays.fill(arr, -1);
        }
        return helper(0, 0, nums1, nums2, dp);
    }
}