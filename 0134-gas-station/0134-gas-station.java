class Solution {
    public Boolean check(int[] gas, int[] cost, int index) {
        int n = gas.length;
        int i = index;
        int ans = 0;
        do{
            ans += gas[i]-cost[i];
            if(ans<0) return false;
            i = (i+1)%n;
        }while(i!=index);
        return true;
    }
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length, ans=-1;
        if(n==1 && gas[0] == cost[0]) return 0;
        for(int i=0; i<n; i++){
            if(gas[i] - cost[i] > 0){
                if(check(gas, cost, i)) return i;
            }
        }
        return -1;
    }
}