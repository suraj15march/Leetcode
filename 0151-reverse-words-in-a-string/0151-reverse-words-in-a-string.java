class Solution {
    public String reverseWords(String s) {
        List<String> str = new ArrayList<>(Arrays.asList(s.trim().split("\\s+")));
        Collections.reverse(str);
        return String.join(" ", str);
    }
}