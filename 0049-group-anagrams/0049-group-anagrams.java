class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String> > map = new HashMap<>();
        int n = strs.length;
        for(int i=0; i<n; i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String sortedStr = new String(ch);
            if(!map.containsKey(sortedStr)) map.put(sortedStr, new ArrayList<>());
            map.get(sortedStr).add(strs[i]);
        }
        ans.addAll(map.values());
        return ans;
    }
}