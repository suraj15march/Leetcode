class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        int ans = 0, n = nums.size(), sum = 0;
        for(int i=0; i<n; i++)
            sum += nums[i];
        for(int i=0; i<nums.size(); i++){
            sum -= nums[i];
            if(sum == ans) return i;
            ans += nums[i];
        }
        return -1;
    }
};