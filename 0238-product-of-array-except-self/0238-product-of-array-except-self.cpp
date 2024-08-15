class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> ans;
        long product = 1;
        int index;
        int isZero = 0;
        for(int i=0; i<nums.size();i++){
            ans.push_back(0);
            if(nums[i] == 0){
                index = i;
                isZero++;
                continue;
            }
            // else if(product == 0) product=1;
            product *= nums[i];
        }
        if(isZero>1) return ans;
        if(isZero==1){
            ans[index] = product;
            return ans;
        }
        for(int i=0; i<nums.size();i++){
            ans[i] = product/nums[i];
        }
        return ans;
    }
};