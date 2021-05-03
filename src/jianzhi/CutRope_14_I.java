package jianzhi;

public class CutRope_14_I {
    public int cuttingRope(int n) {
        if(n<2)
            return 0;
        if (n==2)
            return 1;
        if (n==3)
            return 2;

        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=0;
        dp[2]=1;
        dp[3]=2;

        for (int i = 4; i < n+1; i++) {
            for (int j = 2; j <i ; j++) {
                dp[i]=Math.max(dp[i],Math.max(j*(i-j),j*dp[i-j]));
            }
        }
        return dp[n];
    }
}
