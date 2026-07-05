class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = squareSum(slow);
            fast = squareSum(squareSum(fast));
        }while(slow != fast);

        return slow == 1;
    }

    int squareSum(int n){
        int square = 0;
        while(n>0){
            int t = n%10;
            square += t*t;
            n /= 10;
        }
        return square;
    }
}