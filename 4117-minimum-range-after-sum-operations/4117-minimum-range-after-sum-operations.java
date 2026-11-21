class Solution {
    public int minRange(int a, int b, int c) {
        if(a > b+c) return minRange(b+c, b, c);
        if(b > a+c) return minRange(a+c, a, c);
        if(c > a+b) return minRange(a+b, a, b);
        return Math.max(a, Math.max(b, c)) - Math.min(a, Math.min(b, c));
    }
}