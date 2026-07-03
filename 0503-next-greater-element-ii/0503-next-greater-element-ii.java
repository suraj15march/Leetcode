class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack();
        stack.push(nums[0]);
        for(int i=2*n-2; i>=0; i--){
            while(!stack.isEmpty() && nums[i%n]>=stack.peek()) stack.pop();
            if(!stack.isEmpty()) ans[i%n] = stack.peek();
            else ans[i%n] = -1;
            stack.push(nums[i%n]);
        }
        return ans;
    }
}