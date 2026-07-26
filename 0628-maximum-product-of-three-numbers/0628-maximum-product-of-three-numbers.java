class Solution {
    public int maximumProduct(int[] nums) {
        int m1 = -1001, m2 = -1001, m3 = -1001, min1 = 1001, min2 = 1001, n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]>m1){
                m3 = m2;
                m2 = m1;
                m1 = nums[i];
            }
            else if(nums[i]>m2){
                m3 = m2;
                m2 = nums[i];
            }
            else if(nums[i]>m3){
                m3 = nums[i];
            }

            // Find top 2 minimums
            if (nums[i] < min1) {
                min2 = min1;
                min1 = nums[i];
            } else if (nums[i] < min2) {
                min2 = nums[i];
            }
        }
        return Math.max(m1*m2*m3, m1*min1*min2);
    }
}