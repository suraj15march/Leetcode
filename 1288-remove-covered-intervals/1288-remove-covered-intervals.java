import java.util.Arrays;

class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(b[1], a[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        int remainingCount = 0;
        int maxEnd = 0;

        for (int[] curr : intervals) {
            if (curr[1] > maxEnd) {
                remainingCount++;
                maxEnd = curr[1];
            }
        }

        return remainingCount;
    }
}