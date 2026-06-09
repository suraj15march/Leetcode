class Solution {
    public String expandPalindromeEven(String s, int idx1, int idx2){
        int i = idx1, j = idx2, n = s.length();

        while(i>=0 && j<n && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return s.substring(i+1,j);
    }
    public String expandPalindromeOdd(String s, int idx){
        int i = idx, j = idx, n = s.length();

        while(i>=0 && j<n && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return s.substring(i+1,j);
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n<=1) return s;
        String ans = new String();
        for(int i=0;i<n-1;i++){
            String str1 = expandPalindromeEven(s,i, i+1);
            String str2 = expandPalindromeOdd(s,i);
            if(str1.length()>ans.length()){
                ans = str1;
            }
            if(str2.length()>ans.length()){
                ans = str2;
            }
        }
        return ans;
    }
}