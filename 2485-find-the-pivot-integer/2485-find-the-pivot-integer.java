class Solution {
    public int pivotInteger(int n) {
        int sum = n*(n+1)/2;
        int curSum = 0;
        for(int i=n; i>0; i--){
            if((curSum + i) == (sum-curSum)) return i;
            curSum += i;
        }
        return -1;
    }
}