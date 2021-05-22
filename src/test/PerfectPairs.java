package test;

import java.util.*;

/**
 * 观察得两个数得各属性 差得和为相反数时，为完美对
 */
public class PerfectPairs {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int count=0;
        Map<List<Integer>,Integer> map=new HashMap<>();

        int[][] nums=new int[n][k];
        for (int i=0;i<n;i++){
            List<Integer> temp1=new ArrayList<>();
            List<Integer> temp2=new ArrayList<>();
            nums[i][0]=scanner.nextInt();
            for (int j=1;j<k;j++){
                nums[i][j]=scanner.nextInt();
                int gap=nums[i][j]-nums[i][j-1];
                temp1.add(gap);
                temp2.add(-gap);
            }
            count+=map.getOrDefault(temp2,0);
            map.put(temp1,map.getOrDefault(temp1,0)+1);
        }
        System.out.println(count);
    }
}
