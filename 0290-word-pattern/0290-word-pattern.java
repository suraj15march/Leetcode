class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();
        String[] strArray = s.split(" ");
        int m = pattern.length(), n = strArray.length;
        if(m != n) return false;
        for(int i=0; i<n; i++){
            char ch = pattern.charAt(i);
            String word = strArray[i];
            if(map1.containsKey(ch)){
                if(!map1.get(ch).equals(word)){
                    return false;
                }
            }
            map1.put(ch, word);

            if(map2.containsKey(word)){
                if(!map2.get(word).equals(ch)){
                    return false;
                }
            }
            map2.put(word, ch);
        }
        return true;
    }
}