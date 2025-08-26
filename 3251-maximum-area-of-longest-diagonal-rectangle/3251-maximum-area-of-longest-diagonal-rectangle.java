class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int ans = 1, lengthMax = 0, breadthMax = 0;
        long diagonalSquare = 1;
        for(int[]lengthBreadth : dimensions){
            int length = lengthBreadth[0];
            int breadth = lengthBreadth[1];
            long temp = (length*length + breadth*breadth);
            if(diagonalSquare < temp || (diagonalSquare == temp && ans < length*breadth)){
                diagonalSquare = temp;
                lengthMax = length;
                breadthMax = breadth;
                ans = lengthMax*breadthMax;
            }
        }
        return ans;
    }
}