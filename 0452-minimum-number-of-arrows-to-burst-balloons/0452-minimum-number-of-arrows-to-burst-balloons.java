class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int prevStart = points[0][0];
        int prevEnd = points[0][1];
        int n = points.length, arrow = 1;
        for(int i=1; i<n; i++){
            int currStart = points[i][0];
            int currEnd = points[i][1];
            if(currStart > prevEnd){
                arrow ++;
                prevStart = currStart;
                prevEnd = currEnd;
            }
            else{
                prevStart = Math.max(prevStart, currStart);
                prevEnd = Math.min(prevEnd, currEnd);
            }
        }
        return arrow;
    }
}