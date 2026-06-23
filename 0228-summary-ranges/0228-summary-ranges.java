class Solution {
    public List<String> summaryRanges(int[] nums) {
        if(nums.length == 0) return new ArrayList<>();
        int l = nums[0], h = nums[0];
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]+1){
                sb = new StringBuilder();
                if(l==h){
                    sb.append(l);
                    ans.add(sb.toString());
                }
                else{
                    sb.append(l);
                    sb.append("->");
                    sb.append(h);
                    ans.add(sb.toString());
                }
                sb = new StringBuilder();
                l = nums[i];
            }
            h = nums[i];
        }
        if(l==h){
            sb.append(l);
            ans.add(sb.toString());
        }
        else{
            sb.append(l);
            sb.append("->");
            sb.append(h);
            ans.add(sb.toString());
        }
        return ans;
    }
}