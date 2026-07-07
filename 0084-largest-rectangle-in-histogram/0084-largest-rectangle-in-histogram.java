class Solution {
    public int[] getNSLIndex(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack();
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i])
            stack.pop();
            if(stack.isEmpty()) ans[i] = -1;
            else ans[i] = stack.peek();
            stack.push(i);
        }
        return ans;
    }
    public int[] getNSRIndex(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack();
        int[] ans = new int[n];
        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i])
            stack.pop();
            if(stack.isEmpty()) ans[i] = n;
            else ans[i] = stack.peek();
            stack.push(i);
        }
        return ans;
    }
    public int largestRectangleArea(int[] heights) {
        int n = heights.length, ans = 0;
        int[] nsl = getNSLIndex(heights);
        int[] nsr = getNSRIndex(heights);
        // System.out.println(Arrays.toString(nsr));
        // System.out.println(Arrays.toString(nsl));
        for(int i=0; i<n; i++){
            // int width = heights[i]*(nsl[i]-nsr[i]-1);
            // System.out.print(width);
            // System.out.print(" ");
            ans = Math.max(ans, heights[i]*(nsr[i]-nsl[i]-1));
        }
        return ans;
    }
}