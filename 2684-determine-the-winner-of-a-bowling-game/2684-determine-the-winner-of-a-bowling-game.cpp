class Solution {
public:
    int isWinner(vector<int>& p1, vector<int>& p2) {
        int sum1 = 0, sum2 = 0, n = p1.size(), c1 = 0, c2 = 0;
        for(int i=0; i<n; i++){
            if(c1>0){
                sum1 += p1[i];
                c1--;
            }
            if(c2>0){
                sum2 += p2[i];
                c2--;
            }
            sum1 += p1[i];
            sum2 += p2[i];
            if(p1[i]==10){
                c1 = 2;
            }
            if(p2[i]==10){
                c2 = 2;
            }
        }
        if(sum1>sum2) return 1;
        else if(sum2>sum1) return 2;
        return 0;
    }
};