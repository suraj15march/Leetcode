class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0, sum = 0;
        for(int a: costs){
            sum += a;
            if(sum>coins) return count;
            count++;
        }
        return count;
    }
}