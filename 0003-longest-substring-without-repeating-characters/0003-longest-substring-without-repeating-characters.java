class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int n = s.length();
        int ans = 0, count = 0;
        int i=0, j=0;
        while(i<=j && j<n){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(!set.contains(ch2)){
                set.add(ch2);
                j++;
            }
            else{
                set.remove(ch1);
                i++;
            }
            ans = Math.max(ans, j-i);
        }
        return ans;
    }
}