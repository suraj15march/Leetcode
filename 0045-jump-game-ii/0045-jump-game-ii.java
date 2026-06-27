class Solution {
    public int jump(int[] nums) {
        int jumps = 0, current = 0, fartest = 0;
        for(int i=0; i<nums.length-1; i++){
            fartest = Math.max(fartest, i+nums[i]);
            if(current == i){
                jumps++;
                current = fartest;
            }
        }
        return jumps;
    }
}