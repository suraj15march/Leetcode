class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalGas = 0, totalCost = 0;
        int startIndex = 0, currentCost = 0;
        for(int i=0; i<n; i++){
            totalGas += gas[i];
            totalCost += cost[i];
            currentCost += gas[i]-cost[i];
            if(currentCost<0){
                currentCost = 0;
                startIndex = i+1;
            }
        }
        if(totalGas>=totalCost) return startIndex;
        return -1;
    }
}