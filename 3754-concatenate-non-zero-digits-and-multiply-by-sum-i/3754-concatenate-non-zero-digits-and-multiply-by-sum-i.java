class Solution {
    public long sumAndMultiply(int n) {
        int sum = 0;
        int num = 0;
        int i=1;
        while(n>0){
            int temp = n%10;
            if(temp>0){
                // num *= 10;
                num += i*temp;
                sum += temp;
                i *= 10;
            }
            n /= 10;
        }
        // while(num>0){
        //     n *= 10;
        //     n += num%10;
        //     num/=10;
        // }
        return (long)num*sum;
    }
}