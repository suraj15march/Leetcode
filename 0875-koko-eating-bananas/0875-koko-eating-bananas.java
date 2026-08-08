class Solution {
    boolean check(int[] piles, int h, int k){
        for(int num: piles){
            if(num%k==0)
                h -= num/k;
            else
                h -= (num/k)+1;
            if(h<0) return false;
        }
        return h>=0;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int maxEle = 0;
        for (int num : piles) {
            maxEle = Math.max(maxEle, num);
        }
        // while(maxEle>=0 && check(piles, h, maxEle)){
        //     maxEle--;
        // }
        // return maxEle+1;
        int left = 1, right = maxEle;
        int ans = right;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(check(piles, h, mid)){
                ans = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return ans;
    }
}