class Solution {
public:
    int tribonacci(int n) {
        vector<int> temp(38);
        for(int i=0; i<=n; i++){
            if(i==0 || i==1)     temp[i] =i;
            else if(i==2) temp[i] = 1;
            else    temp[i] = temp[i-1]+temp[i-2]+temp[i-3];
        }
        return temp[n];
    }
};