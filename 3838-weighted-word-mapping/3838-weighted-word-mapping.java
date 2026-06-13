class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int n = words.length;
        StringBuilder sb = new StringBuilder();
        char[] ans = new char[n];
        for(int i=0;i<n;i++){
            int sum = 0;
            String s = words[i];
            for(char c: s.toCharArray()){
                sum += weights[c-'a'];
            }
            // System.out.println(sum%26);
            sb.append((char) (25-(sum % 26) + 'a'));
        }
        return sb.toString();
    }
}