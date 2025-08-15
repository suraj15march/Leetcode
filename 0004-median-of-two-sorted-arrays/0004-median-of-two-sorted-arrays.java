class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length, i=0, j=0, k=0;
        ArrayList<Integer> nums = new ArrayList<Integer>(m+n);
        while(i<n && j<m){
            if(nums1[i] <= nums2[j]){
                nums.add(nums1[i]);
                i++;
            }
            else{
                nums.add(nums2[j]);
                j++;
            }
        }
        while(i<n){
                nums.add(nums1[i]);
                i++;
        }
        while(j<m){
                nums.add(nums2[j]);
                j++;
        }
        if((m+n)%2==1)
            return nums.get((m+n)/2);
        return (nums.get((m+n)/2)+nums.get((m+n)/2-1))/2.0;
    }
}