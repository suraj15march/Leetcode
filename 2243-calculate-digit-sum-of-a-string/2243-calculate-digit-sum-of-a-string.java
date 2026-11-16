class Solution {
    String getDigitSum(String s){
        int sum = 0;
        for(char ch: s.toCharArray()){
            sum += ch-'0';
        }
        return Integer.toString(sum);
    }

    public String digitSum(String s, int k) {
        int n = s.length();
        if(n <= k) return s;
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i += k){
            int t = i+k<n? i+k:n;
            String subStr = s.substring(i, t);
            sb.append(getDigitSum(subStr));
        }

        return digitSum(sb.toString(), k);
    }
}