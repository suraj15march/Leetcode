class Solution {
    public int minimumDeletions(int[] nums) {
        int minIndex = 0, maxIndex = 0, n = nums.length;
        int h = (n-1)/2;
        for(int i=0; i<n; i++){
            if(nums[minIndex]<nums[i]) minIndex = i;
            if(nums[maxIndex]>nums[i]) maxIndex = i;
        }
        
        int i = Math.min(minIndex, maxIndex);
        int j = Math.max(minIndex, maxIndex);

        int removeBothFront = j + 1;             
        int removeBothBack = n - i;              
        int removeBothSides = (i + 1) + (n - j); 
        
        return Math.min(removeBothFront, Math.min(removeBothBack, removeBothSides));
    }
}