class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        List<Integer>ans = new ArrayList<>();
        if(tomatoSlices % 2 == 1) return ans;
        int x = tomatoSlices/2 - cheeseSlices;
        int y = cheeseSlices-x;
        if(x<0 || y<0) return ans;
        ans.add(x);
        ans.add(y);
        return ans;
    }
}