class Solution {
    public int missingInteger(int[] nums) {
        Set<Integer>set = new HashSet<>();
        int ans = nums[0];
        int f = 0;
        set.add(nums[0]);
        for(int i=1; i<nums.length; i++){
            set.add(nums[i]);
            if(nums[i-1] +1 == nums[i] && f==0) ans+=nums[i];
            else f++;
        }
        while(set.contains(ans)){
            ans++;
        }
        return ans;
    }
}