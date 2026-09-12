class Solution {
    void dfs(int start, int[][] graph, List<Integer>list, List<List<Integer>> ans ){
        list.add(start);
        if(start == graph.length-1){
            ans.add(new ArrayList(list));
            list.remove(list.size()-1);
            return;
        }
        for(int i=0; i<graph[start].length; i++){
            dfs(graph[start][i], graph, list, ans);
        }
        list.remove(list.size()-1);
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(0, graph, new ArrayList<>(), ans);
        return ans;
    }
}