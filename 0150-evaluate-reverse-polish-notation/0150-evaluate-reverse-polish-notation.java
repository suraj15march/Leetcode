class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack();
        for(String s: tokens){
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int op2 = Integer.parseInt(stack.pop());
                int op1 = Integer.parseInt(stack.pop());
                int ans = 0;
                if(s.equals("+")) ans = op1+op2;
                else if(s.equals("-")) ans = op1-op2;
                else if(s.equals("*")) ans = op1*op2;
                else if(s.equals("/")) ans = op1/op2;
                stack.push(Integer.toString(ans));
            }
            else    stack.push(s);
        }
        return Integer.parseInt(stack.pop());
    }
}