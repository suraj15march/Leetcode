class Solution {
public:
    int findFirst(vector<int>& nums, int t, int i, int j){
        int m = (i+j)/2;
        if(i>j) return -1;
        if(t>nums[m]){
            return findFirst(nums, t, m+1, j);
        }
        else if(t<nums[m]){
            return findFirst(nums, t, i, m-1);
        }
        else{
            while(m>=0 && nums[m]==t){
                m--;
        }
        }
        return m+1;
    }

    int findLast(vector<int>& nums, int t, int i, int j){
        int m = (i+j)/2;
        if(i>j) return -1;
        if(t>nums[m]){
            return findLast(nums, t, m+1, j);
        }
        else if(t<nums[m]){
            return findLast(nums, t, i, m-1);
        }
        else{
            while(m<nums.size() && nums[m]==t){
            m++;
        }
        }
        return m-1;
    }

    vector<int> searchRange(vector<int>& nums, int t) {
        vector<int> ans;
        int n = nums.size();
        ans.push_back(findFirst(nums, t, 0, n-1));
        ans.push_back(findLast(nums, t, 0, n-1));
        return ans;
    }
};