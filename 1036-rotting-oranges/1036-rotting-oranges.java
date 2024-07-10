class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        int n = grid.length, m = grid[0].length, fresh = 0;
        LinkedList<int []>list = new LinkedList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 1) fresh++;
                else if(grid[i][j] == 2){
                    list.add(new int[]{i,j});
                }
            }
        }
        if(fresh == 0) return 0;
        int time = 0;
        while(!list.isEmpty() && fresh != 0){
            int size = list.size();
            time++;
            while(size>0){
                int[] t = list.removeFirst();
                size--;
                int i = t[0], j = t[1];
                if(i+1<n && grid[i+1][j]==1){
                    grid[i+1][j] = 2;
                    fresh--;
                    list.add(new int[]{i+1,j});
                }
                if(i-1>=0 && grid[i-1][j]==1){
                    grid[i-1][j] = 2;
                    fresh--;
                    list.add(new int[]{i-1,j});
                }
                if(j+1<m && grid[i][j+1]==1){
                    grid[i][j+1] = 2;
                    fresh--;
                    list.add(new int[]{i,j+1});
                }
                if(j-1>=0 && grid[i][j-1]==1){
                    grid[i][j-1] = 2;
                    fresh--;
                    list.add(new int[]{i,j-1});
                }
            }
        }
        return fresh == 0? time : -1;
    }
}