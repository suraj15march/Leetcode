class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length(), m = t.length();
        if(n!=m) return false;
        int[] arr = new int[26];
        for(int i=0; i<n; i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for(int i=0; i<26; i++){
            if(arr[i]>0) return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int n = s.length(), m = p.length();
        StringBuilder str = new StringBuilder(s);
        for(int i=0; i+m<=n; i++){
            if(isAnagram(str.substring(i,i+m),p)){
                res.add(i);
            }
        }
        return res;
    }
}