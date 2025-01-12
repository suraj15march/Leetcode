class Solution {
public:
    vector<int> smallerNumbersThanCurrent(vector<int>& nums) {
        int n = nums.size();
        vector<int> v(n,0);
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=i+1; j<n; j++){
                if(nums[j]<nums[i])     count++;
            }
            v[i] = count;
        }
        for(int i=n-1; i>=0; i--){
            int count = 0;
            for(int j=i-1; j>=0; j--){
                if(nums[j]<nums[i])     count++;
            }
            // if(count>v[i])
            v[i] += count;
        }
        return v;
    }
};