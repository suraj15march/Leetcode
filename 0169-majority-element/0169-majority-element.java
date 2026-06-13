class Solution {
    public int majorityElement(int[] nums) {
        int c = 0, n = nums.length;
        int maj = nums[0];
        for(int i=1; i<n; i++){
            if(nums[i] == maj) c++;
            else c--;
            if(c<0){
                maj = nums[i];
                c=0;
            }
        }
        return maj;
    }
}