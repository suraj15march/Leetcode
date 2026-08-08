class StockSpanner {
    List<Integer> list;
    Stack<Integer> stack;
    int size = 0;

    public StockSpanner() {
        list = new ArrayList<>();
        stack = new Stack<>();
    }

    public int next(int price) {
        list.add(price);
        while (!stack.isEmpty() && list.get(stack.peek()) <= price) {
            stack.pop();
        }
        int ans = size+1;
        if(!stack.isEmpty()) 
            ans = size-stack.peek();
        stack.push(size);
        size++;
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */