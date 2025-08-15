class Solution {
    public int lengthOfLongestSubstring(String s) {
        int curr = 0, result = 0, n=s.length();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0; i<n; i++){
            if(map.containsKey(s.charAt(i))){
                // int a = map.get(s.charAt(i));
                // map.put(s.charAt(i),i);
                curr = Math.max(map.get(s.charAt(i))+1,curr);
            }
            map.put(s.charAt(i),i);
            result = Integer.max(i-curr+1, result);
            // else
            //     map.put(s.charAt(i),i);
        }
        // for(int value: map.values()){
        //     result = Integer.min(result, value);
        // }
        return result;
    }
}