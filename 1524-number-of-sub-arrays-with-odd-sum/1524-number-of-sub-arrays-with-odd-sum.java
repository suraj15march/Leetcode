class Solution {
    public int numOfSubarrays(int[] arr) {
        long oddCount = 0;
        long evenCount = 1; // Base case: prefix sum of 0 is even
        long currentSum = 0;
        long totalOddSubarrays = 0;
        int MOD = 1_000_000_007;

        for (int num : arr) {
            currentSum += num;
            
            if (currentSum % 2 != 0) {
                // If current prefix sum is odd, add the number of previous even prefix sums
                totalOddSubarrays = (totalOddSubarrays + evenCount) % MOD;
                oddCount++;
            } else {
                // If current prefix sum is even, add the number of previous odd prefix sums
                totalOddSubarrays = (totalOddSubarrays + oddCount) % MOD;
                evenCount++;
            }
        }

        return (int) totalOddSubarrays;
    }
}