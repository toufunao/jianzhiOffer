package jianzhi;

public class PrintNumbers_17 {
    public int[] printNumbers(int n) {
        int i=0;
        int limit=1;
        while (i<n){
            limit*=10;
            i++;
        }
        int[] ans=new int[limit-1];
        for (int j = 0; j < limit-1; j++) {
            ans[j]=j+1;
        }
        return ans;
    }
}
