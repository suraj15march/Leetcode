class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length, ans = 0;
        // if(n==1) return 1;
        Arrays.sort(citations);
        // Collections.reverse(Arrays.asList(citations));
        for(int i=n-1; i>=0; i--){
            // System.out.println(n-1-i);
            if(citations[i]>=n-i){
                ans = n-i;
            }
        }        
        return ans;
    }
}