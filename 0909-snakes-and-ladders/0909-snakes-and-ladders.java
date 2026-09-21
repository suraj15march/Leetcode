class Solution {
    void traverseBoard(int[][] board, Map<Integer, Integer> map) {
        int n = board.length;
        boolean flag = true;
        int count = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (flag) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] != -1) {
                        map.put(count, board[i][j]);
                    }
                    count++;
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    if (board[i][j] != -1) {
                        map.put(count, board[i][j]);
                    }
                    count++;
                }
            }
            flag = !flag;
        }
    }

    void constructGraph(Map<Integer, List<Integer>> graph, Map<Integer, Integer> map, int n) {
        for (int i = 1; i <= n * n; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = i + 1; j <= i + 6 && j <= n * n; j++) {
                if (map.containsKey(j)) {
                    list.add(map.get(j));
                    continue;
                }
                list.add(j);
            }
            graph.put(i, list);
        }
    }

    int getShortestPath(Map<Integer, List<Integer>> graph, int n) {
        int level = 1;
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        q.offer(1);
        set.add(1);
        while (!q.isEmpty()) {
            int size = q.size();
            while (size>0) {
                List<Integer> list = graph.get(q.poll());
                for (int i = 0; i < list.size(); i++) {
                    int num = list.get(i);
                    if (set.contains(num))
                        continue;
                    if (num == n * n)
                        return level;
                    q.offer(num);
                    set.add(num);
                }
                size--;
            }
            level++;
        }
        return -1;
    }

    public int snakesAndLadders(int[][] board) {
        Map<Integer, Integer> map = new HashMap<>();
        traverseBoard(board, map);
        Map<Integer, List<Integer>> graph = new HashMap<>();
        constructGraph(graph, map, board.length);
        return getShortestPath(graph, board.length);
    }
}