class Solution {
    public int maxDepth(String s) {
        int count = 0, ans = 0;
        for(char ch: s.toCharArray()){
            if(ch == '(') count++;
            if(ch == ')') count--;
            ans = Math.max(ans, count);
        }
        return ans;
    }
}