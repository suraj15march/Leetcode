class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        vector<int>ans;
        int n = matrix.size(), m = matrix[0].size(), sz =0;
        int t=0, b=n-1, l=0, r=m-1;
        while(t<=b && l<=r){
            for(int i=l; i<=r; i++){
                if(sz<n*m)
                ans.push_back(matrix[t][i]);
                sz++;
            }
            t++;
            for(int i=t; i<=b; i++){
                if(sz<n*m)
                ans.push_back(matrix[i][r]);
                sz++;
            }
            r--;
            for(int i=r; i>=l; i--){
                if(sz<n*m)
                ans.push_back(matrix[b][i]);
                sz++;
            }
            b--;
            for(int i=b; i>=t; i--){
                if(sz<n*m)
                ans.push_back(matrix[i][l]);
                sz++;
            }
            l++;
        }
        return ans;
    }
};