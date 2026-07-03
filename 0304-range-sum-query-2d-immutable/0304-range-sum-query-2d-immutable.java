class NumMatrix {
    int[][] mat;

    public NumMatrix(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        mat = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i==0 && j==0)
                    mat[i][j] = matrix[i][j];
                else if(i==0)
                    mat[i][j] = matrix[i][j] + mat[i][j-1];
                else if(j==0)
                    mat[i][j] = matrix[i][j] + mat[i-1][j];
                else
                    mat[i][j] = matrix[i][j] + mat[i][j-1] + mat[i-1][j] - mat[i-1][j-1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        if(col1==0 && row1==0) return mat[row2][col2];
        if(col1 == 0) return mat[row2][col2]-mat[row1-1][col2];
        if(row1 == 0) return mat[row2][col2]-mat[row2][col1-1];
        return mat[row2][col2]+mat[row1-1][col1-1]-mat[row1-1][col2]-mat[row2][col1-1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */