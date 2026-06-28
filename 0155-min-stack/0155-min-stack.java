class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack();
        minStack = new Stack();
    }
    
    public void push(int value) {
        if(stack.isEmpty()){
            stack.push(value);
            minStack.push(value);
            return;
        }
        stack.push(value);
        if(value<=getMin()){
            minStack.push(value);
        }
    }
    
    public void pop() {
        if(stack.peek() == getMin()) minStack.pop();
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        if(minStack.isEmpty()) return -1;
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */