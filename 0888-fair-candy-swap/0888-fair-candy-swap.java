class Solution {
    public int[] fairCandySwap(int[] a, int[] b) {
        int m=a.length, n=b.length;
        int aSum = 0, bSum=0;
        for(int i=0; i<m; i++) aSum+=a[i];
        for(int i=0; i<n; i++) bSum+=b[i];
        int diff = (aSum-bSum)/2;
        Set<Integer>set = new HashSet<>();
        for(int i=0; i<m; i++) set.add(a[i]);
        for(int i=0; i<n; i++){
            if(set.contains(diff+b[i]))
                return new int[]{diff + b[i], b[i]};
        }
        return new int[2];
    }
}