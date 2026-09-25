class Pair {
    String str;
    double num;

    Pair(String str, double num) {
        this.str = str;
        this.num = num;
    }
}

class Solution {
    double dfs(String source, String dest, Map<String, List<Pair>> graph, Set<String> visited) {
        if (!graph.containsKey(source) || !graph.containsKey(dest))
            return -1.0;
        if (source.equals(dest))
            return 1.0;
        visited.add(source);
        List<Pair> list = graph.get(source);
        for (Pair pair : list) {
            if (!visited.contains(pair.str)) {
                double subResult = dfs(pair.str, dest, graph, visited);
                if (subResult != -1)
                    return pair.num * subResult;
            }
        }
        return -1.0;
    }

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, List<Pair>> graph = new HashMap<>();
        int n = values.length;
        for (int i = 0; i < n; i++) {
            List<String> list = equations.get(i);
            Pair p1 = new Pair(list.get(1), values[i]);
            Pair p2 = new Pair(list.get(0), 1.0 / values[i]);
            graph.computeIfAbsent(list.get(0), k -> new ArrayList()).add(p1);
            graph.computeIfAbsent(list.get(1), k -> new ArrayList()).add(p2);
        }
        int m = queries.size();
        double[] ans = new double[m];
        // Set<String> set = new HashSet<>();
        for (int i = 0; i < m; i++) {
            List<String> list = queries.get(i);
            ans[i] = dfs(list.get(0), list.get(1), graph, new HashSet<>());
        }
        return ans;
    }
}