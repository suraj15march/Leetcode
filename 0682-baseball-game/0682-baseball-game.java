class Solution {
    public int calPoints(String[] operations) {
        int ans = 0;
        Stack<Integer> stack = new Stack();
        for(String str: operations){
            switch(str){
                case "C": ans -= stack.peek(); stack.pop(); break;
                case "D": int doubl = 2*stack.peek(); ans += doubl;
                        stack.push(doubl); break;
                case "+": int op1 = stack.peek();
                            stack.pop();
                        int op2 = stack.peek();
                        stack.push(op1);
                        int sum = op1+op2;
                        ans += sum;
                        stack.push(sum); break;
                default: int num = Integer.parseInt(str);
                        ans += num; stack.push(num);
            }
        }
        return ans;
    }
}