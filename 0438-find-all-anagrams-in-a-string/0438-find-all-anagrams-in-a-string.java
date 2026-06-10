class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] l1 = new int[26];
        int[] l2 = new int[26];
        int m = s.length(), n = p.length();
        List<Integer> ans = new ArrayList<>();
        if(n>m) return ans;
        for(int i=0; i<n; i++) l2[p.charAt(i)-'a']++;
        for(int i=0; i<m; i++){
            if(i>=n){
                if(Arrays.equals(l1,l2))
                    ans.add(i-n);
                l1[s.charAt(i-n)-'a']--;
            }
            l1[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(l1,l2))
            ans.add(m-n);
        return ans;
    }
}