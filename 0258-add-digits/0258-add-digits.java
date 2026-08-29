class Solution {
    int add(int n){
        int sum = 0;
        while(n>0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
    public int addDigits(int num) {
        int ans = add(num);
        while(ans>9){
            ans = add(ans);
        }
        return ans;
    }
}