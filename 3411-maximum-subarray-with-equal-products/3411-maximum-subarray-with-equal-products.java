class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            long prod = 1;
            long gcdVal = 0;
            long lcmVal = 1;

            for (int j = i; j < n; j++) {
                long x = nums[j];
                prod *= x;
                gcdVal = (j == i) ? x : gcd(gcdVal, x);
                lcmVal = lcm(lcmVal, x);

                // Guard against overflow if prod exceeds max possible lcm * gcd (2520 * 10)
                if (prod > 25200L && lcmVal <= 2520L) {
                    break;
                }

                if (prod == lcmVal * gcdVal) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }

        return ans;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    private long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
}