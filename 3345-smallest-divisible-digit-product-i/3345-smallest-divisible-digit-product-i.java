class Solution {
    int getProduct(int num){
        int ans = 1;
        while(num>0){
            ans *= num%10;
            num/=10;
        }
        return ans;
    }
    public int smallestNumber(int n, int t) {
        while(getProduct(n)%t != 0) n++;
        return n;
    }
}