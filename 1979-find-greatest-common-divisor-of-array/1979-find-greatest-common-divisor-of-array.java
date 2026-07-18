class Solution {
    int gcd(int a, int b){
        return b==0?a:gcd(b, a%b);
    }
    public int findGCD(int[] nums) {
        int min = nums[0], max = nums[0];
        for(int it: nums){
            min = Math.min(min, it);
            max = Math.max(max, it);
        }
        return gcd(min, max);
    }
}