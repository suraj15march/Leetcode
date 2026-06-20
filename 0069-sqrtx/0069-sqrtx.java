class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1) return x;
        int start = 1, end = x/2;
        int ans = 0;
        while(start<=end){
            int mid = start+(end-start)/2;
            long product = (long)mid*mid;
            if(product == x) return mid;
            else if(x < product) {
                end = mid-1;
            }
            else {
                ans = mid;
                start = mid+1;
            }
        }
        return ans;
    }
}