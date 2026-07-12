class ProductOfNumbers {
    List<Integer>list;
    List<Integer>prefixProduct;
    int size;

    public ProductOfNumbers() {
        list = new ArrayList();
        prefixProduct = new ArrayList();
        size = 0;
    }
    
    public void add(int num) {
        list.add(num);
        if(prefixProduct.isEmpty()) prefixProduct.add(1);
        if(num == 0) prefixProduct = new ArrayList();
        else prefixProduct.add(prefixProduct.get(prefixProduct.size()-1)*num);
        size++;
    }
    
    public int getProduct(int k) {
        // int product = 1;
        // for(int i=size-1; i>=0 && i>=size-k; i--){
        //     product *= list.get(i);
        // }
        int n = prefixProduct.size();
        if(k>=n) return 0;
        return prefixProduct.get(n-1)/prefixProduct.get(n-k-1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */