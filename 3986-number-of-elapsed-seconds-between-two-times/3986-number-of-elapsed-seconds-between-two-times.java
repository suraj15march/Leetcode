class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] start = startTime.split(":");
        String[] end = endTime.split(":");
        int ans = 0;
        for(int i=2; i>=0; i--){
            int e = Integer.parseInt(end[i]);
            int s = Integer.parseInt(start[i]);
            int diff = e-s;
            if(i==1) diff = diff*60;
            if(i==0) diff = diff*60*60;
            ans += diff;
        }
        return ans;
    }
}