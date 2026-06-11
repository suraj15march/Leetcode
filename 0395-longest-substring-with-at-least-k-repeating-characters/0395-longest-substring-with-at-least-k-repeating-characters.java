class Solution {
    public int helperFunction(String s, int start, int end, int k){
        int[] arr = new int[26];
        for(int i=start;i<=end;i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=start;i<=end;i++){
            int temp = arr[s.charAt(i)-'a'];
            // if(temp>0 && temp<k){
            //     int j = i+1;
            // }
            if(temp >0 && temp<k)
                return Math.max(helperFunction(s, start, i-1, k), helperFunction(s, i+1, end, k));
        }
        return end-start+1;
    }
    public int longestSubstring(String s, int k) {
        int n = s.length();
        return helperFunction(s,0,n-1,k);
    }
}