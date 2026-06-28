class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1 || n==4 || n==16 || n==64) return true;
        if(n==0 || n%4 != 0) return false;
        return isPowerOfFour(n/4);
    }
}