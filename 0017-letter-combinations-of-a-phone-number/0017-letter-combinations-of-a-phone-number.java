class Solution {
    List<String>ans;
    void helper(int index, List<String>list, StringBuilder current){
        if(index>=list.size()){
            ans.add(new String(current.toString()));
            return;
        }
        String str = list.get(index);
        for(int i=0; i<str.length(); i++){
            current.append(str.charAt(i));
            helper(index+1, list, current);
            current.deleteCharAt(current.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        String[] str = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String>list = new ArrayList<>();
        for(char ch: digits.toCharArray()){
            list.add(str[ch-'2']);
        }
        ans = new ArrayList<>();
        helper(0, list, new StringBuilder());
        return ans;
    }
}