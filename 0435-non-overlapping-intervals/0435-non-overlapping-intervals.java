class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b)->a[1]-b[1]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        int count = -1;
        for(int[]interval : intervals){
            if(interval[0]<end) count++;
            else end = interval[1];
        }
        // System.out.println(Arrays.deepToString(intervals));
        return count;
    }
}