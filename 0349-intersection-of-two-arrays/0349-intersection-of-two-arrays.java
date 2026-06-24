class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] set = new boolean[1001];
        List<Integer> l = new ArrayList<>();
        for(int i: nums1) set[i] = true;
        for(int i: nums2) if(set[i] && !l.contains(i)) l.add(i);

        int[] ans = new int[l.size()];
        int i=0;
        for(int a:l) ans[i++] = a;
        return ans;
    }
}