class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int[] arr = new int[n];
        arr[0] = nums.get(0)>0?nums.get(0):0;
        for(int i=1; i<n; i++) {
            arr[i] = arr[i-1] + nums.get(i);
            if(arr[i]<0) arr[i] = 0;
        }
        int ans = Integer.MAX_VALUE;
        for(int i = l-1; i<r; i++){
            if(arr[i]>0)
            ans = Math.min(ans, arr[i]);
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}