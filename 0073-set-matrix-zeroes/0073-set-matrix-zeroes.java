class Solution {
    public void setZeroes(int[][] matrix) {
        Boolean zeroFirstRow = false, zeroFirstCol = false;
        int n = matrix.length, m = matrix[0].length;
        for(int i=0; i<n; i++){
            if(matrix[i][0]==0) zeroFirstCol=true;
        }
        for(int i=0; i<m; i++){
            if(matrix[0][i]==0) zeroFirstRow=true;
        }
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(zeroFirstRow){
            for(int i=0; i<m; i++){
                matrix[0][i] = 0;
            }
        }
        if(zeroFirstCol){
            for(int i=0; i<n; i++){
                matrix[i][0] = 0;
            }
        }
    }
}