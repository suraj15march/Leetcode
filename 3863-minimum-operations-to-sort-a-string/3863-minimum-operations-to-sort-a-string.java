class Solution {
    public int minOperations(String s) {
        int n = s.length();
        
        // Check if already sorted
        boolean sorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                sorted = false;
                break;
            }
        }
        if (sorted) return 0;
        
        // If length is 2 and not sorted, it's impossible
        if (n == 2) return -1;
        
        char min = s.charAt(0);
        char max = s.charAt(0);
        int mini = 0, maxi = 0;
        
        for (int i = 1; i < n; i++) {
            char c = s.charAt(i);
            if (c < min) {
                min = c;
                mini = i;
            }
            if (c >= max) {
                max = c;
                maxi = i;
            }
        }
        
        // Case 1: Min at start or max at end
        if (s.charAt(0) == min || s.charAt(n - 1) == max) {
            return 1;
        }
        
        // Case 3: Max at start and Min at end uniquely
        if (mini == n - 1 && maxi == 0) {
            int cntMin = 0, cntMax = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == min) cntMin++;
                if (s.charAt(i) == max) cntMax++;
            }
            if (cntMin == 1 && cntMax == 1) {
                return 3;
            }
        }
        
        // Otherwise, 2 operations
        return 2;
    }
}