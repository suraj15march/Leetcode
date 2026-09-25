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
        for (Pair pair : graph.get(source)) {
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
            Pair p1 = new Pair(equations.get(i).get(1), values[i]);
            Pair p2 = new Pair(equations.get(i).get(0), 1.0 / values[i]);
            graph.computeIfAbsent(equations.get(i).get(0), k -> new ArrayList()).add(p1);
            graph.computeIfAbsent(equations.get(i).get(1), k -> new ArrayList()).add(p2);
        }
        int m = queries.size();
        double[] ans = new double[m];
        for (int i = 0; i < m; i++) {
            ans[i] = dfs(queries.get(i).get(0), queries.get(i).get(1), graph, new HashSet<>());
        }
        return ans;
    }
}