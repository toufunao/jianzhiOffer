package hot100;

public class Islands_200 {
    public int numIslands(char[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        if (row==0 || col==0)
            return 0;

        int num=0;
        for (int i=0;i<row;i++){
            for (int j = 0; j < col; j++) {
                if (grid[i][j]=='1'){
                    num++;
                    dfs(grid,i,j);
                }
            }
        }
        return num;
    }

    private void dfs(char[][] grid, int i, int j) {
        int row=grid.length;
        int col=grid[0].length;

        if (i<0 || j<0 || i>=row || j>=col || grid[i][j]=='0')
            return;

        grid[i][j]='0';
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);

    }
}
