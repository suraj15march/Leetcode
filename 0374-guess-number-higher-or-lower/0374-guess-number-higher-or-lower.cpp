/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

class Solution {
public:
    int func(int a, int b){
        int num = (b-a)/2+a;
        if(guess(num)==1){
            return func(num+1,b);
        }
        else if(guess(num)==-1){
            return func(0,num-1);
        }
        return num;
    }
    int guessNumber(int n) {
        return func(0,n);
    }
};