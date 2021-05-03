package jianzhi;

public class CuttingRope_14_II {
    //数学推导
    public int cuttingRope(int n) {
        if(n<=3)
            return n-1;
        if (n==4)
            return 4;
        long ans=1;
        while (n>4){
            ans*=3;
            ans%=1000000007;
            n-=3;
        }
        return (int) (ans*n%1000000007);
    }
}
