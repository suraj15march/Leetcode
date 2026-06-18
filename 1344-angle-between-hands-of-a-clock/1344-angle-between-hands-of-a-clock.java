class Solution {
    public double angleClock(int hour, int minutes) {
        double a = 30*(hour%12+(double)minutes/60);
        double b = minutes*6;
        System.out.println(a);
        System.out.println(b);
        double ans = Math.abs(a-b);
        if(ans>180)
            ans = 360-ans;
        return ans;
    }
}