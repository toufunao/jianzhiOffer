package test;

import java.util.Scanner;

public class MaxMatrix {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] matrix=new int[3][n];
        for (int i=0;i<3;i++){
            for (int j=0;j<n;j++){
                matrix[i][j]=scanner.nextInt();
            }
        }
        long[][] dp=new long[3][2];
        for (int i=1;i<n;i++){
            for (int j=0;j<3;j++){
                long ans0=Math.abs(matrix[j][i]-matrix[0][i-1])+dp[0][1];
                long ans1=Math.abs(matrix[j][i]-matrix[1][i-1])+dp[1][1];
                long ans2=Math.abs(matrix[j][i]-matrix[2][i-1])+dp[2][1];
                dp[j][0]=Math.min(Math.min(ans0,ans1),ans2);
            }
            dp[0][1]=dp[0][0];
            dp[1][1]=dp[1][0];
            dp[2][1]=dp[2][0];
        }
        System.out.println(Math.min(Math.min(dp[0][1],dp[1][1]),dp[2][1]));
    }
}
