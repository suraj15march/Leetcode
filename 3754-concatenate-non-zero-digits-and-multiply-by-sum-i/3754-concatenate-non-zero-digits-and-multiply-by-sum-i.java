class Solution {
    public long sumAndMultiply(int n) {
        int sum = 0;
        int num = 0;
        while(n>0){
            int temp = n%10;
            if(temp>0){
                num *= 10;
                num += temp;
                sum += temp;
            }
            n /= 10;
        }
        while(num>0){
            n *= 10;
            n += num%10;
            num/=10;
        }
        return (long)n*sum;
    }
}