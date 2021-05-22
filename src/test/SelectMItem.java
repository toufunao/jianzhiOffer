package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectMItem {
    static List<List<Integer>> ans;
    static List<Integer> list;
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        ans=new ArrayList<>();
        list=new ArrayList<>();

        dfs(n,m,1);
        for (List l:ans)
            System.out.println(l);
    }

    private static void dfs(int n, int m, int begin) {
        if (m==0){
            for (int i=0;i<list.size();i++){
                System.out.print(list.get(i));
                System.out.print(" ");
            }
            System.out.println();
            return;
        }
        for (int i=begin;i<=n;i++){
            list.add(i);
            dfs(n,m-1,i+1);
            list.remove(list.size()-1);
        }
    }
}
