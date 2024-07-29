class Solution {
public:
    int oddCells(int m, int n, vector<vector<int>>& indices) {
        int ans = 0;
        vector<vector<int>> matrix(m, vector<int>(n,0));
        for(int i=0; i<indices.size(); i++){
            int row = indices[i][0], col = indices[i][1];
            for(int j=0;j<n;j++)
                matrix[row][j]++;
            for(int j=0;j<m;j++)
                matrix[j][col]++;
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]%2)
                    ans++;
            }
        }
        return ans;
    }
};