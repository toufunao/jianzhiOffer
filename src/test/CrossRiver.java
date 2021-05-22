package test;

import java.util.Arrays;
import java.util.Scanner;

public class CrossRiver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            int[] weight = new int[n];
            int count = 0;
            for (int j = 0; j < n; j++) {
                weight[j] = scanner.nextInt();
            }
            Arrays.sort(weight);

            while (n >= 4) {
                int case1 = weight[0] * 2 + weight[n - 2] + weight[n - 1];
                int case2 = weight[0] + weight[1] * 2 + weight[n - 1];
                count += Math.min(case1, case2);
                n -=2;
            }
            if (n == 3)
                count += weight[0] + weight[1] + weight[2];
            if (n == 2)
                count += weight[1];
            if (n == 1)
                count += weight[0];
            System.out.println(count);
        }
    }
}
