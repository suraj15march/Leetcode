class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ans = new int[n];
        for(int[] booking: bookings){
            for(int i = booking[0]-1; i<booking[1]; i++){
                ans[i] += booking[2];
            }
        }
        return ans;
    }
}