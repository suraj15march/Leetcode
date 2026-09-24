class Solution {
    int sumOfDigit(int num){
        return num<10?num: num%10+sumOfDigit(num/10);
    }
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(sumOfDigit(nums[i]) == i) return i;
        }
        return -1;
    }
}