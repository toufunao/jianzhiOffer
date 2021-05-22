package test;

import java.util.Arrays;
import java.util.Scanner;

public class MinLength {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] loc=new int[n][2];
        for (int i=0;i<n;i++){
            loc[i][0]=scanner.nextInt();
            loc[i][1]=scanner.nextInt();
        }
        int[] len=new int[n];
        for (int i=0;i<n;i++){
            len[i]=loc[i][0];
        }
        Arrays.sort(len);
        int mid=len.length/2;
        int cost=0;
        for (int i=0;i<mid;i++)
            cost+=len[mid]-len[i];

        for (int i=mid+1;i<n;i++)
            cost+=len[i]-len[mid];

        System.out.println(cost);
    }
}
