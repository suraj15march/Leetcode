class Solution {
    public int nextGreaterElement(int n) {
        char[] digits = Integer.toString(n).toCharArray();
        int len = digits.length;
        
        // Step 1: Find the first decreasing element from the right
        int i = len - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }
        
        // If no such element is found, the digits are in descending order
        if (i < 0) return -1;
        
        // Step 2: Find the element just larger than digits[i] from the right
        int j = len - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }
        
        // Step 3: Swap them
        swap(digits, i, j);
        
        // Step 4: Reverse the suffix after index i
        reverse(digits, i + 1, len - 1);
        
        // Step 5: Handle 32-bit integer overflow
        try {
            return Integer.parseInt(new String(digits));
        } catch (NumberFormatException e) {
            return -1;
        }
    }
    
    private void swap(char[] digits, int i, int j) {
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
    }
    
    private void reverse(char[] digits, int start, int end) {
        while (start < end) {
            swap(digits, start, end);
            start++;
            end--;
        }
    }
}