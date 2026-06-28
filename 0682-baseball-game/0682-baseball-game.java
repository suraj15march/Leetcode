class Solution {
    public int calPoints(String[] operations) {
        int ans = 0;
        Stack<Integer> stack = new Stack();
        for(String str: operations){
            switch(str){
                case "C": stack.pop(); break;
                case "D": stack.push(2*stack.peek()); break;
                case "+": int op1 = stack.peek();
                            stack.pop();
                        int op2 = stack.peek();
                        stack.push(op1);
                        stack.push(op1+op2); break;
                default: stack.push(Integer.parseInt(str));
            }
        }
        while(!stack.isEmpty()){
            ans += stack.peek();
            stack.pop();
        }
        return ans;
    }
}