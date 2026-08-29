class Solution {
    int[] ans;
    int getOnes(int n){
        if(n==0) return 0;
        if(n%2 == 1) return 1+getOnes(n/2);
        return getOnes(n/2);
    }
    public int[] countBits(int n) {
        ans = new int[n+1];
        Arrays.fill(ans, -1);
        for(int i=0; i<=n; i++){
            ans[i] = getOnes(i);
        }
        return ans;
    }
}

// 0 - 0
// 1 - 1
// 2 - 1
// 3 - 2
// 4 - 1
// 5 - 2
// 6 - 2
// 7 - 3
// 8 - 1
// 9 - 2
// 10 - 2
// 11 - 3
