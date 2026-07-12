class ProductOfNumbers {
    List<Integer>list;
    int size;

    public ProductOfNumbers() {
        list = new ArrayList();
        size = 0;
    }
    
    public void add(int num) {
        list.add(num);
        size++;
    }
    
    public int getProduct(int k) {
        int product = 1;
        for(int i=size-1; i>=0 && i>=size-k; i--){
            product *= list.get(i);
        }
        return product;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */