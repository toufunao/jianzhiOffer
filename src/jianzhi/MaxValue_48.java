package jianzhi;

public class MaxValue_48 {
    public int maxValue(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int[][] dp=new int[row][col];
        for (int i=0;i<row;i++){
            for (int j = 0; j < col; j++) {
                dp[i][j]=grid[i][j];
            }
        }
        for (int i=1;i<row;i++)
            dp[i][0]+=dp[i-1][0];
        for (int i=1;i<col;i++)
            dp[0][i]+=dp[0][i-1];

        for (int i = 1; i < row; i++) {
            for (int j=1;j<col;j++)
                dp[i][j]+=Math.max(dp[i-1][j],dp[i][j-1]);
        }
        return dp[row-1][col-1];
    }
}
