class Solution {
public:
    double findMedian(vector<int>& nums){
        int n = nums.size();
        if(n%2 == 0){
            return double(nums[n/2-1]+nums[n/2])/2;
        }
        return double(nums[n/2]);
    }
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        vector<int>nums;
        int n = nums1.size(), m = nums2.size(), i = 0, j = 0;
        while(i<n && j<m){
            if(nums1[i]>nums2[j])
                nums.push_back(nums2[j++]);
            else if(nums1[i]<nums2[j])
                nums.push_back(nums1[i++]);
            else {
                nums.push_back(nums1[i++]);
                nums.push_back(nums2[j++]);
            }
        }
        while(i<n){
            nums.push_back(nums1[i++]);
        }
        while(j<m){
            nums.push_back(nums2[j++]);
        }
        return findMedian(nums);
    }
};