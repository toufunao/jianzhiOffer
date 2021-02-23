public class RobotMovingRange_13 {
    public int movingCount(int m, int n, int k) {

        int[][] visited=new int[m][n];

        return dfs(0,0,m,n,k,visited);
    }

    private int dfs(int i, int j, int m, int n, int k, int[][] visited) {
        if (i>=m||j>=n||k<getDigitSum(i)+getDigitSum(j)||visited[i][j]==1)
            return 0;

        visited[i][j]=1;
        return 1+dfs(i+1,j,m,n,k,visited)+dfs(i,j+1,m,n,k,visited);
    }


    private int getDigitSum(int number) {
        int sum=0;
        while (number!=0){
            sum+=number%10;
            number/=10;
        }
        return sum;
    }
}
