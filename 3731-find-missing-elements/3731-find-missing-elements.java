class Solution {
    boolean[] arr = new boolean[101];

    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int min = nums[0], max = nums[0];
        for (int num : nums) {
            arr[num] = true;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        for(int i=min; i<=max; i++){
            if(!arr[i]) ans.add(i);
        }
        return ans;
    }
}