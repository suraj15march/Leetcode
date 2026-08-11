class Solution {
    public int missingInteger(int[] nums) {
        Set<Integer>set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        int ans = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i-1] +1 != nums[i]) break;
            ans += nums[i];
        }
        while(set.contains(ans)){
            ans++;
        }
        return ans;
    }
}