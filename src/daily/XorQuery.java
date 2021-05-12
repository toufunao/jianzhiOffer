package daily;

public class XorQuery {
    public int[] xorQueries(int[] arr, int[][] queries) {

        int n = arr.length;
        int[] xors = new int[n + 1];
        for (int i = 0; i < n; i++) {
            xors[i + 1] = xors[i] ^ arr[i];
        }


        int[] ans=new int[queries.length];
        int count=0;
        for (int i = 0; i < queries.length; i++) {
            ans[count]=xors[queries[i][0]]^xors[queries[i][1]+1];
            count++;
        }
        return ans;
    }
}
