class Solution {
    public void func(List<String>ans, StringBuffer sb, int n, int open, int close){
        if(sb.length() == 2*n){
            ans.add(new String(sb));
            return;
        }
        if(open<n){
            sb.append('(');
            func(ans, sb, n, open+1, close);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            sb.append(')');
            func(ans, sb, n, open, close+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String>ans = new ArrayList<>();
        func(ans, new StringBuffer(), n, 0, 0);
        return ans;
    }
}