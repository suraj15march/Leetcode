class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        ArrayList<int[]>list = new ArrayList();
        int n = intervals.length;
        list.add(intervals[0]);
        for(int i=1; i<n; i++){
            int s1 = list.get(list.size()-1)[0], e1 = list.get(list.size()-1)[1];
            int s2 = intervals[i][0], e2 = intervals[i][1];
            if(e1<s2){
                list.add(new int[]{s2, e2});
            }
            else{
                list.remove(list.size()-1);
                list.add(new int[]{Math.min(s1,s2), Math.max(e1,e2)});
            }
        }
        int[][] ans = new int[list.size()][2];
        for(int i=0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}