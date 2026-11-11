class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        if(cost1+cost2<=costBoth) {
            long a = (long) cost1*need1;
            long b = (long) cost2*need2;
            return a+b;
        }

        long a = (long) costBoth*(Math.max(need1, need2));
        long b = (long) costBoth*(Math.min(need1, need2));
        if(need1 < need2){
            b += (long) (need2-need1)*cost2;
        }
        else{
            b += (long) (need1-need2)*cost1;
        }
        return Math.min(a, b);
    }
}