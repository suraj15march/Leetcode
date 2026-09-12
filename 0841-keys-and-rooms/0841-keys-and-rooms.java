class Solution {
    void dfs(int start, Set<Integer>set, List<List<Integer>> rooms, int[] ans){
        if(set.contains(start)) return;
        set.add(start);
        ans[0]++;
        List<Integer>list = rooms.get(start);
        for(int i=0; i<list.size(); i++){
            dfs(list.get(i), set, rooms, ans);
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer>set = new HashSet<>();
        int[] ans = new int[1];
        dfs(0, set, rooms, ans);
        return ans[0] == rooms.size();
    }
}