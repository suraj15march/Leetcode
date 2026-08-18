class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int[] map = new int[51];
        for(int i=0; i<n; i++){
            map[nums[i]]++;
        }
        if(k==1){
            for(int i=50; i>=0; i--){
                if(map[i]==1) return i;
            }
        }
        else if(k==n){
            for(int i=50; i>=0; i--){
                if(map[i]>0) return i;
            }
        }
        else{
            if(map[nums[0]]==1 && map[nums[n-1]]==1) return Math.max(nums[0], nums[n-1]);
            if(map[nums[0]]==1) return nums[0];
            if(map[nums[n-1]]==1) return nums[n-1];
        }
        return -1;
    }
}