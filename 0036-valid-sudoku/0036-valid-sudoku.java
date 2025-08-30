class Solution {
    public boolean checkRow(char[][] board){
        for(int i=0;i<9;i++){
            List<Character>set = new ArrayList<>();
            for(int j=0;j<9;j++){
                if(board[i][j] == '.') continue;
                else if(set.contains(board[i][j])) return false;
                set.add(board[i][j]);
            }
            // System.out.println(set);
        }
        return true;
    }
    public boolean checkCol(char[][] board){
        for(int i=0;i<9;i++){
            List<Character>set = new ArrayList<>();
            for(int j=0;j<9;j++){
                if(board[j][i] == '.') continue;
                if(set.contains(board[j][i])) return false;
                set.add(board[j][i]);
            }
            // System.out.println(set);
        }
        return true;
    }    
    public boolean checkSeq(char[][] board, int n1, int m1, int n2, int m2){
        List<Character>set = new ArrayList<>();
        for(int i=n1;i<m1;i++){
            for(int j=n2;j<m2;j++){
                if(board[i][j] == '.') continue;
                if(set.contains(board[i][j])) return false;
                set.add(board[i][j]);
            }
        }
        // System.out.println(set);
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        return (checkRow(board) && checkCol(board) && 
                checkSeq(board,0,3,0,3) && 
                checkSeq(board,0,3,3,6) && 
                checkSeq(board,0,3,6,9) && 
                checkSeq(board,3,6,0,3) && 
                checkSeq(board,3,6,3,6) && 
                checkSeq(board,3,6,6,9) && 
                checkSeq(board,6,9,0,3) && 
                checkSeq(board,6,9,3,6) && 
                checkSeq(board,6,9,6,9));
    }
}