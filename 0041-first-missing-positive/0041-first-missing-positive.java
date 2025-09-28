class Solution {
    public int firstMissingPositive(int[] nums) {
        SortedSet<Integer> set = new TreeSet<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0) set.add(nums[i]);
        }
        int count = 1;
        for(int it: set){
            if(it != count)
                return count;
            count++;
        }
        return count;
    }
}