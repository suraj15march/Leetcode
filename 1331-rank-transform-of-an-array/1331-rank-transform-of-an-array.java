class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] temp = Arrays.copyOf(arr, n);
        Arrays.sort(temp);
        Map<Integer, Integer>map = new HashMap();
        int count=0;
        for(int i=0; i<n; i++){
            if(!map.containsKey(temp[i]))  map.put(temp[i], i+1-count);
            else count++;
        }
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }
}