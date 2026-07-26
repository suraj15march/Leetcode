class Solution {
    public int maximumProduct(int[] nums) {
        int m1 = -1001, m2 = -1001, m3 = -1001, min1 = 1001, min2 = 1001;
        for(int num: nums){
            if(num>m1){
                m3 = m2;
                m2 = m1;
                m1 = num;
            }
            else if(num>m2){
                m3 = m2;
                m2 = num;
            }
            else if(num>m3){
                m3 = num;
            }

            // Find top 2 minimums
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }
        int a = m1*m2*m3, b = m1*min1*min2;
        return a>b?a:b;
    }
}