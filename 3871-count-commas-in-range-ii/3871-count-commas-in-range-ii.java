class Solution {
    public long countCommas(long n) {
        long ans = 0;
        for (long base = 1000L; base <= n; base *= 1000L) {
            ans += (n - base + 1);
        }
        return ans;
    }
}