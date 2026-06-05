class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];

        int i = 0, j = n-1;
        while(i<j){
            if(nums[i] + nums[j] == target){
                ans[0] = i+1;
                ans[1] = j+1;
                return ans;
            }
            else if(nums[i] + nums[j] > target){
                j--;
            }
            else{
                i++;
            }
        }

        // for (int i=0; i<n; i++){
        //     int temp = target - nums[i];
        //     for(int j=i+1; j<n; j++){
        //         if(temp == nums[j]){
        //             ans[0] = i+1;
        //             ans[1] = j+1;
        //             return ans;
        //         }
        //     }
        // }
        return ans;
    }
}