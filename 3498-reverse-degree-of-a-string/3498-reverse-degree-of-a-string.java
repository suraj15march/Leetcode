class Solution {
    public int reverseDegree(String s) {
        String alphabet = "zyxwvutsrqponmlkjihgfedcba";
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            ans += (i+1)*(alphabet.charAt(s.charAt(i)-'a')-'a'+1);
        }
        return ans;
    }
}