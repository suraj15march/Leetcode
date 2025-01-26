class Solution {
public:
    void backtarck(vector<vector<int>>&ans, vector<int>list, vector<int>&nums, int index, int k, int n){
        //base condition
        if(n<0) return;
        if(list.size()==k && n==0){
            ans.push_back(list);
        }

        for(int i=index; i<nums.size();i++){
            if(list.size()>k) break;
            list.push_back(nums[i]);
            backtarck(ans,list,nums,i+1,k,n-nums[i]);
            list.pop_back();
        }
    }
    vector<vector<int>> combinationSum3(int k, int n) {
        vector<vector<int>>ans;
        vector<int>nums = {1,2,3,4,5,6,7,8,9};
        backtarck(ans,vector<int>(),nums,0,k,n);
        return ans;
    }
};