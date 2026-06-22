class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] a = new int[26];
        for(char c: text.toCharArray()){
            a[c-'a']++;
        }
        int ans = a[0];
        char[] s = new char[5];
        ans = Math.min(ans, a[1]);
        ans = Math.min(ans, a['l'-'a']/2);
        ans = Math.min(ans, a['o'-'a']/2);
        ans = Math.min(ans, a['n'-'a']);
        return ans;
    }
}