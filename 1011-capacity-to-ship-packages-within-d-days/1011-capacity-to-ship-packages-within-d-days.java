class Solution {
    boolean validateShipCapacity(int[] weights, int days, int capacity){
        int countDays = 1, w=0;
        for(int wt: weights){
            if(wt>capacity) return false;
            if(w+wt>capacity){
                countDays++;
                w=0;
            }
            w+=wt;
        }
        return countDays<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0;
        for(int wt: weights){
            low = Math.max(low, wt);
            high += wt;
        }
        int ans = high;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(validateShipCapacity(weights, days, mid)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}