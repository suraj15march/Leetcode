import java.util.Stack;

class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        // Push -1 as the initial base index for length calculation
        stack.push(-1);
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                // Push the index of '('
                stack.push(i);
            } else {
                // Pop the matching '(' or previous boundary index
                stack.pop();

                if (stack.isEmpty()) {
                    // If stack is empty, set current index as the new boundary base
                    stack.push(i);
                } else {
                    // Calculate valid length using the index at the top of the stack
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }

        return maxLength;
    }
}