class Solution {
    int gcd(int a, int b){
        return b==0?a:gcd(b, a%b);
    }
    public int findGCD(int[] nums) {
        int min = 1000, max = 1;
        for(int it: nums){
            min = Math.min(min, it);
            max = Math.max(max, it);
        }
        return gcd(min, max);
    }
}