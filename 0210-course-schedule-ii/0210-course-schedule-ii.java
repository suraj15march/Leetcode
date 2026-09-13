class Solution {
    boolean topologicalSort(int start, int[] visited, Stack<Integer>sortedList, List<Integer>[] graph){
        if(visited[start] == 1) return false;
        if(visited[start] == 2) return true;
        visited[start] = 1;
        List<Integer>list = graph[start];
        for(int i=0; i<list.size(); i++){
            if(!topologicalSort(list.get(i), visited, sortedList, graph)) return false;
        }
        sortedList.push(start);
        visited[start] = 2;
        return true;
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph = new ArrayList[numCourses];
        for(int i=0; i<numCourses; i++){
            graph[i] = new ArrayList<>();
        }
        for(int[] pre: prerequisites){
            graph[pre[1]].add(pre[0]);
        }
        int[] visited = new int[numCourses];
        Stack<Integer>sortedList = new Stack<>();
        for(int i=0; i<numCourses; i++){
            if(!topologicalSort(i, visited, sortedList, graph)) return new int[]{};
        }
        int[] ans = new int[numCourses];
        int i=0;
        while(!sortedList.isEmpty()){
            ans[i++] = sortedList.pop();
        }
        return ans;
    }
}