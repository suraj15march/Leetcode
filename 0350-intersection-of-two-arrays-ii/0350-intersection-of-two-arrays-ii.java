class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] m1 = new int[1001];
        int[] m2 = new int[1001];

        List<Integer> l = new ArrayList<>();

        for(int i: nums1) m1[i]++;
        for(int i: nums2) m2[i]++;

        for(int i: nums1){
            if(m1[i]>0 && m2[i]>0 && !l.contains(i)){
                int t = Math.min(m1[i], m2[i]);
                while(t>0){
                    l.add(i);
                    t--;
                }
            }
        }

        int[] ans = new int[l.size()];
        int i=0;
        for(int a:l) ans[i++] = a;
        return ans;
    }
}