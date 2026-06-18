class Solution {
    public double angleClock(int hour, int minutes) {
        double ans = Math.abs((30*(hour%12+(double)minutes/60)-(minutes*6)));
        if(ans>180)
            ans = 360-ans;
        return ans;
    }
}