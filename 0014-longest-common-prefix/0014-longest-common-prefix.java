class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int n = strs.length, idx = 0;
        while(idx<strs[0].length()){
            char ch = strs[0].charAt(idx);
            for(int i=1; i<n; i++){
                if(idx==strs[i].length() || strs[i].charAt(idx) != ch)
                    return sb.toString();
            }
            sb.append(ch);
            idx++;
        }
        return sb.toString();
    }
}