class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int ans = 1, i = 1;
        while(i<n){
            if(ratings[i] == ratings[i-1]){
                ans += 1;
                i++;
                continue;
            }
            int peek = 1;
            while(i<n && ratings[i] > ratings[i-1]){
                peek++;
                ans += peek;
                i++;
            }
            int down = 1;
            while(i<n && ratings[i] < ratings[i-1]){
                ans += down;
                down++;
                i++;
            }
            if(down > peek)
                ans += down - peek;
        }
        return ans;
    }
}