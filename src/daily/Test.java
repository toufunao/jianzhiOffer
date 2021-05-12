package daily;

public class Test {
    public static void main(String[] args){
        XorQuery xorQuery=new XorQuery();
        int[] arr=new int[]{1,3,4,8};
        int[][] queries=new int[][]{{0,1},{1,2},{0,3},{3,3}};
        xorQuery.xorQueries(arr,queries);
    }
}
