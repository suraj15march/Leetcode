class Solution {
    public boolean checkDecimal(int n){
        String s = Integer.toString(n);
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '0') return false;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        int[] ans = new int[2];
        int i=1;
        while(i<n){
            if(checkDecimal(i) && checkDecimal(n-i)){
                ans[0] = i;
                ans[1] = n-i;
                return ans;
            }
            i++;
        }
        return ans;
    }
}