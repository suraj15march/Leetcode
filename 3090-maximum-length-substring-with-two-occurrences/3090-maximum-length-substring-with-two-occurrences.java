class Solution {
    public int maximumLengthSubstring(String s) {
        int i = 0, j = 0, n = s.length(), ans = 0;
        int[] map = new int[26];
        while(i<=j && j<n){
            map[s.charAt(j)-'a']++;
            while(map[s.charAt(j)-'a']>2){
                map[s.charAt(i)-'a']--;
                i++;
            }
            j++;
            ans = Math.max(ans, j-i);
        }
        return ans;
    }
}