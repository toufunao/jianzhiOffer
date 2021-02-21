/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n级的台阶总共有多少种跳法。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */


public class JumpStairs_10_II {
    public int numWays(int n) {
        if (n==1||n==0)
            return 1;
        if (n==2)
            return 2;

        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        for (int i = 3; i < n+1; i++) {
            dp[i]=(dp[i-1]+dp[i-2])%1000000007;
        }
        return dp[n];
    }
}
