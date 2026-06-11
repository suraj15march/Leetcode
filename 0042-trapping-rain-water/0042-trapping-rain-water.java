class Solution {
    public int trap(int[] h) {
        int i = 0, j = h.length-1;
        int lMax = h[0], rMax = h[j], water = 0;
        while(i<=j){
            if(lMax<rMax){
                lMax = Math.max(lMax,h[i]);
                water += lMax-h[i++];
            }
            else{
                rMax = Math.max(rMax,h[j]);
                water += rMax-h[j--];
            }
        }
        return water;
    }
}