class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String> > map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            String s = strs[i];
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if(!map.containsKey(key))
                map.put(key, new ArrayList<>());
                
            map.get(key).add(strs[i]);
        }
        for(List<String> list: map.values()){
            ans.add(list);
        }
        return ans;
    }
}