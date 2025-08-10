class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            Integer key = nums[i];
            if(hash.containsKey(target - key)){
                result[0] = hash.get(target-key);
                result[1] = i;
                return result;
            }
            hash.put(key, i);
        }
        return new int[] {-1,-1};
    }
}