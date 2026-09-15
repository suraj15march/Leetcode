class Solution {
    void dfs(int start, boolean[] visited, Map<Integer, List<Integer>> graph){
        if(visited[start]) return;
        visited[start] = true;
        List<Integer>list = graph.get(start);
        for(int i=0; i<list.size(); i++){
            dfs(list.get(i), visited, graph);
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(isConnected[i][j] == 1){
                    graph.computeIfAbsent(i, (k -> new ArrayList<>())).add(j);
                }
            }
        }
        boolean[] visited = new boolean[n];
        int ans = 0;
        for(int i=0; i<n; i++){
            if(!visited[i]){
                ans++;
                dfs(i, visited, graph);
            }
        }
        return ans;
    }
}