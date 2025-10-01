class Solution {
    public int func(int numBottles, int numExchange) {
        if(numBottles < numExchange) return 0;
        int bottle = numBottles/numExchange;
        int rem = numBottles%numExchange;
        return bottle + func(bottle+rem, numExchange);
    }
    public int numWaterBottles(int numBottles, int numExchange) {
        return numBottles + func(numBottles, numExchange);
    }
}