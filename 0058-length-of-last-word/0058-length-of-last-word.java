class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length(), c=0;
        boolean flag = false;
        for(int j=n-1;j>=0;j--){
            if(s.charAt(j) != ' '){
                flag = true;
                c++;
            }
            if(s.charAt(j) == ' ' && flag)
                return c;
        }
        return c;
    }
}