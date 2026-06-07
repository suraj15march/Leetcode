class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n; i++){
            int j = i+1, k = n-1;
            if(i>0 && nums[i]==nums[i-1]){
                // i++;
                continue;
            }
            while(j<k){
                if(k<n-1 && nums[k]==nums[k+1]){
                    k--;
                    continue;
                }
                if(nums[i]+nums[j]+nums[k]>0) k--;
                else if(nums[i]+nums[j]+nums[k]<0) j++;
                else{
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    result.add(temp);
                    j++;
                    k--;
                }
            }
        }
        return result;
    }
}