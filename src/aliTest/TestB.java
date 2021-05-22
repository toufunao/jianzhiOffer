package aliTest;

import java.util.*;

public class TestB {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int M=scanner.nextInt();
        int T=scanner.nextInt();
        long[][] inputs=new long[N][4];
        for (int i = 0; i < N; i++) {
            for (int j=0;j<4;j++){
                inputs[i][j]=scanner.nextInt();
            }
        }

    }
}
