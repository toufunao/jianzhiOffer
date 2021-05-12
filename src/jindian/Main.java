package jindian;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String people = sc.next();
        int group=sc.nextInt();
        String[] splits=people.split(",");
        int[] num=new int[splits.length];
        int total=0;
        for (int i=0;i<splits.length;i++){
            num[i]=Integer.valueOf(splits[i]);
            total+=num[i];
        }

    }
}
