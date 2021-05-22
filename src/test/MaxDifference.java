package test;

import java.util.Arrays;
import java.util.Scanner;

public class MaxDifference {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] people=new int[n];
        for (int i=0;i<n;i++){
            people[i]=scanner.nextInt();
        }
        Arrays.sort(people);
        int p=1;
        int q=n-2;
        while (p<q){
            int t=people[p];
            people[p]=people[q];
            people[q]=t;
            p+=2;
            q-=2;
        }
        long cost=Math.abs(people[0]-people[n-1]);
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(people[0]);
        for (int i = 1; i < n; i++) {
            cost+=Math.abs(people[i]-people[i-1]);
            stringBuilder.append(" ");
            stringBuilder.append(people[i]);
        }
        System.out.println(cost);
        System.out.println(stringBuilder.toString());
    }
}
