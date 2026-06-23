class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1 = 0, c2 = 0, e1 = Integer.MIN_VALUE, e2 = Integer.MIN_VALUE;
        List<Integer> ans = new ArrayList<>();
        for(int num: nums){
            if(c1==0 && e2!=num){
                e1 = num;
                c1=1;
            }
            else if(c2==0 && e1!=num){
                e2 = num;
                c2=1;
            }
            else if(e1 == num){
                c1++;
            }
            else if(e2 == num){
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1 = 0; 
        c2 = 0;
        for(int num: nums){
            if(e1 == num) c1++;
            if(e2 == num) c2++;
        }
        if(c1>nums.length/3) ans.add(e1);
        if(c2>nums.length/3) ans.add(e2);
        return ans;
    }
}