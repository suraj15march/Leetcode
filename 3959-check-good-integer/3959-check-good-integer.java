class Solution {
    public boolean checkGoodInteger(int n) {
        int ans = 0;
        while(n>0){
            int a = n%10;
            ans += a*(a-1);
            if(ans>=50) return true;
            n/=10;
        }
        return false;
    }
}