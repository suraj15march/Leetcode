class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        Set<Character>set = new HashSet<>();
        int i=0, j=0;
        while(i<=j && j<n){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i++));
            }
            set.add(s.charAt(j));
            j++;
            ans = Math.max(ans, j-i);
        }
        return ans;
    }
}