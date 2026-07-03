class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap();
        Stack<Integer> stack = new Stack();
        int m = nums1.length, n = nums2.length;
        int[] ans = new int[m];
        int min = nums2[n-1];
        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek()<nums2[i])  stack.pop();
            if(stack.isEmpty()) map.put(nums2[i], -1);
            else map.put(nums2[i], stack.peek());
            stack.push(nums2[i]);
        }

        for(int i=0; i<m; i++){
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}