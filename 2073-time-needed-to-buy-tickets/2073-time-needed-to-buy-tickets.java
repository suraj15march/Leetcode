class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0, i = 0, n = tickets.length;
        while(tickets[k]>0){
            if(tickets[i]!=0){
                tickets[i]--;
                count++;
            }   
            i = (i+1)%n;
        }
        return count;
    }
}