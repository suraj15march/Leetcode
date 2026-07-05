class Solution {
    Stack<Integer> stack;
    public List<String> buildArray(int[] target, int n) {
        stack = new Stack();
        List<String>ans = new ArrayList();
        String push = new String("Push");
        String pop = new String("Pop");
        int j=0;
        for(int i=1; i<=n && j<target.length; i++){
            stack.push(i);
            ans.add(push);
            if(stack.peek() != target[j]){
                stack.pop();
                ans.add(pop);
            }
            else j++;
        }
        return ans;
    }
}