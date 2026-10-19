class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        int index = 0, count = 0;
        for(int num: nums){
            if(num<target) index++;
            if(num == target) count++;
        }
        while(count>0){
            ans.add(index);
            index++;
            count--;
        }
        return ans;
    }
}