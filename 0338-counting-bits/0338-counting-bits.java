class Solution {

    int getOnes(int n){
        int one = 0;
        while(n>0){
            if(n%2==1) one++;
            n /= 2;
        }
        return one;
    }
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
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
