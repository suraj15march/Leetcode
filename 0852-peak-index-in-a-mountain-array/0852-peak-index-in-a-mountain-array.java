class Solution {
    public int peakIndexInMountainArray(int[] a) {
        int n = a.length;
        int left = 0, right = n-1;
        while(left<right){
            int m = (left+right)/2;
            if(a[m]<=a[m+1]){
                left = m+1;
            }
            else{
                right = m;
            }
        }
        return left;
    }
}