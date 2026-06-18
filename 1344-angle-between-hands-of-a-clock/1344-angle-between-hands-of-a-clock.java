class Solution {
    public double angleClock(int hour, int minutes) {
        return  Math.abs((30*(hour%12+(double)minutes/60)-(minutes*6)))<180?  Math.abs((30*(hour%12+(double)minutes/60)-(minutes*6))): 360-( Math.abs((30*(hour%12+(double)minutes/60)-(minutes*6))));
    }
}