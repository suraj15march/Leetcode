class Solution {
    private int index = 0;

    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder();

        while (index < s.length()) {
            char ch = s.charAt(index);
            index++;

            if (ch == '(') {
                // Recursively get the processed content inside parentheses
                String inner = reverseParentheses(s);
                // Reverse the inner result before appending
                sb.append(new StringBuilder(inner).reverse().toString());
            } else if (ch == ')') {
                // Base case for inner scope: end of current parentheses
                return sb.toString();
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}