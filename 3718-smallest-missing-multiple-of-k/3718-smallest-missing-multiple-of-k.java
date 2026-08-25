class Solution {
    boolean[] set = new boolean[101];
    public int missingMultiple(int[] nums, int k) {
        for(int num: nums){
            set[num] = true;
        }
        int i=1;
        while(i<=100/k){
            if(!set[k*i]) return k*i;
            i++;
        }
        return k*i;
    }
}