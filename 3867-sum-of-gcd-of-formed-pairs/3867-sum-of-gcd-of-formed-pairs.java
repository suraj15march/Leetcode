class Solution {
    public int gcd(int a, int b) {
        // if(a==0) return b;
        // if(b==0) return a;
        // if(a==b) return a;
        // if(a>b) return gcd(b, a-b);
        // return gcd(a, b-a);
        return (b == 0) ? a : gcd(b, a % b);
    }
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] prefixGcd = new int[n];
        int mxi = nums[0];
        for(int i=0; i<n; i++){
            mxi = Math.max(mxi, nums[i]);
            prefixGcd[i] = gcd(nums[i], mxi);
        }
        long ans = 0;
        int start = 0, end = n-1;
        Arrays.sort(prefixGcd);
        while(start<end){
            ans += gcd(prefixGcd[start], prefixGcd[end]);
            start++;
            end--;
        }
        return ans;
    }
}