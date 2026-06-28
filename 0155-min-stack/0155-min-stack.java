class Pair{
    int key, val;
    Pair(int key, int val){
        this.key = key;
        this.val = val;
    }
    public int getKey(){
        return this.key;
    }
    public int getVal(){
        return this.val;
    }
}

class MinStack {
    Stack<Pair> stack;
    public MinStack() {
        stack = new Stack();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(new Pair(val, val));
            return;
        }
        stack.push(new Pair(val, Math.min(val, getMin())));
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        if(stack.isEmpty())  return -1;
        return stack.peek().getKey();
    }
    
    public int getMin() {
        if(stack.isEmpty())  return -1;
        return stack.peek().getVal();
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