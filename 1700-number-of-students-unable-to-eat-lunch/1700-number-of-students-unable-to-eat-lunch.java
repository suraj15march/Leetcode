class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int circle = 0, square = 0;
        for(int st: students){
            if(st==0) circle++;
            else square++;
        }
        for(int st: sandwiches){
            if((st ==0 && circle==0) || (st==1 && square == 0))
                break;
            if(st==0) circle--;
            else square--;
        }
        return circle+square;
    }
}