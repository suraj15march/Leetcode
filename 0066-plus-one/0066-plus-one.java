class Solution {
    public int[] plusOne(int[] d) {
        int n = d.length;
        for(int i=n-1; i>=0; i--){
            if(d[i]!=9){
                d[i]++;
                return d;
            }
            d[i]=0;
        }
        int[] ans = new int[n+1];
        int i=0;
        ans[i++] = 1;
        for(int it: d)  ans[i++] = it;
        return ans;
    }
}