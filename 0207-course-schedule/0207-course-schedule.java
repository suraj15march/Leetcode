class Solution {
    boolean dfs(int start, int[] visited, Map<Integer, List<Integer>> graph){
        if(visited[start] == 1) return false;
        if(visited[start] == 2) return true;
        visited[start] = 1;
        System.out.println(start);
        List<Integer>list = graph.getOrDefault(start, new ArrayList<>());
        for(int i=0; i<list.size(); i++){
            if(!dfs(list.get(i), visited, graph)) return false;
        }
        visited[start] = 2;
        return true;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int[] pre: prerequisites){
            graph.computeIfAbsent(pre[1], k -> new ArrayList()).add(pre[0]);
        }
        // System.out.println(graph);
        int[] visited = new int[numCourses];
        for(int i=0; i<numCourses; i++){
            if(!dfs(i, visited, graph)) return false;
        }
        return true;
    }
}