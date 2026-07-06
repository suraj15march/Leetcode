class Solution {
    public String simplifyPath(String path) {
        StringBuilder sb = new StringBuilder();
        String[] strs = path.split("/");
        String[] ans = new String[strs.length];
        int size = 0;
        for(String s: strs){
            if(s.equals("") || s.equals(".")) continue;
            else if(s.equals("..")) {
                size--;
                if(size<0) size=0;
            }
            else ans[size++] = s;
        }
        if(size <= 0) sb.append("/");
        for(int i=0;i<size;i++){
            sb.append("/");
            sb.append(ans[i]);
        }
        return sb.toString();
    }
}