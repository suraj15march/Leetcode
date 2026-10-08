class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int openCount = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                // Only append if it's NOT the outermost opening parenthesis
                if (openCount > 0) {
                    result.append(c);
                }
                openCount++;
            } else {
                openCount--;
                // Only append if it's NOT the outermost closing parenthesis
                if (openCount > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
}