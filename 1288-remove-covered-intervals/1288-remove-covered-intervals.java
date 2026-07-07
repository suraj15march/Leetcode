class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) ->{
            if(a[0] == b[0]) return Integer.compare(b[1],a[1]);
            return Integer.compare(a[0],b[0]);
        });
        int[][] stack = new int[n][2];
        int size = 0;
        for(int i=0; i<n; i++){
            int[] temp1 = intervals[i];
            if(size == 0){ 
                stack[size++]=temp1;
                continue;
            }
            int[] temp2 = stack[size-1];
            int s1 = temp1[0], e1 = temp1[1];
            int s2 = temp2[0], e2 = temp2[1];
            if((s2>=s1 && e1>=e2) || (s1>=s2 && e2>=e1)) continue;
            stack[size++] = temp1;
        }
        return size;
    }
}