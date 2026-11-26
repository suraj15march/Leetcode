class Solution {
    public boolean canAliceWin(int n) {
        // if(n==10) return true;
        boolean alice = true;
        int t=10;
        while(t>=0 && n>=0){
            n -= t;
            t--;
            alice = !alice;
        }
        return alice;
    }
}